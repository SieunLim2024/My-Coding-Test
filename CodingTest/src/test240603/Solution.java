package test240603;

import java.util.Arrays;
//연속 부분 수열 합의 개수
//철호는 수열을 가지고 놀기 좋아합니다. 
//어느 날 철호는 어떤 자연수로 이루어진 원형 수열의 연속하는 부분 수열의 합으로 만들 수 있는 수가 모두 몇 가지인지 알아보고 싶어졌습니다. 
//원형 수열이란 일반적인 수열에서 처음과 끝이 연결된 형태의 수열을 말합니다. 
//원형 수열은 처음과 끝이 연결되어 끊기는 부분이 없기 때문에 연속하는 부분 수열도 일반적인 수열보다 많아집니다.
//원형 수열의 모든 원소 elements가 순서대로 주어질 때, 
//원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수를 return 하도록 solution 함수를 완성해주세요.
import java.util.*;

class Solution {
	public int solution(int[] elements) {
		int answer = 0;

		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			for (int element : elements) {
				list.add(element);
			}
		}
		for (int i = 0; i < elements.length; i++) {
			for (int j = 1; j <= elements.length; j++) {
				List<Integer> subLst = list.subList(i, i + j);
				int sum = 0;
				for (int num : subLst)
					sum += num;
				set.add(sum);
			}
		}
		answer = set.size();
		return answer;
	}
}