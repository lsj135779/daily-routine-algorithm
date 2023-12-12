package level3.solution48_K번째수;

import java.util.Arrays;

public class Solution48 {
    // commands를 for문을 돌면서 int배열을 뽑아온다.
    // int배열의 0번째 인덱스 수 ~ 1번째 인덱스 수 만큼의 길이를 갖는 int배열을 만든다.
    // 2번째 인덱스에 해당하는 수에 있는 숫자를 뽑아낸다.
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1] - 1;
            int position = command[2] - 1;
            int[] intArr = new int[end - start + 1];
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = array[start];
                start++;
            }
            // int[] intArr = Arrays.copyOfRange(array, start, end + 1);
            Arrays.sort(intArr);
            answer[idx] = intArr[position];
            idx++;
        }

        return answer;
    }
}
