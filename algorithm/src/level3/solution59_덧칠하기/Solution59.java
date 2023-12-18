package level3.solution59_덧칠하기;

import java.util.Arrays;

public class Solution59 {
    // 전체 구역은 n개 이고 한 번에 칠할 수 있는 구역은 m개이다.
    // 칠해야할 곳은 section 배열에 저장되어 있다.
    // while 문으로 1 ~ n까지 돌려서 칠해야 할 구역이 나오면 m개를 더하고 다음 페인트 시작점을 저장하고 answer은 1을 카운트한다.
    // 페인트칠한 끝지점을 기준으로 section은 페인트칠을 했다고 체크를 해둔다.
    // 페인트칠할 구역이 다 완성되면 페인트한 횟수를 출력한다.
    public int solution1(int n, int m, int[] section) {
        int answer = 0;
        Boolean[] paintCheck = new Boolean[section.length]; // 페인트 체크
        Arrays.fill(paintCheck, false); // false로 배열 채우기
        int paintStart = 1;
        int sectionIdx = 0;
        while (paintStart <= n) {
            if (Arrays.asList(paintCheck).indexOf(false) == -1) break; // 모든 구역이 칠해졌을 경우
            if (paintStart == section[sectionIdx]) { // 페인트칠할 구역에 왔을 경우
                paintStart += m;
                for (int i = sectionIdx; i < paintCheck.length; i++) {
                    if (section[i] < paintStart) {
                        paintCheck[i] = true; // 페인트칠 완료
                    }
                }
                answer++;
                sectionIdx = Arrays.asList(paintCheck).indexOf(false);
            } else {
                paintStart++;
            }
        }

        return answer;
    }


    // 어차피 페인트칠한 구역은 section으로 정해져 있기 때문에 1 ~ n 까지 다 살펴볼 이유가 없다.
    public int solution2(int n, int m, int[] section) {
        int answer = 0;
        int current = 1;
        for(int i = 0; i < section.length; i++) {
            if(current <= section[i]) {
                current = section[i] + m;
                answer++;
            }
        }
        return answer;
    }
}
