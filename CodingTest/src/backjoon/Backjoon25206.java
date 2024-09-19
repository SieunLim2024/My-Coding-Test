package backjoon;
import java.util.*;
//25206 너의 평점은
//인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
//치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
//인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
//A+	4.5
//A0	4.0
//B+	3.5
//B0	3.0
//C+	2.5
//C0	2.0
//D+	1.5
//D0	1.0
//F	0.0
//P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

//과연 치훈이는 무사히 졸업할 수 있을까?

public class Backjoon25206 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double result = 0, credit_sum = 0;
		char c;
				
		for(int i=0;i<20;i++) {
			double credit = 0; // 학점
			double grade = 0;
			
			String str_arr[] = sc.nextLine().split(" ");
			credit += Double.parseDouble(str_arr[1]);
			c = str_arr[2].charAt(0);
			
			switch(c) {
			case 'A':
				if(str_arr[2].charAt(1) == '+') grade += 4.5;
				else grade += 4.0;
				break;
			case 'B':
				if(str_arr[2].charAt(1) == '+') grade += 3.5;
				else grade += 3.0;
				break;
			case 'C':
				if(str_arr[2].charAt(1) == '+') grade += 2.5;
				else grade += 2.0;
				break;
			case 'D':
				if(str_arr[2].charAt(1) == '+') grade += 1.5;
				else grade += 1.0;
				break;
			case 'F':
				grade += 0;
				break;
			case 'P':
				grade += 0;
				credit = 0;
				break;
			}
			credit_sum += credit;
			result += credit*grade;
		}
		sc.close();

		System.out.println(result/credit_sum);
	}
}
