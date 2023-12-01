package level2.solution23_콜라츠추측;

public class Solution23 {
    public int solution(long num) {
        int answer = 0;
        while (answer <= 500) {
            if (num == 1) break; // while문 종료 조건
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1; // 이 과정에서 int범위를 넘어갈 수 있음
            }
            answer++;
        }
        if (answer == 501) answer = -1;
        return answer;
    }
}
