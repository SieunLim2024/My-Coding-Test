package backjoon;
//3933 라그랑주의 네 제곱수 정리
//acmicpc.net/submit/3933
import java.util.Scanner;

public class Backjoon3933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            int cnt = 0;
            int sqrtN = (int) Math.sqrt(N);

            for (int i = 1; i <= sqrtN; i++) {
                if (i * i == N) {
                    cnt++;
                    continue;
                }
                for (int j = i; j <= sqrtN; j++) {
                    if (i * i + j * j == N) {
                        cnt++;
                        break;
                    }
                    for (int k = j; k <= sqrtN; k++) {
                        if (i * i + j * j + k * k == N) {
                            cnt++;
                            break;
                        }
                        for (int l = k; l <= sqrtN; l++) {
                            if (i * i + j * j + k * k + l * l == N) {
                                cnt++;
                                break;
                            }
                            if (i * i + j * j + k * k + l * l > N) break;
                        }
                    }
                }
            }

            System.out.println(cnt);
        }

        scanner.close();
    }
}
