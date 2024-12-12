package backjoon;
//1697 숨바꼭질
//https://www.acmicpc.net/problem/1697
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon1697 {

	public static void main(String[] args) {
		int N, K;
		int visited[] = new int[100001];
		int count = 0;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		K = in.nextInt();
		if (N == K) {
			System.out.println(0);
		} else {
			Queue<Integer> Q = new LinkedList<>();
			Q.offer(N);

			visited[N] = 1;

			while (!Q.isEmpty()) {
				int now = Q.poll();

				for (int i = 0; i < 3; i++) {
					int next;
					if (i == 0) {
						next = now + 1;
					} else if (i == 1) {
						next = now - 1;
					} else {
						next = now * 2;
					}

					if (next == K) {
						System.out.println(visited[now]);
						return;
					}

					if (next < 0 || next > 100000)
						continue;
					if (visited[next] != 0)
						continue;

					Q.offer(next);
					visited[next] = visited[now] + 1;
				}
			}
		}
	}
}
