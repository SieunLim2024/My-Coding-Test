package test240520;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol =new Solution();
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		System.out.println(Arrays.toString(sol.solution(name, yearning, photo)));
	}

}
