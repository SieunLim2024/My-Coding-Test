package backjoon;
//4233 가짜소수
//https://www.acmicpc.net/problem/4233
import java.io.*;

public class Backjoon4233 {
	static boolean isPrime(long num) {
		if (num < 2)
			return false;
		for (long i = 2; i * i <= num; ++i) {
			if (num % i == 0)
				return false;
		}
		return true; 
	}
	static long fpow(long a, long p, long mod) {
		if (p == 1) {
			return a % mod; 
		}

		long half = fpow(a, p / 2, mod);
		long result = (half * half) % mod;

		if (p % 2 == 1) { 
			result = (result * a) % mod;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = br.readLine(); 
			String[] values = input.split(" "); 
			long A = Long.parseLong(values[0]);
			long B = Long.parseLong(values[1]);

			if (A == 0 && B == 0)
				break;

			long a = Math.min(A, B); 
			long p = Math.max(A, B);

			if (isPrime(p)) { 
				bw.write("no\n");
			} else {
				if (fpow(a, p, p) == a) {
					bw.write("yes\n");
				} else {
					bw.write("no\n");
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
