package programmerschool.lv1;

import java.util.*;
//달리기 경주
//얀에서는 매년 달리기 경주가 열립니다. 
//해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
//예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때,
//해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

//선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 
//해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 
//경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 
//return 하는 solution 함수를 완성해주세요.
class Race {
    public String[] solution(String[] players, String[] callings) {
        // 선수 이름을 key로, 순위를 value로 매핑하는 HashMap 생성
        HashMap<String, Integer> mappedByPlayer = new HashMap<>();

        // 초기 선수들의 순위를 저장
        for (int i = 0; i < players.length; i++) {
            mappedByPlayer.put(players[i], i);
        }

        // callings에 따라 추월 처리
        for (String calling : callings) {
            // 추월한 유저의 현재 순위
            int currentRank = mappedByPlayer.get(calling);

            if (currentRank > 0) { // 맨 앞에 있는 유저는 추월할 수 없으므로 체크
                // 바로 앞의 플레이어 이름
                String frontPlayer = players[currentRank - 1];

                // 두 선수의 순위 교환
                players[currentRank - 1] = calling;
                players[currentRank] = frontPlayer;

                // 순위 정보를 갱신
                mappedByPlayer.put(calling, currentRank - 1);
                mappedByPlayer.put(frontPlayer, currentRank);
            }
        }

        // 최종 순위 반환
        return players;
    }
}
