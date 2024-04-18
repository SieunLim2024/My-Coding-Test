package test240418;

class Solution {
    public int solution(int n) {
        int f1=0;
        int f2=1;
        for(int i=2;i<n+1;i++){
            f2=f1%1234567+f2%1234567;
            f1=f2-f1%1234567;
        }
        return f2%1234567;
    }
}