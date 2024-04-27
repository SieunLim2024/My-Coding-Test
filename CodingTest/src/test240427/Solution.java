package test240427;

class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;
		for (int i = 0;; i++) {
			if (a == b) {
				answer = i;
				break;
			}
			if (a % 2 > 0) {
				a++;
			}
			if (b % 2 > 0) {
				b++;
			}
			a /= 2;
			b /= 2;
		}
		return answer;
	}
}