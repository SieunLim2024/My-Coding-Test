package backjoon;
//25214 크림 파스타
//https://www.acmicpc.net/problem/25214

import java.util.Scanner;

public class Backjoon25214 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = Integer.MAX_VALUE;
		int ans = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int cur = scanner.nextInt();
			if (min > cur) {
				min = cur;
			} else {
				ans = Math.max(ans, cur - min);
			}
			sb.append(ans).append(' ');
		}
		scanner.close();
		System.out.println(sb);
	}
}
