package backjoon;
//2675 문자열 반복
//https://www.acmicpc.net/problem/2675
import java.util.Scanner;

public class Backjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			String str = sc.next();

			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < num; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}