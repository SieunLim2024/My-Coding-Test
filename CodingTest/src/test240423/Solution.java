package test240423;

import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int num=0;
        int answer=0;
        for(int i=arr[arr.length-1];;i++){
            for(int j=0;j<arr.length;j++){
            	num=i%arr[j];
                if(num>0){
                    break;
                }
            }
            if(num==0){
            	answer= i;
            	break;
            }else {
            	continue;
            }
        }
		return answer;
    }
}