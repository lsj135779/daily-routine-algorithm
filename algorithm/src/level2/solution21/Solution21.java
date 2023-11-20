package level2.solution21;

public class Solution21 {
    public boolean solution(int x) {
        boolean answer = true;
        int positionNums = 0;
        int harshadNum = x;
        // 자릿수의 합을 구하기
        while (x >= 1) {
            positionNums += x % 10;
            x /= 10;
        }
        // 자릿수의 합으로 나누어 떨어지는 확인 default값이 true이므로 false인지만 확인
        if (!(harshadNum % positionNums == 0)) {
            answer = false;
        }
        return answer;
    }
}
