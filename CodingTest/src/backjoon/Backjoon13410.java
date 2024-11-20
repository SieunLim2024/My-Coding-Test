package backjoon;
//13410 거꾸로 구구단
//https://www.acmicpc.net/problem/13410

import java.util.Scanner;

public class Backjoon13410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[K];

		for (int i = 1; i <= K; i++) {
			arr[i - 1] = N * i;
		}
		int[] arrReverse = new int[K];
		for (int i = 1; i <= K; i++) {
			String s = String.valueOf(arr[i - 1]);
			char[] sChars = new char[s.length()];
			int index = 0;
			for (int j = s.length() - 1; j >= 0; j--) {
				sChars[index] = s.charAt(j);
				index++;
			}
			String reverseNumString = "";
			for (int j = 0; j < sChars.length; j++) {
				reverseNumString += sChars[j];
			}
			arrReverse[i - 1] = Integer.parseInt(reverseNumString);
		}
		int max = 0;
		for (int i = 0; i < arrReverse.length; i++) {
			if (max < arrReverse[i]) {
				max = arrReverse[i];
			}
		}
		System.out.println(max);
	}
}
