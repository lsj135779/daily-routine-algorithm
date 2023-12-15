package level3.solution56_과일장수;

import java.util.Arrays;

public class Solution56 {
    // score를 내림차순으로 정렬한다.
    // 1상자에 m개씩 담으므로 for문을 m - 1 씩 올리면서 돌린다.
    // 남은 개수가 m보다 작으면 for문을 종료시킨다.
    // k는 최대 점수인데... 의미가 있나?
    public int solution1(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int[] box = new int[m];
        int boxIdx = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            box[boxIdx] = score[i]; // 상자 채우기
            boxIdx++;
            if (box[m - 1] != 0) { // 상자가 가득참
                answer += m * box[m - 1];
                box = new int[m]; // 새로운 상자 가져오기
                boxIdx = 0;
            }
        }
        return answer;
    }

    // 상자 채우는 과정 필요없이 m씩 인덱스를 줄이면서 score를 보면 m개씩 담는 상자의 최저 점수이다.
    // 그래서 answer에 (상자의 최저 점수 * 한 상자에 들어가는 사과의 수) 를 더한다.
    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
