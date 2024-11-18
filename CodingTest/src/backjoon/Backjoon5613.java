package backjoon;
//5613 계산기 프로그램
//https://www.acmicpc.net/problem/5613
import java.util.Scanner;

public class Backjoon5613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNum = Integer.parseInt(sc.nextLine());
		int result = firstNum;
		String operator = sc.nextLine();

		while (!operator.equals("=")) {
			int nextNum = Integer.parseInt(sc.nextLine());
			switch (operator) {
			case "+":
				result += nextNum;
				break;
			case "-":
				result -= nextNum;
				break;
			case "*":
				result *= nextNum;
				break;
			case "/":
				result /= nextNum;
				break;
			default:
				System.out.println("유효하지 않은 입력값 입니다.");
				break;
			}
			operator = sc.nextLine();
		}
		System.out.println(result);
	}
}