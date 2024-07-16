package backjoon;
//14215세 막대
//문제
//영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.

//영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.

//각 막대의 길이는 양의 정수이다
//세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
//삼각형의 둘레를 최대로 해야 한다.
//a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오. 

//입력
//첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.

//출력
//첫째 줄에 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
import java.util.*;

public class backjoon14215 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		    String[] input = sc.nextLine().split(" ");
		        
		    int A = Integer.parseInt(input[0]);
		    int B = Integer.parseInt(input[1]);
		    int C = Integer.parseInt(input[2]);
		    int[] arr = {A, B, C};
		    Arrays.sort(arr);
		        
		    if(arr[0]+arr[1] > arr[2]){
		        System.out.println(A+B+C);
		    }else{
		        System.out.println((arr[0]+arr[1]) * 2 - 1);
		    }

		}

}
