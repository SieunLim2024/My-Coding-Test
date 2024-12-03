package backjoon;
//2407 조합
//https://www.acmicpc.net/problem/2407
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Backjoon2407 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger[][] dp = new BigInteger[101][101];

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) {
                    dp[i][j] = new BigInteger("1"); 
                } else {
                    dp[i][j] = dp[i-1][j-1].add(dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][m]);  
    }
}
