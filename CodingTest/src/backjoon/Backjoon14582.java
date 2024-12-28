package backjoon;

//14582 오늘도 졌다.
//https://www.acmicpc.net/problem/14582
import java.io.*;
import java.util.StringTokenizer;

public class Backjoon14582 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr1 = new int[9];
        for (int i = 0; i < 9; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[9];
        for (int i = 0; i < 9; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        int sum1 = 0;
        int sum2 = 0;
        boolean win = false;

        for (int i = 0; i < 9; i++) {
            sum1 += arr1[i]; 
            sum2 += arr2[i]; 

            if (sum1 > sum2) {
                win = true;
            }
        }

        if (sum1 < sum2 && win) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
