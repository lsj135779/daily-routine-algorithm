package level2.solution14;

import java.util.ArrayList;

public class Solution14 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if (n == 1) return 1;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0 && !numbers.contains(i)) {
                if (i*i == n) numbers.add(i);
                else {
                    numbers.add(i);
                    numbers.add(n / i);
                }
            } else continue;
        }
        for (int number : numbers) {
            answer += number;
        }
        return answer;
    }

    // n/2 보다 큰 약수는 본인 자신 뿐이다.
    // answer의 초기값을 n으로 두고 시작한다.
    public int solution2(int n) {
        int answer = n;
        if (n == 1) return 1;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
