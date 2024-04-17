package test240414;

import java.util.Arrays;
import java.util.ArrayList;
class Solution
{
    public int solution(int []A, int []B)
    {
        int sum=0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length; i++){
            sum+= A[i]*B[B.length-i-1];
        }
        return sum;
    }
}