package level2.solution34_문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution34 {
    // 문자열 s를 char 배열로 만들어준다.
    // for 문을 돌리면서 int배열에 문자를 int로 저장한다.
    // int 배열을 내림차순하고 문자로 바꿔서 answer에 더해준다.
    public String solution1(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        Integer[] intArr = new Integer[s.length()];
        for (int i = 0; i < charArr.length; i++) {
            intArr[i] = (int)charArr[i];
        }
        Arrays.sort(intArr, Collections.reverseOrder());
        for (int num : intArr) {
            answer += (char)num;
        }
        return answer;
    }

    public String solution2(String s) {
        // char배열을 오름차순으로 정렬한다.
        // for문으로 뒤에서부터 answer에 String으로 변환해서 더한다.
        String answer = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = charArr.length - 1; i >= 0; i--) {
            answer += String.valueOf(charArr[i]);
        }
        return answer;
    }

    public String solution3(String s) {
        String answer = "";
        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        answer = String.join("",strArr);
        return answer;
    }
}
