package ch01;

import java.util.Scanner;

// 1. 함수형 인터페이스 선언
@FunctionalInterface
interface MaxOperation {
	int max(int x, int y);
}

public class MaxValueFinder {

	public static void main(String[] args) {

		// 2. 람다식 설계 : 두 수를 비교하여 큰 값을 반환하는 식 작성
		MaxOperation a = (int x, int y) -> {
			if (x > y) {
				return x;
			} else if (y > x) {
				return y;
			} else {
				throw new IllegalArgumentException("numbers are same");
			}
		};

		// 3. 데이터 입력
		Scanner scanner = new Scanner(System.in);

		System.out.println("first num : ");
		int num1 = scanner.nextInt();

		System.out.println("second num : ");
		int num2 = scanner.nextInt();

		// 4. 람다식 호출 및 결과 출력

		System.out.println(a.max(num1, num2));
		scanner.close();

	}

}