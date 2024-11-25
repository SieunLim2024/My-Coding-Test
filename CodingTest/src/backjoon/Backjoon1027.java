package backjoon;
//1027 고층 건물
//https://www.acmicpc.net/problem/1027
import java.io.*;
import java.util.*;

public class Backjoon1027 {
  static int N;
  static int[] arr;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; ++i) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int ans = 0;
    for(int b=0; b<N; ++b) { // b번째 빌딩에서 건물이 양옆으로 몇개 보이는지 세어보자.
      double slope = 1000000001.0; // 높이는 1~1000000000이므로 기울기는 1000000000 미만이다.
      int cnt = 0;
      for(int i=b-1; i>=0; --i) { // slope가 계속 감소해야한다.
        double cur_slope = calculateSlope(b, i, arr[b], arr[i]);
        if(cur_slope >= slope) {
          continue;
        }
        cnt++;
        slope = cur_slope;
      }

      slope = -1000000001.0; // 높이는 1~1000000000이므로 기울기는 -1000000000 초과이다.
      for(int i=b+1; i<N; ++i) { // slope가 계속 증가해야한다.
        double cur_slope = calculateSlope(b, i, arr[b], arr[i]);
        if(cur_slope <= slope) {
          continue;
        }
        cnt++;
        slope = cur_slope;

      }

      ans = Math.max(ans, cnt);
    }

    System.out.println(ans);
  }

  private static double calculateSlope(int x1, int x2, int y1, int y2) {
    return ((double)y2 - (double)y1) / ((double)x2 - (double)x1);
  }
}