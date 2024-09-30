package backjoon;
import java.util.*;
//1620 나는야 포켓몬 마스터 이다솜
//https://www.acmicpc.net/problem/1620
public class Backjoon1620 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		String arr[] = new String[num1];
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < num1; i++) {
			String temp = scanner.nextLine();
			map.put(temp, i + 1);
			arr[i] = temp;
		}
		for (int i = 0; i < num2; i++) {
			String temp = scanner.nextLine();
			boolean check = true;
			for (int j = 0; j < temp.length(); j++) {
				if (!('0' < temp.charAt(j) && temp.charAt(j) > '9')) {
					check = false;
					break;
				} else {
					break;
				}
			}
			if (check) {
				System.out.println(map.get(temp));
			} else {
				System.out.println(arr[Integer.parseInt(temp) - 1]);
			}
		}
	}
}
