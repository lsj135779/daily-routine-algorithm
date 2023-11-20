package level2.solution22;

public class Solution22 {
    public long solution(int a, int b) {
        long answer = 0;
        int highNum = b;
        int lowNum = a;
        if (a > b) {
            highNum = a;
            lowNum = b;
        }
        // a, b가 같은 경우는 for문 조건에서 해결가능하므로 따로 조건문이 필요없음
        for (int i = lowNum; i <= highNum; i++) {
            answer += i;
        }
//        // 아래와 같이 Math클래스 함수를 이용해서 위에서 따로 변수를 두지 않고 해결할 수 있다.
//        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
//            answer += 1;
//        }
        return answer;
    }
}
