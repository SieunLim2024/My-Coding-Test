package backjoon;
import java.util.*;
public class Backjoon24511 {
//24511 queuestack
//https://www.acmicpc.net/problem/24511
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        
        int n = sc.nextInt();
        int A[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            A[i] = sc.nextInt(); //0110
        }
        int B[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
        	B[i] = sc.nextInt(); //1234
        }
        
        int m = sc.nextInt();  
        int C[] = new int[m];
        
        for(int i=0; i<m; i++)
        {
            C[i] = sc.nextInt(); //247
        }
        for(int i=0; i<n; i++)
        {
        	if(A[i]==0)
        		deque.addLast(i+1);
        }
        for(int i=0; i<m; i++)
        {
        	deque.addFirst(C[i]);
        	System.out.print(deque.removeLast()+" ");
        }

	}

}
