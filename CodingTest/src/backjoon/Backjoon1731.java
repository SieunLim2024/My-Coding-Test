package backjoon;
//1731 추론
//https://www.acmicpc.net/problem/1731
import java.util.Scanner;

public class Backjoon1731 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] n = new int[num];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		sc.close();

		if (n[2] - n[1] == n[1] - n[0])
			System.out.println(n[n.length - 1] + (n[1] - n[0]));
		else
			System.out.println(n[n.length - 1] * (n[1] / n[0]));
	}
}
