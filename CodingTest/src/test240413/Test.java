package test240413;

import java.util.Arrays;
import java.util.Stack;

public class Test {
	boolean solution(String s) {
		char[] ch = s.toCharArray();
	    Stack<Character> stack = new Stack<>();
	        for(int i=0;i<ch.length;i++){
	            if(ch[i]=='('){
	                stack.push(ch[i]);
	            }else if(stack.size()!=0){
	                stack.pop();
	            }else if(stack.size()==0&&ch[i]==')'){
	                return false;
	            }

	        }
	        if(stack.size()==0){
	            return true;
	        }else{
	            return false;
	        }
        }

}
