package backjoon;
//5426 비밀 편지
//https://www.acmicpc.net/problem/5426

import java.util.Scanner;

public class Backjoon5426 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String text;

        for (int i = 0; i < n; i++) {
            text = sc.next();
            int num = (int) Math.sqrt(text.length());

            for (int j = num - 1; j >= 0; j--) {
                int x = j;
                
                for (int k = 0; k < num; k++) {
                    System.out.print(text.charAt(x));
                    x += num;
                }
            }
            System.out.println("");
        }
    }
}
