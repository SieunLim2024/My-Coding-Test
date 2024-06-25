package test240625;

import java.util.HashMap;

class Solution {
	public String solution(String X, String Y) {
		String answer = "";
		HashMap<Character, Integer> mapX = new HashMap<>();
		HashMap<Character, Integer> mapY = new HashMap<>();

		for (Character x : X.toCharArray()) {
			mapX.put(x, mapX.getOrDefault(x, 0) + 1);
		}
		for (Character y : Y.toCharArray()) {
			mapY.put(y, mapY.getOrDefault(y, 0) + 1);
		}

		StringBuilder sb = new StringBuilder();
		for (char ch = '9'; ch >= '0'; ch--) {
			if (mapX.containsKey(ch) && mapY.containsKey(ch)) {
				int min = Math.min(mapX.get(ch), mapY.get(ch));
				for (int i = 0; i < min; i++) {
					sb.append(ch);
				}
			}
		}

		answer = sb.toString();
		if (answer.isEmpty()) {
			return "-1";
		}
		if (answer.replaceAll("0", "").isEmpty()) {
			return "0";
		}

		return answer;
	}
}
