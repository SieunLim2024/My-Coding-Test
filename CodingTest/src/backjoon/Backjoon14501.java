package backjoon;
//14501 퇴사
//https://www.acmicpc.net/problem/14501
import java.io.IOException;
import java.util.Scanner;

public class Backjoon14501 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}

		int[] dp = new int[N + 1];

		for (int i = 0; i < N; i++) {
			if (i + T[i] <= N) {
				dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
			}
			dp[i + 1] = Math.max(dp[i + 1], dp[i]);

		}
		System.out.println(dp[N]);
	}
}
