package programmerschool.lv2;
//모음 사전
//사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 
//길이 5 이하의 모든 단어가 수록되어 있습니다. 사전에서 첫 번째 단어는 "A"이고, 
//그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.
//단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록
//solution 함수를 완성해주세요.
public class VowelDictionary {
	public int solution(String word) {
		int answer = 0;
		int total = 0, charCnt = 5;// 총경우의 수, 문자개수

		for (int i = 1; i <= charCnt; i++)
			total += Math.pow(charCnt, i);

		// i번째 문자에서 문자하나 마다의 간격을 저장해줄 배열
		int[] charDis = new int[charCnt];
		for (int i = 0; i < charCnt; i++)
			charDis[i] = (int) (total / Math.pow(charCnt, i + 1));

		// 사전에 몇번째로 등록됐는지 계산
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'A')
				answer += (charDis[i] * 0) + 1;
			else if (ch == 'E')
				answer += (charDis[i] * 1) + 1;
			else if (ch == 'I')
				answer += (charDis[i] * 2) + 1;
			else if (ch == 'O')
				answer += (charDis[i] * 3) + 1;
			else
				answer += (charDis[i] * 4) + 1;
		}

		System.out.println(answer);
		return answer;
	}
}
