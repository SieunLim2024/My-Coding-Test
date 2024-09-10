package backjoon;

import java.util.Scanner;
//2738 행렬 덧셈
//N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
public class Backjoon2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j;

		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[][] = new int[n][m];
		int b[][] = new int[n][m];
		int sum[][] = new int[n][m];

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		sc.close();

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}
}