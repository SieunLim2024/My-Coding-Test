package backjoon;
//8958 OX퀴즈 
//https://www.acmicpc.net/problem/8958
import java.util.Scanner;

public class Backjoon8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String arr[] = new String[in.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;	
			int sum = 0;	
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
