package backjoon;

//2602 돌다리 건너기
//https://www.acmicpc.net/problem/2602
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Backjoon2602 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = { br.readLine(), br.readLine() };
		int ans = 0;
		for (int select = 0; select <= 1; select++) {
			int[][] cnt = new int[s.length() + 1][arr[0].length() + 1];
			Arrays.fill(cnt[0], 1);
			for (int i = 1; i <= s.length(); i++) {
				String cur = arr[(i - select) & 1];
				for (int j = 1; j <= cur.length(); j++)
					cnt[i][j] = cnt[i][j - 1] + (cur.charAt(j - 1) == s.charAt(i - 1) ? cnt[i - 1][j - 1] : 0);
			}
			ans += cnt[s.length()][arr[0].length()];
		}
		System.out.println(ans);
	}
}