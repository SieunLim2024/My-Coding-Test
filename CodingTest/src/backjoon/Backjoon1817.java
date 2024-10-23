package backjoon;

import java.util.Scanner;

//1817 잠을 챙기는 숌
//https://www.acmicpc.net/problem/1817

public class Backjoon1817 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // 책의 개수
		int M = scanner.nextInt(); // 박스의 최대 무게

		if (N == 0) {
			System.out.println(0);
			return;
		}

		int box = 1;
		int weight = 0;

		for (int i = 0; i < N; i++) {
			int book = scanner.nextInt();
			if (weight + book > M) {
				box++;
				weight = 0;
			}
			weight += book;
		}

		System.out.println(box);
	}
}
