package level3.solution45_시저암호;

public class Solution45 {
    // s 문자열을 toCharArray()로 문자배열을 만든다.
    // 만든 문자배열을 for문으로 돌린다.
    // ' '인 경우는 그대로 두고 대문자는(65 ~ 90), 소문자(97 ~ 122)을 이용해서 n만큼 이동한다.
    // z or Z 를 넘어간 경우 다시 a or A 부터 다시 돈다.
    public String solution1(String s, int n) {
        String answer = "";
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') continue; // 공백인 경우
            if (charArr[i] >= 'A' && charArr[i] <= 'Z') { // 대문자인 경우
                if (charArr[i] + n > 'Z') charArr[i] = (char)('A' + (charArr[i] + n - 'Z' -1));
                else charArr[i] = (char)(charArr[i] + n);
            } else { // 소문자인 경우
                if (charArr[i] + n > 'z') charArr[i] = (char)('a' + (charArr[i] + n - 'z' -1));
                else charArr[i] = (char)(charArr[i] + n);
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }

    // n이 1이상 25이하인 자연수라는 제한 조건이 없을 경우
    public String solution2(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()) {
            if(ch == ' ') {
                answer += ch;
            } else if(ch >= 'a' && ch <= 'z'){
                answer += (char)('a' + (ch + n - 'a') % 26);
            } else {
                answer += (char)('A' + (ch + n - 'A') % 26);
            }
        }
        return answer;
    }
}
