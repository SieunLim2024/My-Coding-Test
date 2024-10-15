package backjoon;

import java.util.Scanner;
//1316 그룹 단어 체커
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
//kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
//aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오
public class Backjoon1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=num;

		for(int c = 0;c<num;c++) {
			String st = sc.next();
			boolean test[] = new boolean[26];

			for(int i=0;i<st.length()-1;i++) {
				if(st.charAt(i)!=st.charAt(i+1)) {
					if(test[st.charAt(i+1)-97]==true) {
						cnt--;
						break;
					}
				}
				test[st.charAt(i)-97]=true;
			}
		}
		System.out.println(cnt);
	}
}
