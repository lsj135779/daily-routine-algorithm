package level2.solution28;

public class Solution28 {
    // 1~9까지 for문을 돈다.
    // 각 숫자가 numbers 배열에 있는지 확인한다.
    // 있는 숫자만 answer에 더해준다.
    // 45에서 answer를 빼준다.
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            for (int number : numbers) {
                if (number == i) {
                    answer += i;
                    break;
                }
            }
        }
        return 45 - answer;
    }
}
