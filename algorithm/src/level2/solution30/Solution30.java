package level2.solution30;

public class Solution30 {
    // s의 길이를 구한다. => s의 길이 절반을 구한다.
    // s의 길이가 홀수인지 짝수인지에 따라서 가져올 index를 정한다.
    // answer에 해당 인덱스의 값으로 초기화한다.
    public String solution(String s) {
        String answer = "";
        int sMidLen = s.length() / 2;
        answer = (s.length() % 2 == 0) ? s.substring(sMidLen - 1, sMidLen + 1) : s.substring(sMidLen, sMidLen + 1);
        return answer;
    }
}
