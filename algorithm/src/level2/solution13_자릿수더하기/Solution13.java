package level2.solution13_자릿수더하기;

public class Solution13 {
    public int solution(int n) {
        int answer = 0;
        while(n >= 1) {
            int positionalNum;
            positionalNum = n % 10;
            answer += positionalNum;
            n /= 10;
        }
        return answer;
    }
}
