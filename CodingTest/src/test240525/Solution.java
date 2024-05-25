package test240525;
//기능개발
//프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
//이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
//각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포지를 return 하도록 
//solution 함수를 완성하세요.
import java.util.*;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num=0;
		for (int i = 1;; i++) {
			int total = 0;
			int cnt = 0;
			for (int j = 0; j < progresses.length; j++) {
				if (progresses[j] < 100) {
					progresses[j] += speeds[j];
				}
				if (progresses[j] >= 100) {
					if (j == 0) {
						cnt++;
					}
					if (cnt == j) {
						cnt++;
						
					}
					total++;
					
				}
			}
			if (cnt != 0) {
				if(list.size()!=0) {
					if(cnt-num!=0) {
					list.add(cnt-num);
					num=cnt;
					}
				}else {
					list.add(cnt);
					num=cnt;
				}
			}
			if (total == progresses.length) {
				break;
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
