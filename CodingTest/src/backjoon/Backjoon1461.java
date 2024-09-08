package backjoon;

import java.io.*;
import java.util.*;

//1461 도서관
//세준이는 도서관에서 일한다. 도서관의 개방시간이 끝나서 세준이는 사람들이 마구 놓은 책을 다시 가져다 놓아야 한다. 
//세준이는 현재 0에 있고, 사람들이 마구 놓은 책도 전부 0에 있다. 각 책들의 원래 위치가 주어질 때, 
//책을 모두 제자리에 놔둘 때 드는 최소 걸음 수를 계산하는 프로그램을 작성하시오. 
//세준이는 한 걸음에 좌표 1칸씩 가며, 책의 원래 위치는 정수 좌표이다. 
//책을 모두 제자리에 놔둔 후에는 다시 0으로 돌아올 필요는 없다. 
//그리고 세준이는 한 번에 최대 M권의 책을 들 수 있다.
public class Backjoon1461 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int bookCount = Integer.parseInt(st.nextToken()); // 책의 수
		int carryLimit = Integer.parseInt(st.nextToken()); // 한 번에 들 수 있는 책의 수

		List<Integer> negativeBooks = new ArrayList<>();
		List<Integer> positiveBooks = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < bookCount; i++) {
			int bookPosition = Integer.parseInt(st.nextToken());
			if (bookPosition < 0) {
				negativeBooks.add(Math.abs(bookPosition));
			} else {
				positiveBooks.add(bookPosition);
			}
		}

		// 정렬
		Collections.sort(negativeBooks, Collections.reverseOrder());
		Collections.sort(positiveBooks, Collections.reverseOrder());

		int totalDistance = 0;

		// 가장 멀리 있는 책을 먼저 처리
		totalDistance += calculateDistance(negativeBooks, carryLimit);
		totalDistance += calculateDistance(positiveBooks, carryLimit);

		// 처음 가장 멀리 간 책의 위치를 한 번만 더하는 것을 고려
		int maxDistance = 0;
		if (!negativeBooks.isEmpty()) {
			maxDistance = Math.max(maxDistance, negativeBooks.get(0));
		}
		if (!positiveBooks.isEmpty()) {
			maxDistance = Math.max(maxDistance, positiveBooks.get(0));
		}
		totalDistance -= maxDistance;

		System.out.println(totalDistance);
	}

	// 리스트의 책들을 carryLimit씩 나눠서 왕복 거리 계산
	private static int calculateDistance(List<Integer> books, int carryLimit) {
		int distance = 0;
		for (int i = 0; i < books.size(); i += carryLimit) {
			distance += books.get(i) * 2;
		}
		return distance;
	}
}
