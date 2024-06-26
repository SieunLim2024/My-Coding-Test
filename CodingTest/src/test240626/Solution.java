package test240626;
//[PCCE 기출문제] 9번 / 이웃한 칸
//각 칸마다 색이 칠해진 2차원 격자 보드판이 있습니다. 
//그중 한 칸을 골랐을 때, 위, 아래, 왼쪽, 오른쪽 칸 중 같은 색깔로 칠해진 칸의 개수를 구하려고 합니다.
//보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트 board와 고른 칸의 위치를 나타내는 두 정수 h, w가 주어질 때 
//board[h][w]와 이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 개수를 return 하도록 solution 함수를 완성해 주세요.
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String now =board[h][w];
        
        if(h>0&&now.equals(board[h-1][w])){
            answer++;
        }
        if(w>0&&now.equals(board[h][w-1])){
            answer++;
        }
        if(h<board.length-1&&now.equals(board[h+1][w])){
            answer++;
        }
        if(w<board[h].length-1&&now.equals(board[h][w+1])){
            answer++;
        }
        
        return answer;
    }
}