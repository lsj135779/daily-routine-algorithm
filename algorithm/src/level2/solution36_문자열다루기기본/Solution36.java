package level2.solution36_문자열다루기기본;

public class Solution36 {
    // s를 char배열로 만든다.
    // for문을 돌면서 char에 0을 더해서 숫자형으로 만들어서 조건을 확인한다.
    // 아스키코드에서 숫자가 48 ~ 57이고 대문자가 65 ~ 90, 소문자가 97 ~ 122 이다.
    // 57을 넘어가는 조건이 되면 숫자가 아니므로 answer를 false로 초기화한다.
    // 숫자가 아닌 문자가 1개라도 나오면 for문을 종료한다.
    public boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] + 0 > 57) {
                    answer = false;
                    break;
                }
            }
        } else answer = false;
        return answer;
    }
}
