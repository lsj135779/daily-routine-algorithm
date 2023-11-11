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
}
