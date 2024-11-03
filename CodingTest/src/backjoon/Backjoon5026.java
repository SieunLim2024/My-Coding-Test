package backjoon;
//5026 박사 과정
//https://www.acmicpc.net/problem/5026
import java.util.Scanner;

public class Backjoon5026 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        for (int i = 0; i < N; i++) {
	            String problem = sc.next();  
	            
	            if (problem.equals("P=NP")) {  
	                System.out.println("skipped");  
	            } else {
	            	String[] numbers = problem.split("\\+");  
	                int a = Integer.parseInt(numbers[0]); 
	                int b = Integer.parseInt(numbers[1]); 
	                
	                System.out.println(a + b); 
	            }
	        }
	    }
	    
}
