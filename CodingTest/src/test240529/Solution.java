package test240529;
//로또의 최고 순위와 최저 순위
//로또 6/45(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 
//민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 
//당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
///민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 
//이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    	int[] answer= new int[2];
    	int check=0;
    	int min=0;
    	int max=0;
    	int cnt=0;
    	
    	for(int i=0;i<lottos.length;i++) {
    		if(lottos[i]==0) {
    			cnt++;
    		}
    		for(int j=0;j<win_nums.length;j++) {
    			if(win_nums[j]==lottos[i]) {
    				check++;
    			}
    		}
    	}
    	if(cnt<6) {
    		max=check+cnt;
    		min=check;
    	}else {
    		 max=6;
    	     min=0;
    	}
        switch(min) {
        case 6:
        	answer[1]=1;
        	break;
        case 5:
        	answer[1]=2;
        	break;
        case 4:
        	answer[1]=3;
        	break;
        case 3:
        	answer[1]=4;
        	break;
        case 2:
        	answer[1]=5;
        	break;
        default:
        	answer[1]=6;
        }
        switch(max) {
        case 6:
        	answer[0]=1;
        	break;
        case 5:
        	answer[0]=2;
        	break;
        case 4:
        	answer[0]=3;
        	break;
        case 3:
        	answer[0]=4;
        	break;
        case 2:
        	answer[0]=5;
        	break;
        default:
        	answer[0]=6;
        }
        return answer;
    }
}