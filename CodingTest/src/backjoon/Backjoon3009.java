package backjoon;

import java.util.Scanner;
//3009 네 번째 점
//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
public class Backjoon3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();

		int x4 = 0;
		int y4 = 0;


		if (x1 == x2) {
			x4 = x3;
		} else if (x2 == x3) {
			x4 = x1;
		} else {
			x4 = x2;
		}

		if (y1 == y2) {
			y4 = y3;
		} else if (y2 == y3) {
			y4 = y1;
		} else {
			y4 = y2;
		}
		System.out.println(x4 + " " + y4);
	}

}
