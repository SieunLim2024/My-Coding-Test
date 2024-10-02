package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//1932 정수 삼각형
//        7
//      3   8
//    8   1   0
//  2   7   4   4
//4   5   2   6   5
//위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

//맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

//삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
public class Backjoon1932 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int dp[][]=new int[n][n];
        
        for(int i=0; i<n; i++) {
       	 for(int j=0; j<=i; j++) {
       		 arr[i][j]=sc.nextInt();
       	 }
        }
        dp[0][0]=arr[0][0];
        for(int i=1; i<n; i++) {
       	 for(int j=0; j<=i; j++) {
       		 if(j==0) {
       			 dp[i][j]=dp[i-1][j]+arr[i][j];
       		 }
       		 else if(j==j+i) {
       			 dp[i][j]=dp[i-1][j-1]+arr[i][j];
       		 }
       		 else {
       			 dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j])+arr[i][j];
       		 } 
       	 }
        }
        int max=0;
        for(int i=0; i<n; i++) {
       	 if(max<dp[n-1][i])
       		 max=dp[n-1][i];
        }
        System.out.println(max);
	}
}
