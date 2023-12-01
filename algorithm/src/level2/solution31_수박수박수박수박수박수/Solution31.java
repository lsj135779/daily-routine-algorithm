package level2.solution31_수박수박수박수박수박수;

public class Solution31 {
    // 홀수는 "수" 가 하나 더 붙는다고 접근한다.
    // "수박"이 짝으로 나온다.
    // while문을 돌려가며 "수박"을 빼주면서 n에서 2를 빼준다.
    // n = 1이면 "수"만 붙이고 빠져나온다. (n = 0 이 되면 while문 안들어감)
    public String solution(int n) {
        String answer = "";
        while(n > 0) {
            if (n == 1) {
                answer += "수";
                break;
            }
            answer += "수박";
            n -= 2;
        }
        return answer;
    }
}
