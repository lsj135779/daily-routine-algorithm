package level2.solution26_음양더하기;

public class Solution26 {
    // absolutes 배열과 signs 배열을 for문으로 돌린다. (둘의 길이는 같음)
    // if 조건문으로 signs 배열의 요소들을 사용한다.
    // true면 양수 false면 음수로 바꿔서 absolutes 배열의 요소들을 answer에 더해준다.
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            // if (signs[i]) {
            //     answer += absolutes[i];
            // } else {
            //     answer += -absolutes[i];
            // }
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}
