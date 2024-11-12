package backjoon;
//1357 뒤집힌 덧셈
//https://www.acmicpc.net/problem/1357
import java.util.Scanner;

public class Backjoon1357 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println(rev(rev(X)+rev(Y)));
	}
	public static int rev(int num) {
		int rev = 0;
		for(int i=1;;i++) {
			rev*=10;
			rev+=num%10;
			num/=10;
			if(num<=0) {
				break;
			}
		}
		return rev;
	}
}
