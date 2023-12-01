package level2.solution20_정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution20 {
    public long solution(long n) {
        long answer = 0;
        Integer[] numArr = new Integer[(int)Math.log10(n)+1];
        int idx = 0;
        while (n >= 1) {
            numArr[idx] = (int)(n % 10);
            n /= 10;
            idx++;
        }
        Arrays.sort(numArr, Collections.reverseOrder());
        answer = Long.parseLong(Arrays.toString(numArr).replaceAll("[^0-9]",""));
        return answer;
    }
}
