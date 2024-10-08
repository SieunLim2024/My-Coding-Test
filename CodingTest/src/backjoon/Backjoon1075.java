package backjoon;

import java.util.Scanner;
//1075 나누기
//두 정수 N과 F가 주어진다. 지민이는 정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다. 
//만약 가능한 것이 여러 가지이면, 뒤 두 자리를 가능하면 작게 만들려고 한다.
//예를 들어, N=275이고, F=5이면, 답은 00이다. 200이 5로 나누어 떨어지기 때문이다. 
//N=1021이고, F=11이면, 정답은 01인데, 1001이 11로 나누어 떨어지기 때문이다.
public class Backjoon1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= 100) {
			while (true) {
				if (a % 100 == 0) {
					break;
				}
				a = a - 1;
			}
			while (true) {
				if (a % b == 0) {
					break;
				}
				a = a + 1;
			}
		}
		if (a % 100 < 10) {
			System.out.print("0");
			System.out.println(a % 100);
		} else {
			System.out.println(a % 100);
		}
		sc.close();
	}
}
