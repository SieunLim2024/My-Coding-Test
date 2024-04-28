package test240428;

import java.util.*;

class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
        int n=0;
		Arrays.sort(people);
		boolean flag = false;
		for (int i = people.length - 1; i > -1; i--) {
			if (people[n] != 0&&people[i] != 0) {
				if (people[i] + people[n] <= limit) {
					people[n] = 0;
					people[i] = 0;
					answer++;
					flag = true;
                    n++;
				}
			}
			if (flag == false&&people[i] != 0) {
				people[i] = 0;
				answer++;
			} else {
				flag = false;
			}
		}
		return answer;
	}
}