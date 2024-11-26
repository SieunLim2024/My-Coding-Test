package backjoon;
//1076 저항
//https://www.acmicpc.net/problem/1076
import java.io.*;
import java.util.Arrays;

public class Backjoon1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 색을 순서대로 집어넣은 String 형의 배열
		String[] color = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();

		long result = (Arrays.asList(color).indexOf(A) * 10) + Arrays.asList(color).indexOf(B);
		result *= Math.pow(10, Arrays.asList(color).indexOf(C));

		System.out.println(result);
	}
}
