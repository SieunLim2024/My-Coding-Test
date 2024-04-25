package test240425;

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<score.length; i++) {
			if(list.size()<k) {
				list.add(score[i]);
			}
			else {
				if(score[i]>Collections.min(list)) {
					list.set(list.indexOf(Collections.min(list)), score[i]);
				}
			}
			answer[i] = Collections.min(list);
		}
		return answer;
    }
}