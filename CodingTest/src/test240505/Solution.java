package test240505;

class Solution {
	public int solution(String[] babbling) {
		String[] able = { "aya", "ye", "woo", "ma" };
		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < able.length; j++) {
				if (babbling[i].indexOf(able[j] + able[j]) != -1) {
					break;
				} else if (babbling[i].indexOf(able[j]) != -1) {
					babbling[i] = babbling[i].replace(able[j], " ");
					j--;
				}
			}
		}
		int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
        	if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
		return answer;
	}
}
