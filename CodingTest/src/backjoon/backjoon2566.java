package backjoon;

import java.util.*;

//2566번 최댓값

//9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
//이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.

//입력
//첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.

//출력
//첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 
//최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
public class backjoon2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int x = 1;
		int y = 1;

		for (int j = 1; j <= 9; j++) {
			for (int k = 1; k <= 9; k++) {
				int input = sc.nextInt();
				if (input >= max) {
					max = input;
					x = k;
					y = j;

				}
			}
		}
		System.out.println(max + "\n" + y + " " + x);
	}

}
