package test240414;

public class TestMain {
	public static void main(String[] args) {
		String s1 ="((()))";
		String s2 ="())(((";
		
		Test test = new Test();
		System.out.println(test.solution(s1));
		System.out.println(test.solution(s2));
	}
}
