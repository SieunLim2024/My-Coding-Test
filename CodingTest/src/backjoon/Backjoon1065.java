package backjoon;
import java.util.*;
//1065 한수
//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
//N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
public class Backjoon1065 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int cnt = 0; // 한수 카운팅
		 
		if (num < 100) {
			System.out.println(num);
		}else {
			cnt = 99;
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
}
