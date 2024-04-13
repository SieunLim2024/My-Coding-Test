package test240414;

import java.util.Arrays;
import java.util.Stack;

public class test {
	boolean solution(String s) {
		String[] a = s.split("");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("(")) {
				stack.push(a[i]);
			} else if (stack.size() != 0) {
				stack.pop();
			} else if (stack.size() == 0 && a[i].equals(")")) {
				return false;
			}
		}
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	//

}
