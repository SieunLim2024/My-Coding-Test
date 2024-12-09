package backjoon;
//1912 연속합
//https://www.acmicpc.net/problem/1912
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon1912 {
	public static void main(String[] args) throws IOException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];
		int d[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		d[0] = a[0];
		for (int i = 1; i < n; i++) {
			if (d[i - 1] + a[i] < a[i]) {
				d[i] = a[i];
			} else {
				d[i] = d[i - 1] + a[i];
			}
		}

		int ans = -1001;

		for (int i = 0; i < n; i++) {
			if (ans < d[i])
				ans = d[i];
		}

		System.out.println(ans);
	}
}
