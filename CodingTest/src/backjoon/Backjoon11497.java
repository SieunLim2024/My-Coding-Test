package backjoon;
//11497 통나무 건너뛰기
//https://www.acmicpc.net/problem/11497
import java.io.*;
import java.util.*;

public class Backjoon11497 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			Deque<Integer> deq = new LinkedList<Integer>();
			Integer[] arr = new Integer[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr, Collections.reverseOrder());
			for (int i = 0; i < N; i++) {
				if (i % 2 == 0) {
					deq.addFirst(arr[i]);
				} else {
					deq.addLast(arr[i]);
				}
			}

			deq.addLast(deq.getFirst());
			int d = 0;
			for (int i = 0; i < N; i++) {
				int a = deq.removeFirst();
				int b = deq.removeFirst();
				d = Math.max(Math.abs(a - b), d);
				deq.addFirst(b);
			}
			System.out.println(d);
		}

	}
}
