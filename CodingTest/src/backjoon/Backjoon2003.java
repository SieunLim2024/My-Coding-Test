package backjoon;
//2003 수들의 합 2
//https://www.acmicpc.net/problem/2003
import java.util.Scanner;

public class Backjoon2003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0, end = 0, count = 0, sum = 0;

		while (start < N) {
			if (sum > M || end == N)
				sum -= arr[start++];
			else
				sum += arr[end++];

			if (sum == M)
				count++;
		}

		System.out.println(count);

	}
}
