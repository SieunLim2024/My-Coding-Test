package test240413;

public class Test {
	public static String solution(String s) {
		String[] a = s.split(" ");
		int max = Integer.parseInt(a[0]);
		int min = Integer.parseInt(a[0]);

		for (int i = 0; i < a.length; i++) {
			if (max < Integer.parseInt(a[i])) {
				max = Integer.parseInt(a[i]);
			}
			if (min > Integer.parseInt(a[i])) {
				min = Integer.parseInt(a[i]);
			}
		}
		String answer = min + " " + max;
		return answer;
	}
}
