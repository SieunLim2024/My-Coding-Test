package backjoon;
import java.util.*;
//23812 골뱅이 찍기 - 돌아간 ㅍ
//서준이는 아빠로부터 골뱅이가 들어 있는 상자를 생일 선물로 받았다. 상자 안에는 반시계 방향으로 90도 돌아간 ㅍ자 모양의 골뱅이가 들어있다. 
//돌아간 ㅍ자 모양은 가로 및 세로로 각각 5개의 셀로 구성되어 있다. 상자에는 정사각형 모양의 셀의 크기를 나타내는 숫자 하나가 적혀있다. 
//셀의 크기 N이 주어지면 예제 출력과 같은 방식으로 골뱅이 모양을 출력하시오.
public class Backjoon23812 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n * 5; i++) {
			if (i <= n * 1) {
				System.out.println("@".repeat(n) + " ".repeat(n * 3) + "@".repeat(n));
			} else if (i <= n * 2) {
				System.out.println("@".repeat(n * 5));
			} else if (i <= n * 3) {
				System.out.println("@".repeat(n) + " ".repeat(n * 3) + "@".repeat(n));
			} else if (i <= n * 4) {
				System.out.println("@".repeat(n * 5));
			} else {
				System.out.println("@".repeat(n) + " ".repeat(n * 3) + "@".repeat(n));
			}
		}
	}
}
