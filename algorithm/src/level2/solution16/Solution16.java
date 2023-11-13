package level2.solution16;

public class Solution16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;   // 제한조건으로 생각하면 int의 범위를 넘을 수 있다. (-2,147,483,648 ~ 2,147,483,647)
        for (int i = 0; i < n; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }

    // 다른 풀이
    public long[] solution1(int x, int n) {
        long[] result = new long[n];
        result[0] = x;
        for (int i = 1; i < result.length; ++i) {
            result[i] = result[i -1] + x;
        }
        return result;
    }
}