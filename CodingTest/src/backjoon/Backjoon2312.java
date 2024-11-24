package backjoon;
//2312 수 복원하기
//https://www.acmicpc.net/problem/2312
import java.util.Scanner;

public class Backjoon2312 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCaseCount = sc.nextInt();
        
        for (int i = 0; i < testCaseCount; i++) {
            int number = sc.nextInt();
            printPrimeFactorization(number);
        }

        sc.close();
    }

    private static void printPrimeFactorization(int number) {
        int divisor = 2;

        while (number > 1) {
            int count = 0;

            while (number % divisor == 0) {
                count++;
                number /= divisor;
            }

            if (count > 0) {
                System.out.println(divisor + " " + count);
            }

            divisor++;
        }
    }
}
