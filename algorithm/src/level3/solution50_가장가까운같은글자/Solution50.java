package level3.solution50_가장가까운같은글자;

import java.util.ArrayList;
import java.util.List;

public class Solution50 {
    // s문자열을 문자열배열로 만든다.
    // for문으로 문자열배열을 돌리면서 만들어둔 리스트에 하나씩 담는다.
    // 담는 과정에서 해당 문자열이 리스트에 없는 경우 -1을 answer에 넣어준다.
    // 리스트에 있을 경우에는 해당 문자열이 있는 마지막 인덱스를 찾아와 차이값을 answer에 넣어준다.
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] strArr = s.split("");
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (tempList.contains(strArr[i])) { // 다른조건 => indexOf가 -1이 나온 경우
                answer[i] = i - tempList.lastIndexOf(strArr[i]);
            } else {
                answer[i] = -1;
            }
            tempList.add(strArr[i]);
        }

        return answer;
    }
}
