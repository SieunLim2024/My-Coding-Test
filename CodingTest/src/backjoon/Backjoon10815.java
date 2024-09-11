package backjoon;
//10815 숫자 카드

//숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 
//이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

import java.util.HashMap;
import java.util.Scanner;

public class Backjoon10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		HashMap<String, Integer> owned = new HashMap<>();

		for (int i = 0; i < n; i++) {
			owned.put(sc.next(), 0);
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			if (owned.get(sc.next()) != null) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
	}
}
