package level2.solution13;

import java.util.ArrayList;

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
