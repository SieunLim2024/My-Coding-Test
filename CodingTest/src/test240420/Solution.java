package test240420;

import java.util.Arrays;
class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<food.length;i++){
            if(food[i]%2!=0){
                food[i]-=1;
            }
            for(int j=0;j<food[i]/2; j++){
                    sb.append(i+"");
            }
        }
        String answer=sb.toString();
        answer+="0"+sb.reverse();
        return answer;
    }
}