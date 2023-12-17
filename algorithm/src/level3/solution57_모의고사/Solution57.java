package level3.solution57_모의고사;

public class Solution57 {
    // 1번 수포자 [1,2,3,4,5]   5개 반복
    // 2번 수포자 [2,1,2,3,2,4,2,5] 8개 반복
    // 3번 수포자 [3,3,1,1,2,2,4,4,5,5] 10개 반복
    // answer를 반복문으로 돌리면서 각 수포자들의 답과 같은지 확인한다.
    // 같은 답일 경우 카운트를 해준다.
    // 가장 많은 답을 맞춘 수포자를 answer로 출력한다.
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % 5]) score1++;
            if (answers[i] == student2[i % 8]) score2++;
            if (answers[i] == student3[i % 10]) score3++;
        }
        // 최고 점수 찾기
        int max = Math.max(score1, Math.max(score2, score3));
        // 경우의 수 8가지
        if (max == score1) {
            if (max == score2) {
                if (max == score3) {
                    answer = new int[]{1,2,3};
                } else {
                    answer = new int[]{1,2};
                }
            } else if (max == score3) {
                answer = new int[]{1,3};
            }else {
                answer = new int[]{1};
            }
        } else if (max == score2) {
            if (max == score3) {
                answer = new int[]{2,3};
            } else {
                answer = new int[]{2};
            }
        } else if (max == score3) {
            answer = new int[]{3};
        }

        return answer;
    }
}
