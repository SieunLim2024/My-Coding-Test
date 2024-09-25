package backjoon;
//11478 서로 다른 부분 문자열
//문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
//부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
//예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고,
//서로 다른것의 개수는 12개이다.
import java.io.*;
import java.util.*;

public class Backjoon11478 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String S = br.readLine();
            Set<String> set = new HashSet<>();

            for (int i = 0; i < S.length(); i++)
                for (int j = i + 1; j < S.length(); j++)
                    set.add(S.substring(i, j));

            System.out.println(set.size());
        }
    }
}