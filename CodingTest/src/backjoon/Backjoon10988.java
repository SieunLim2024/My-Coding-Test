package backjoon;
//10988 팰린드롬인지 확인하기
//알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
//팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
//level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
import java.util.Scanner;

public class Backjoon10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.close();
		int len = str.length();
		int ans = 1;

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != sb.charAt(i)) {
				ans = 0;
			}
		}
		System.out.println(ans);

	}
}