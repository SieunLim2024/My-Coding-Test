package backjoon;
//1541번 잃어버린 괄호
//https://www.acmicpc.net/problem/1541
import java.util.Scanner;

public class Backjoon1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = Integer.MAX_VALUE;	
		String[] subtraction = sc.nextLine().split("-");
		for (int i = 0; i < subtraction.length; i++) {
			int temp = 0;
			String[] addition = subtraction[i].split("\\+");
			for (int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
}
