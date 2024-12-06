package backjoon;
//1157 단어 공부
//https://www.acmicpc.net/problem/1157
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1157 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            int str_char = str.charAt(i);
            if (97 <= str_char && str_char <= 122) {
                arr[str_char - 97]++;
            } else {
                arr[str_char - 65]++;
            }
        }
        int max = -1;
        char index = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = (char) (i + 65);
            } else if (arr[i] == max) {
                index = '?';
            }
        }
        System.out.println(index);
    }
}
