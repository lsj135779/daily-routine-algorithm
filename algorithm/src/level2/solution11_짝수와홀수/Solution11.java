package level2.solution11_짝수와홀수;

public class Solution11 {
    public static String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}