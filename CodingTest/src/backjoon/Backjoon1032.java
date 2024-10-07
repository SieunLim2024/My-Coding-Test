package backjoon;

import java.util.Scanner;
//1032 명령 프롬프트
//https://www.acmicpc.net/problem/1032
public class Backjoon1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		String[] strArr = new String[test];

		for (int i = 0; i < test; i++) {
			strArr[i] = sc.next();
		}

		StringBuilder sb = new StringBuilder();
		boolean isSame = true;

		for (int i = 0; i < strArr[0].length(); i++) {
			for (int j = 1; j < test; j++) {
				isSame = true;
				if (strArr[0].charAt(i) != strArr[j].charAt(i)) {
					isSame = false;
					break;
				}

				if (isSame) {
					sb.append(strArr[0].charAt(i));
				} else {
					sb.append("?");
				}
			}
			System.out.println(sb);
		}
	}
}
