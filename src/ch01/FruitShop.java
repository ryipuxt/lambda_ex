package ch01;

import java.util.function.Function;

public class FruitShop {

	public static void main(String[] args) {

		// 함수형 인터페이스 Function<T, R>

		// 1. 각 괘일의 가격을 람다식으로 만들어보자
		// 예 : 사과 1개는 1200원이다
		Function<Integer, Integer> applePrice = x -> x * 1200;
		Function<Integer, Integer> bananaPrice = x -> x * 500;
		Function<Integer, Integer> orangePrice = x -> x * 800;

		// 2. 사용 부분 - 각 과일을 10개씩 구매했을 때 가격을 계산
		System.out.println("사과 10 : " + applePrice.apply(10));
		System.out.println("바나나 10 : " + bananaPrice.apply(10));
		System.out.println("오렌지 10 : " + orangePrice.apply(10));

		// 3. 10% 할인을 적용하는 람다식 작성
		Function<Integer, Integer> discount = price -> (int) (price * 0.9);

		// 4. 할인된 금액 출력
		System.out.println("사과 10 할인가 : " + discount.apply(applePrice.apply(10)));
		System.out.println("바나나 10 할인가 : " + discount.apply(bananaPrice.apply(10)));
		System.out.println("오렌지 10 할인가 : " + discount.apply(orangePrice.apply(10)));

	}

}
