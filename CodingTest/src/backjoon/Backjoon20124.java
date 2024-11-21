package backjoon;
//20124 모르고리즘 회장님 추천 받습니다
//https://www.acmicpc.net/problem/20124
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon20124 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Node[] node = new Node[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			node[i] = new Node(score, name);
		}

		Arrays.sort(node);
		System.out.println(node[0].name);
	}

	static class Node implements Comparable<Node> {
		int score;
		String name;

		public Node(int score, String name) {
			this.score = score;
			this.name = name;
		}

		@Override
		public int compareTo(Node o) {
			if (this.score == o.score)
				return this.name.compareTo(o.name);
			else
				return o.score - this.score;
		}
	}
}
