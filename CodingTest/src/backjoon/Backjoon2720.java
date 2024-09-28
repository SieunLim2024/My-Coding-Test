package backjoon;
//2720 세탁소 사장 동혁
//미국으로 유학간 동혁이는 세탁소를 운영하고 있다. 동혁이는 최근에 아르바이트로 고등학생 리암을 채용했다.
//동혁이는 리암에게 실망했다.
//리암은 거스름돈을 주는 것을 자꾸 실수한다.
//심지어 $0.5달러를 줘야하는 경우에 거스름돈으로 $5달러를 주는것이다!
//어쩔수 없이 뛰어난 코딩 실력을 발휘해 리암을 도와주는 프로그램을 작성하려고 하지만, 
//디아블로를 하느라 코딩할 시간이 없어서 이 문제를 읽고 있는 여러분이 대신 해주어야 한다.
//거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 
//니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오. 
//거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 
//예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
import java.util.*;

public class Backjoon2720 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            System.out.print(c / q + " ");
            c = c % q;
            System.out.print(c / d + " ");
            c = c % d;
            System.out.print(c / n + " ");
            c = c % n;
            System.out.println(c / p);
        }
    }
}