package backjoon;
//1427 소트인사이드
//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
import java.util.*;
public class Backjoon1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[10];
		
		int N = sc.nextInt();
		
		while (N!=0) {
			count[N%10]++;
			N/=10;
		}
		
		for(int i =9; i>=0;i--) {
			while(count[i]-- >0) {
				System.out.print(i);
			}
		}
	}
}
