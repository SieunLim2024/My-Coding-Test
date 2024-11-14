package backjoon;
//13034 다각형 게임
//https://www.acmicpc.net/problem/13034
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon13034 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] dp = new int[1001];
		dp[0] = dp[1] = 0;
		dp[2] = 1;

		int N = Integer.parseInt(br.readLine());
		boolean[] check = new boolean[16];
		for (int i = 3; i <= N; i++) {
			Arrays.fill(check, false);

			for (int j = 0; j <= i - 2; j++) {
				int temp = dp[j] ^ dp[i - 2 - j];
				check[temp] = true;
			}

			for (int j = 0; j < 16; j++) {
				if (!check[j]) {
					dp[i] = j;
					break;
				}
			}
		}

		bw.write(dp[N] != 0 ? "1\n" : "2\n");
		bw.close();
		br.close();
	}

}
