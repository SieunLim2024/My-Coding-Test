package backjoon;
//2302 극장 좌석
//https://www.acmicpc.net/problem/2302
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon2302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		int[] fix = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			fix[i] = Integer.parseInt(br.readLine());
		}

		int[] count = new int[50];
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;
		for (int i = 3; i <= N; i++) {
			count[i] = count[i - 1] + count[i - 2];
		}

		long answer = 1;
		for (int i = 1; i <= M; i++) {
			int fixCnt = fix[i] - fix[i - 1] - 1;
			answer *= count[fixCnt];
		}
		answer *= count[N - fix[M]];

		System.out.println(answer);
	}
}
