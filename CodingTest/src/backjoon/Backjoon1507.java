package backjoon;

import java.util.*;
//1507 궁금한 민호
//https://www.acmicpc.net/problem/1507

public class Backjoon1507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] dist = new int[n][n];
		int[][] original = new int[n][n];
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist[i][j] = sc.nextInt();
				original[i][j] = dist[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (i == j || i == k || k == j) {
						continue;
					}

					if (dist[i][j] > dist[i][k] + dist[k][j]) {
						System.out.println(-1);
						return;
					}

					if (dist[i][k] + dist[k][j] == dist[i][j]) {
						original[i][j] = -1;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (original[i][j] == 0 || original[i][j] == -1) {
					continue;
				}
				answer += original[i][j];
			}
		}

		System.out.println(answer);
	}
}
