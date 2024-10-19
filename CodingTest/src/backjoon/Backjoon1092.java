package backjoon;

import java.util.*;
//1092 배
//지민이는 항구에서 일한다. 그리고 화물을 배에 실어야 한다. 모든 화물은 박스에 안에 넣어져 있다. 
//항구에는 크레인이 N대 있고, 1분에 박스를 하나씩 배에 실을 수 있다. 모든 크레인은 동시에 움직인다.

//각 크레인은 무게 제한이 있다. 이 무게 제한보다 무거운 박스는 크레인으로 움직일 수 없다. 
//모든 박스를 배로 옮기는데 드는 시간의 최솟값을 구하는 프로그램을 작성하시오.
public class Backjoon1092 {
	static int N, M;
	static ArrayList<Integer> crane;
	static ArrayList<Integer> box;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		crane = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			crane.add(sc.nextInt());
		}
		M = sc.nextInt();
		box = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			box.add(sc.nextInt());
		}
		Collections.sort(crane, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		if (box.get(0) > crane.get(0)) {
			System.out.println(-1);
			return;
		}
		int ans = 0;
		while (!box.isEmpty()) {
			int idx = 0;
			for (int i = 0; i < N;) {
				if (idx == box.size())
					break;
				else if (crane.get(i) >= box.get(idx)) {
					box.remove(idx);
					i++;
				} else
					idx++;
			}
			ans++;
		}
		System.out.println(ans);
	}
}
