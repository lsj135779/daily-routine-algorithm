package level2.solution19;

public class Solution19 {
    public long solution(long n) {
        long answer = 0;
        if (Math.sqrt(n) % 1 == 0) { // n의 제곱근을 1로 나눴을 때 나머지가 0이면 양수
//        if (Math.floor(Math.sqrt(n)) == Math.sqrt(n)) { // n의 제곱근을 내림했을 때 n의 제곱근과 같으면 양수
            answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        } else {
            return -1;
        }
        return answer;
    }
}
