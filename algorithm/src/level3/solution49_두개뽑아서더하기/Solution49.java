package level3.solution49_두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution49 {
    // 두 개를 뽑아서 더한 수가 몇 개가 있을 지 모르기 때문에 리스트를 하나 만든다.
    // for문을 2개 돌리면서 2개를 뽑아 더한 수를 리스트에 담는다.
    // 단, 2개를 뽑아서 더한 수가 리스트에 있으면 넘어간다.
    // 리스트를 오름차순으로 정렬한 후 int배열 answer의 크기를 리스트 사이즈만큼 준다.
    // for문을 돌리면서 answer 배열을 만들어 준다.
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (temp.contains(numbers[i] + numbers[j])) continue;
                temp.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(temp);
        answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
