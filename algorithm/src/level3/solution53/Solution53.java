package level3.solution53;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution53 {
    // k길이를 가지는 배열을 만든다.
    // for문으로 score를 돌면서 위에서 만든 배열에 점수를 넣는다.
    // 점수를 넣는 과정에서 배열에 있는 점수보다 높으면 낮은 점수를 빼고 넣는다.
    // answer에는 배열에서 가장 낮은 점수를 넣는다.
    public int[] solution1(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) { // 일단 명예의 전당 채우기
                hallOfFame.add(i, score[i]);
            } else {
                if (hallOfFame.get(0) < score[i]) { // 새로받은 점수가 명예의 전당에서 가장 낮은 점수보다 높은 경우 바꿔주기
                    hallOfFame.set(0, score[i]);
                }
            }
            Collections.sort(hallOfFame); // 오름차순으로 정렬
            answer[i] = hallOfFame.get(0); // 가장 낮은 점수 넣기
        }
        return answer;
    }


    public int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }



        return answer;
    }
}
