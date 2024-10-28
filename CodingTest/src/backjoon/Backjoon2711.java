package backjoon;
//2711 오타맨 고창영
//https://www.acmicpc.net/problem/2711
import java.util.Scanner;

public class Backjoon2711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();
			String str = sc.next();

			System.out.println(new StringBuffer(str).deleteCharAt(index - 1));
		}

		sc.close();
	}
}
