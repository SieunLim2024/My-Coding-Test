package test240417;

class Solution {
    public int solution(int n) {
        String n1 = Integer.toString(n,2);
        int num1=0;
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)=='1'){
                num1++;
            }
        }
        int answer=0;
        
        for(int i=n+1;;i++){
            String n2=Integer.toString(i,2);
            int num2=0;
            for(int j=0;j<n2.length();j++){
                if(n2.charAt(j)=='1'){
                    num2++;
                }
            }
            if(num2==num1){
                answer=i;
                break;
            }
        }
        return answer;
    }
}