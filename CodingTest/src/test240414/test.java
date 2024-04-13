package test240414;

import java.util.Arrays;
import java.util.Stack;

public class test {
	boolean solution(String s) {
	    Stack<String> stack = new Stack<>();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('){
	                stack.push(s.charAt(i)+"");
	            }else if(stack.size()!=0){
	                stack.pop();
	            }else if(stack.size()==0&&s.charAt(i)==')'){
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
