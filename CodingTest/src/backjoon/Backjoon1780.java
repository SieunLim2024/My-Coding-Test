package backjoon;
//1780 종이의 개수
//https://www.acmicpc.net/problem/1780
import java.util.*;

public class Backjoon1780 {
	static int[][] paper;
	static int[] cnt = new int[3];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		paper = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				paper[i][j] = scan.nextInt();
			}
		}
		go(0, 0, n);
		for (int i = 0; i < 3; i++) {
			System.out.println(cnt[i]);
		}
	}

	public static void go(int x, int y, int n) {
		if (check(x, y, n)) {
			cnt[paper[x][y] + 1] += 1;
			return;
		}
		int m = n / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				go(x + i * m, y + j * m, m);
			}
		}
	}

	public static boolean check(int x, int y, int n) {
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (paper[x][y] != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
