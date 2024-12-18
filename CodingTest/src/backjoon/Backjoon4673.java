package backjoon;
//4673 셀프 넘버
//https://www.acmicpc.net/problem/4673
public class Backjoon4673 {
	public static void main(String[] args) {
        boolean[] Except = new boolean[10001];
         
        for (int i = 1; i <= 10000; ++i) {
            int d = getEx(i);
            if (d <= 10000) {
                Except[d] = true;             
            }
        }
        for (int i = 1; i < Except.length; ++i) {
            if (!Except[i]) {
                System.out.println(i);              
            }
        }
    }
    public static int getEx(int n) {
        int d = n;
        while(n > 0) {
            d += n % 10;
            n /= 10;
        }
        return d;
    }
}
