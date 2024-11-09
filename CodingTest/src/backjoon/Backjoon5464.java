package backjoon;
//5464 주차장
//https://www.acmicpc.net/problem/5464
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Backjoon5464 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int numParkingSpots = Integer.parseInt(st.nextToken());
		int numCars = Integer.parseInt(st.nextToken());

		int[] parkingRates = new int[numParkingSpots + 1];
		for (int i = 1; i <= numParkingSpots; i++) {
			parkingRates[i] = Integer.parseInt(reader.readLine());
		}

		int[] carWeights = new int[numCars + 1];
		for (int i = 1; i <= numCars; i++) {
			carWeights[i] = Integer.parseInt(reader.readLine());
		}

		int[] parkedCarSpot = new int[numCars + 1];
		PriorityQueue<Integer> availableSpots = new PriorityQueue<>();
		Queue<Integer> waitingCars = new LinkedList<>();

		for (int i = 1; i <= numParkingSpots; i++) {
			availableSpots.add(i);
		}

		int totalEarnings = 0;

		for (int i = 0; i < 2 * numCars; i++) {
			int carNumber = Integer.parseInt(reader.readLine());

			if (carNumber > 0) {
				if (availableSpots.isEmpty()) {
					waitingCars.add(carNumber);
				} else {
					int spot = availableSpots.poll();
					parkedCarSpot[carNumber] = spot;
				}
			} else {
				carNumber = -carNumber;
				int spot = parkedCarSpot[carNumber];
				totalEarnings += carWeights[carNumber] * parkingRates[spot];

				if (!waitingCars.isEmpty()) {
					int nextCar = waitingCars.poll();
					parkedCarSpot[nextCar] = spot;
				} else {
					availableSpots.add(spot);
				}
			}
		}
		System.out.println(totalEarnings);
	}
}
