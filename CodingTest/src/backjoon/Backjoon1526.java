package backjoon;

import java.util.Scanner;
//1526 가장 큰 금민수
//https://www.acmicpc.net/problem/1526
public class Backjoon1526 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = N; i >= 4; i--) {
			boolean flag = true;
			int num = i;
			while (num != 0) {
				if (num % 10 == 4 || num % 10 == 7)
					num /= 10;
				else {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(i);
				break;
			}
		}
	}
}
