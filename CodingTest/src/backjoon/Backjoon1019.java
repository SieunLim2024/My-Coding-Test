package backjoon;

import java.util.Scanner;
//1019 책 페이지
//지민이는 전체 페이지의 수가 N인 책이 하나 있다. 첫 페이지는 1 페이지이고, 마지막 페이지는 N 페이지이다. 
//각 숫자가 전체 페이지 번호에서 모두 몇 번 나오는지 구해보자.

//입력
//첫째 줄에 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

//출력
//첫째 줄에 0이 총 몇 번 나오는지, 1이 총 몇 번 나오는지, ..., 9가 총 몇 번 나오는지를 공백으로 구분해 출력한다.
public class Backjoon1019 {
	static int[] arr = new int[10];
	static int point = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int page = sc.nextInt();
		int start = 1;
		while (start <= page) {
			while (start % 10 != 0 && start <= page) {
				cal(start);
				start++;
			}
			if (page < start) {
				break;
			}
			while (page % 10 != 9 && start <= page) {
				cal(page);
				page--;
			}

			page /= 10;
			start /= 10;

			for (int i = 0; i < 10; i++) {
				arr[i] += (page - start + 1) * point;
			}
			point *= 10;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10; i++)
			builder.append(arr[i] + " ");

		System.out.println(builder.toString());
	}

	public static void cal(int num) {
		while (num > 0) {
			arr[num % 10] += point;
			num /= 10;
		}
	}
}
