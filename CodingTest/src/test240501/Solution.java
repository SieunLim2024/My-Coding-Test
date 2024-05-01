package test240501;

import java.util.*;
class Solution {
    public int solution(int n) {
        StringBuffer num= new StringBuffer(Integer.toString(n,3));
        num.reverse();
        int answer = Integer.parseInt(num.toString(),3);
        return answer;
    }
}