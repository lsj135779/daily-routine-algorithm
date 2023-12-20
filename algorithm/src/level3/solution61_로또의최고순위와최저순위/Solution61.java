package level3.solution61_로또의최고순위와최저순위;

import java.util.Arrays;

public class Solution61 {
    // lottos배열을 for문으로 돌려서 0인 것은 따로 카운트를 해둔다.
    // 그 외는 win_nums에 있는지 없는지 여부를 파악해서 카운트한다.
    // 최고 순위는 카운트한 것에 0을 카운트한 것을 더한것의 순위 이고 최저는 카운트만을 따졌을 때 순위이다.
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(win_nums);
        for (int lotto : lottos) {
            if (lotto == 0) {
                answer[0]++;
                continue;
            }
            else if (Arrays.binarySearch(win_nums, lotto) >= 0){
                answer[0]++;
                answer[1]++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            switch(answer[i]) {
                case 0:
                    answer[i] = 6;
                    break;
                case 1:
                    answer[i] = 6;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 6:
                    answer[i] = 1;
                    break;
            }
        }
        return answer;
    }
}
