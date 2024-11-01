package backjoon;
//2116 주사위 쌓기
//https://www.acmicpc.net/problem/2116
import java.util.Scanner;

public class Backjoon2116 {
	static int side_index[] = {5,3,4,1,2,0};
	static int box[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		box = new int[n][6];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 6; j++) {
				box[i][j] = sc.nextInt();
			}
		}
		int answer=0;
		int total=0;
		for (int i = 0; i < 6; i++) {
			int upval=box[0][i];
			total = check(upval, 0, i);
			for (int fl = 1; fl < n; fl++) {
				for (int pos = 0; pos < 6; pos++) {
					if(upval==box[fl][pos]) {
						total += check(box[fl][pos], fl, pos);
						upval = box[fl][side_index[pos]];
						break;
					}
				}
			}
			answer = answer< total ? total: answer;
		}
		System.out.println(answer);
	}
	//최대값 찾기
	static int check(int up, int fl, int idx) {
		int temp=0;
		for (int pos = 0; pos < 6; pos++) {
			if(box[fl][pos]==box[fl][idx] || box[fl][pos]==box[fl][side_index[idx]]) {
				continue;
			}
			temp = temp < box[fl][pos]? box[fl][pos] : temp;
		}
		return temp;
	}
}
