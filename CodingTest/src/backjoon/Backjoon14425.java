package backjoon;
//14425 문자열 집합
//총 N개의 문자열로 이루어진 집합 S가 주어진다.
//입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.
import java.io.*;
import java.util.*;

public class Backjoon14425 {
    static int numWordsInSet, numWordsToCheck;
    static Set<String> wordSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = reader.readLine().split(" ");
            numWordsInSet = Integer.parseInt(input[0]);
            numWordsToCheck = Integer.parseInt(input[1]);

            // Set에 단어 입력
            for (int i = 0; i < numWordsInSet; i++) {
                wordSet.add(reader.readLine());
            }

            int matchingWordCount = 0;

            // 주어진 단어가 Set에 존재하는지 확인
            for (int i = 0; i < numWordsToCheck; i++) {
                if (wordSet.contains(reader.readLine())) {
                    matchingWordCount++;
                }
            }

            System.out.println(matchingWordCount);
        }
    }
}
