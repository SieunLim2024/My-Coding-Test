package test240502;

class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt=0;
        int paint=0;
        for(int i=0; i<section.length;i++) {
        	if(paint<=section[i]) {
        		cnt++;
        		paint=section[i]+m;
        	}
        }
    return cnt;
    }
}