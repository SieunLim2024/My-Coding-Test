package backjoon;
//20055번 컨베이어 벨트 위의 로봇
//https://www.acmicpc.net/problem/20055
import java.util.*;
	public class backjoon20055 {
		static int n,k;
		static int[] belt;
		static ArrayList<Integer> list=new ArrayList<>();
		static boolean[] pos;
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();// 컨베이어 길이= 2n
			k=sc.nextInt();
			belt=new int[2*n];
			pos=new boolean[2*n];
			for (int i = 0; i < 2*n; i++) {
				belt[i]=sc.nextInt();
			}
			
			for (int i = 0; i < 2*n; i++) {
				list.add(i);
			}
			int time=1;
			int cnt=0;
			
			while(true) {
//				1번 한 칸 회전
				int cur=list.get(list.size()-1);
				list.remove(list.size()-1);
				list.add(0, cur);
				int up=list.get(0);
				int down=list.get(n-1);
	            
				//내릴 로봇은 내림
				if(pos[down]) {
					pos[down]=false;
				}
				//로봇 스스로 이동
				for (int i = n-1; i >=0; i--) {
					int idx=list.get(i);
					int next=list.get(i+1);
					if(pos[idx]==true && belt[next]>=1 && pos[next]==false) {
						belt[next]-=1;
						pos[next]=true;
						pos[idx]=false;
						if(belt[next]==0)cnt++;
					}
				}
				//내릴 로봇은 내림
				if(pos[down]) {
					pos[down]=false;
				}
				
				//로봇 올림
				if(belt[up]>=1 && pos[up]==false) {
					pos[up]=true;
					belt[up]-=1;
					if(belt[up]==0)cnt++;
				}	

				if(cnt>=k)break;
				time++;
				
			}

			System.out.println(time);
		}
	}