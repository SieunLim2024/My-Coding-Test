package backjoon;
//11134 쿠키 애호가
//https://www.acmicpc.net/problem/11134
import java.io.*;
import java.util.*;

public class Backjoon11134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(N % C == 0) System.out.println(N / C);
			else System.out.println((N / C) + 1);
		}
	}
}
