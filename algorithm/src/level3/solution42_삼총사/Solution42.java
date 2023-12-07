package level3.solution42_삼총사;

import java.util.Arrays;

public class Solution42 {
    class Solution {
        public int solution1(int[] number) {
            int answer = 0;
            for (int i = 0; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    for (int k = j + 1; k < number.length; k++) {
                        if (number[i] + number[j] + number[k] == 0) answer++;
                    }
                }
            }
            return answer;
        }
    }

    public int solution2(int[] number) {
        int answer = 0;

        Arrays.sort(number);
        for(int i = 0; i < number.length - 2; i++) {
            for(int j = i + 1; j< number.length - 1; j++) {
                for(int z = j + 1; z < number.length; z++) {
                    if(number[i] + number[j] + number[z] == 0) {
                        answer++;
                    }
                    else if(number[i] + number[j] + number[z] > 0) {
                        break;
                    }
                }
            }
        }
        return answer;
    }

}
