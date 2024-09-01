package backjoon;
//13335 트럭
//강을 가로지르는 하나의 차선으로 된 다리가 하나 있다. 이 다리를 n 개의 트럭이 건너가려고 한다. 트럭의 순서는 바꿀 수 없으며,
//트럭의 무게는 서로 같지 않을 수 있다. 다리 위에는 단지 w 대의 트럭만 동시에 올라갈 수 있다. 
//다리의 길이는 w 단위길이(unit distance)이며, 각 트럭들은 하나의 단위시간(unit time)에 하나의 단위길이만큼만 이동할 수 있다고 가정한다. 
//동시에 다리 위에 올라가 있는 트럭들의 무게의 합은 다리의 최대하중인 L보다 작거나 같아야 한다.
//참고로, 다리 위에 완전히 올라가지 못한 트럭의 무게는 다리 위의 트럭들의 무게의 합을 계산할 때 포함하지 않는다고 가정한다.

//예를 들어, 다리의 길이 w는 2, 다리의 최대하중 L은 10, 다리를 건너려는 트럭이 트럭의 무게가 [7, 4, 5, 6]인 순서대로 
//다리를 오른쪽에서 왼쪽으로 건넌다고 하자. 이 경우 모든 트럭이 다리를 건너는 최단시간은 아래의 그림에서 보는 것과 같이 8 이다.
//다리의 길이와 다리의 최대하중, 그리고 다리를 건너려는 트럭들의 무게가 순서대로 주어졌을 때, 
//모든 트럭이 다리를 건너는 최단시간을 구하는 프로그램을 작성하라.

import java.util.*;

public class backjoon13335 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int L = sc.nextInt();

		Queue<Integer> truck = new LinkedList<>();
		Queue<Integer> bridge = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			truck.offer(sc.nextInt());
		}

		sc.close();

		int answer = 0;
		int weight = 0;

		for (int i = 0; i < w; i++) {
			bridge.offer(0); 
		}


		while (!bridge.isEmpty()) {
			answer++;
			weight -= bridge.poll(); // 다리에서 트럭 뺌
			if (!truck.isEmpty()) {
				if (truck.peek() + weight <= L) { // 트럭이 남아있고 최대하중보다 낮다면
					weight += truck.peek(); // 무게 추가
					bridge.offer(truck.poll()); // 트럭 다리로 이동
				} else {
					bridge.offer(0); // 하중보다 높다면 0으로 자리 채우기
				}
			}
		}
		System.out.print(answer);

	}
}
