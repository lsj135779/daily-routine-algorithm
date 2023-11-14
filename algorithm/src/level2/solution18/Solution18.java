package level2.solution18;

public class Solution18 {
        public int solution(String s) {
            int answer = 0;
            String sign = s.split("")[0]; // 부호 확인용
            String num = s.substring(1,s.length()); // 부호 제외한 숫자
            if (sign == "+") {
                answer = Integer.parseInt(num);
            } else if (sign == "-") {
                answer = -Integer.parseInt(num);
            } else {
                answer = Integer.parseInt(s);
            }
            return answer;
        }
}
