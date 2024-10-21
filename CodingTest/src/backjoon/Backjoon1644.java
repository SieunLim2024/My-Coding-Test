package backjoon;

import java.util.*;
//1644 소수의 연속합
//https://www.acmicpc.net/problem/1644

public class Backjoon1644 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] prime = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			if (prime[i])
				continue;
			for (int j = i + i; j <= N; j += i) {
				prime[j] = true;
			}
		}
		Queue<Integer> queue = new LinkedList<>();
		int j = 2, result = 0, sum = 0;
		while (!queue.isEmpty() || j <= N) {
			if (sum < N && j <= N) {
				if (!prime[j]) {
					sum += j;
					queue.add(j);
				}
				j++;
			} else if (sum == N) {
				result++;
				sum -= queue.poll();

			} else {
				sum -= queue.poll();
			}
		}
		System.out.println(result);
	}
}
