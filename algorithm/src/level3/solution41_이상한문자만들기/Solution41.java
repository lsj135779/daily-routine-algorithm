package level3.solution41_이상한문자만들기;

public class Solution41 {
    // 문자열 s를 공백을 기준으로 split 해준다 => 문자열 배열생성
    // 배열을 for문으로 돌리면서 각 단어문자열을 뽑아낸다.
    // 한번 더 단어문자열을 for문 돌려서 인덱스에따라 대소문자로 바꿔준다.
    public String solution1(String s) {
        String answer = "";
        String[] strArray = s.split(" ", -1); // -1을 붙여야 뒤에 공백이 있는경우 그대로 둘 수 있다. (중요!)
        for (int i = 0; i < strArray.length; i++) {
            String tempStr = "";
            for (int j= 0; j < strArray[i].length(); j++) {
                if (j % 2 == 0) {
                    tempStr += strArray[i].substring(j, j+1).toUpperCase();
                } else {
                    tempStr += strArray[i].substring(j, j+1).toLowerCase();
                }
            }
            strArray[i] = tempStr;
        }
        answer = String.join(" ", strArray);
        return answer;
    }

    // 위와 대소문자 변경 방식만 다름
    public String solution2(String s) {
        String answer = "";
        String[] strArray = s.split(" ", -1);
        for (int i = 0; i < strArray.length; i++) {
            String tempStr = "";
            char[] charArray = strArray[i].toCharArray();
            for(int j = 0; j < charArray.length; j++) {
                // 아스키코드 - 대문자 65~90 소문자 97~122
                // 두개의 차이는 32
                if(j % 2 == 0 && charArray[j] >= 97 && charArray[j] <= 122) { // 짝수번째이고 소문자 => 대문자
                    tempStr += (char)(charArray[j] - 32);
                } else if(j % 2 == 1 && charArray[j] >= 65 && charArray[j] <= 90) { // 홀수번째이고 대문자 => 소문자
                    tempStr += (char)(charArray[j] + 32);
                } else {
                    tempStr += charArray[j];
                }
            }
            strArray[i] = tempStr;
        }
        answer = String.join(" ", strArray);
        return answer;
    }


    public String solution3(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
