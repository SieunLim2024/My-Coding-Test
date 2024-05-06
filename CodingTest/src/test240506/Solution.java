package test240506;

import java.util.*;

public class Solution {
	public int[] solution(int[] arr) {
		Stack<Integer> num = new Stack<Integer>();
        num.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != num.peek()) {
				num.push(arr[i]);
			}
		}
		int[] answer = new int[num.size()];
		for (int i = num.size() - 1; i >= 0; i--) {
			answer[i] = num.pop();
		}
		return answer;
	}
}