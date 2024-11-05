package backjoon;
//4504 배수 찾기 
//https://www.acmicpc.net/problem/4504
import java.util.Scanner;

public class Backjoon4504 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine().trim());

		while (true) {
			int data = Integer.parseInt(sc.nextLine().trim());

			if (data == 0)
				break;

			if (data % input == 0) {
				System.out.println(data + " is a multiple of " + input + ".");
			} else {
				System.out.println(data + " is NOT a multiple of " + input + ".");
			}
		}
	}

}
