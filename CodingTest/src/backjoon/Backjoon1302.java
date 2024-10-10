package backjoon;
//1302 베스트셀러
//김형택은 탑문고의 직원이다. 김형택은 계산대에서 계산을 하는 직원이다. 김형택은 그날 근무가 끝난 후에, 오늘 판매한 책의 제목을 보면서 가장 많이 팔린 책의 제목을 칠판에 써놓는 일도 같이 하고 있다.
//오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램을 작성하시오.
import java.util.*;
public class Backjoon1302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> keyList = new ArrayList<>();
		int N = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String name = sc.next();
			if (!map.containsKey(name)) {
				map.put(name, 1);
			} else
				map.put(name, map.get(name) + 1);
		}

		int max = 0;
		for (String a : map.keySet()) {
			max = Math.max(max, map.get(a));
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(max)) {
				keyList.add(entry.getKey());
			}
		}
		Collections.sort(keyList);
		System.out.println(keyList.get(0));
	}
}
