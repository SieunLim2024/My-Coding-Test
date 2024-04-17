package test240415;

class Solution {
    public String solution(String s) {
	    s = s.toLowerCase();
		char[] ch = s.toCharArray();
		StringBuffer st = new StringBuffer();
		if (ch[0] >= 97 && ch[0] <= 122) {
			ch[0] -= 32;
		}
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == ' ') {
				if (i<s.length()-1&&ch[i + 1] >= 97 && ch[i + 1] <= 122) {
					ch[i + 1] -= 32;
				}
			}
			st.append(ch[i]);
		}
		return st.toString();
	}
}