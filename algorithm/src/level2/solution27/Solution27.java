package level2.solution27;

public class Solution27 {
    // phone_number 길이만큼 for문을 돌린다.
    // answer에 "*"을 더하다가 마지막 4자리는 숫자 그대로 더해준다.
    // 반복문을 종료한다.
    public String solution(String phone_number) {
        String answer = "";
        String lastFourNum = phone_number.substring(phone_number.length() - 4);
        for (int i = 0; i < phone_number.length(); i++) {
            if (i == phone_number.length() - 4) {
                answer += lastFourNum;
                break;
            } else answer += "*";
        }
        return answer;
    }
}
