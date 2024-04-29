package test240429;

import java.util.*;

class Solution {
	public int solution(int k, int[] tangerine) {
		int count = 0;
		int answer = 0;
		Arrays.sort(tangerine);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < tangerine.length; i++) {
			count++;
			if (i != tangerine.length - 1 && tangerine[i] != tangerine[i + 1] || i == tangerine.length - 1) {
				list.add(count);
				count = 0;
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		for (int data : list) {
			answer++;
			k -= data;
			if (k <= 0) {
				break;
			}
		}
		return answer++;
	}
}