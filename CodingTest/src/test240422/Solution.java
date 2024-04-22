package test240422;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; 
        if(yellow==1) {
        	answer[0]=yellow/1+2;
            answer[1]=1+2;
        }
        for(int i=1; i<yellow; i++){
            if(yellow%i==0&&brown==i*2+yellow/i*2+4){
                answer[0]=yellow/i+2;
                answer[1]=i+2;
                break;
                
            }
        }
        return answer;
    }
}
