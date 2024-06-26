package test240626;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[][] c = {
				{"blue", "red", "orange", "red"}, 
				{"red", "red", "blue", "orange"},
				{"blue", "orange", "red", "red"},
				{"orange", "orange", "red", "blue"}};
		System.out.println(sol.solution(c,1,1));
		

	}

}
