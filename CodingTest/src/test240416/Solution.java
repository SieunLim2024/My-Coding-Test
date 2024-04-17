package test240416;

class Solution {
    public int[] solution(String s) {
        int remove=0;
        int count=0; 
        boolean flag= false;

        while(!flag){
            String s2=s.replace("0","");
            remove+=s.length()-s2.length();
            count++;
            s=Integer.toString(s2.length(),2);
            if(s.equals("1")){
                flag=true;
            }
        }
        int [] answer ={count,remove};
        return answer;
    }
}