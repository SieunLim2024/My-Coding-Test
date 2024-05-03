package test240503;

import java.util.*;

public class Solution {
	public int solution(String s) {
		Stack<Character> st = new Stack<>();
		int cnt = 0;
		for (int j = 0; j < s.length(); j++) {
			boolean flag = false;
			for (int i = j; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '{' || c == '(' || c == '[') {
					st.add(c);
				} else if (c == '}') {
					if (!st.empty()) {
						if (st.peek() == '{') {
							st.pop();
						}
					} else {
						flag = true;
					}
				} else if (c == ')') {
					if (!st.empty()) {
						if (st.peek() == '(') {
							st.pop();
						}
					} else {
						flag = true;
					}
				} else if (c == ']') {
					if (!st.empty()) {
						if (st.peek() == '[') {
							st.pop();
						}
					} else {
						flag = true;
					}
				}

			}
			for (int i = 0; i < j; i++) {
				char c = s.charAt(i);
				if (c == '{' || c == '(' || c == '[') {
					st.add(c);
				} else if (c == '}') {
					if (!st.empty()) {
						if (st.peek() == '{') {
							st.pop();
						}
					} else {
						flag = true;
					}
				} else if (c == ')') {
					if (!st.empty()) {
						if (st.peek() == '(') {
							st.pop();
						}
					} else {
						flag = true;
					}
				} else if (c == ']') {
					if (!st.empty()) {
						if (st.peek() == '[') {
							st.pop();
						}
					} else {
						flag = true;
					}
				}

			}

			if (st.empty() & !flag) {
				cnt++;
			}
			st.clear();

		}

		return cnt;
	}
}
