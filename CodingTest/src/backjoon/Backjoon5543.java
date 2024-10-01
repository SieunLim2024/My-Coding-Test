package backjoon;

import java.util.*;
//5543 상근날드
//상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 
//가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.

//햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.

//햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
public class Backjoon5543 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];

		int bm = Integer.MAX_VALUE, dm = Integer.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			burger[i] = sc.nextInt();

			if (bm > burger[i]) {
				bm = burger[i];
			}
		}
		for (int i = 0; i < 2; i++) {
			drink[i] = sc.nextInt();
			if (dm > drink[i])
				dm = drink[i];
		}
		System.out.println(bm + dm - 50);
	}
}
