package backjoon;
//5032 탄산음료
//https://www.acmicpc.net/problem/5032
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon5032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];

		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(str[i]);

		int sum = 0;
		int num = arr[0] + arr[1]; // 시작값
		while (num >= arr[2]) {
			sum += num / arr[2];
			num = num / arr[2] + num % arr[2];
		}
		System.out.println(sum);

	}
}
