package prorammerschool.lv2;
//더 맵게
//매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 
//모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 
//새로운 음식을 만듭니다.

//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
//Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
//모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
import java.util.*;

public class MoreSpicy {
    public int solution(int[] scoville, int targetScoville) {
        // 섞은 횟수를 저장할 변수
        int mixCount = 0;
        // 우선순위 큐 선언 (가장 작은 값이 먼저 나옴)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // scoville 배열을 우선순위 큐에 추가
        for (int spiceLevel : scoville) {
            minHeap.add(spiceLevel);
        }

        // 가장 낮은 스코빌 지수가 목표치보다 작을 동안 반복
        while (minHeap.peek() < targetScoville) {
            // 큐에 남은 요소가 1개라면 더 이상 섞을 수 없으므로 실패(-1 반환)
            if (minHeap.size() == 1) {
                return -1;
            }

            // 두 개의 가장 낮은 스코빌 지수를 꺼내 새로운 스코빌 값으로 섞기
            int weakest = minHeap.poll();
            int secondWeakest = minHeap.poll();
            int mixedScoville = weakest + (secondWeakest * 2);
            minHeap.add(mixedScoville);
            mixCount++;
        }

        // 목표 스코빌 지수를 달성하기까지 섞은 횟수 반환
        return mixCount;
    }
}
