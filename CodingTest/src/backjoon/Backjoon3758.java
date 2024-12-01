package backjoon;
//3758 KCPC 
//https://www.acmicpc.net/problem/3758
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Backjoon3758 {
	static class Team {
		int id;
		int[] scoreList;
		int submitNum;
		int lastSubmit;
		int totalScore;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int T = 0; T < testCase; T++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 팀 수
			int k = Integer.parseInt(st.nextToken()); // 문제수k
			int t = Integer.parseInt(st.nextToken()); // 내 팀ID
			int m = Integer.parseInt(st.nextToken()); // 로그개수

			Team[] list = new Team[n];
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int teamID = Integer.parseInt(st.nextToken());
				int problemNum = Integer.parseInt(st.nextToken());
				int score = Integer.parseInt(st.nextToken());

				if (list[teamID - 1] == null) {
					list[teamID - 1] = new Team();
					list[teamID - 1].id = teamID;
					list[teamID - 1].scoreList = new int[k + 1];
				}

				list[teamID - 1].scoreList[problemNum] = Math.max(score, list[teamID - 1].scoreList[problemNum]);
				list[teamID - 1].submitNum++;
				list[teamID - 1].lastSubmit = i;

			}
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 1; j <= k; j++) {
					sum += list[i].scoreList[j];
				}
				list[i].totalScore = sum;
			}

			Arrays.sort(list, new Comparator<Team>() {

				@Override
				public int compare(Team o1, Team o2) {
					if (o1.totalScore == o2.totalScore) {
						if (o1.submitNum == o2.submitNum) {
							return o1.lastSubmit - o2.lastSubmit;
						}
						return o1.submitNum - o2.submitNum;
					}
					return o2.totalScore - o1.totalScore;
				}
			});

			for (int i = 0; i < n; i++) {
				if (list[i].id == t) {
					//팀 찾음
					bw.append(String.valueOf(i + 1) + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
