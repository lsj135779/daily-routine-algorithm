package level3.solution46_숫자문자열과영단어;

public class Solution46 {
    class Solution {
        // "zero" ~ "nine" 까지 문자열배열을 만든다.
        // 위에서 만든 문자열배열을 반복문으로 돌린다.
        // 문자열 s에 배열에 있는 것이 포함되어 있으면 숫자로 변환한다.
        // 숫자로 변환된 문자열s를 int형으로 바꿔서 반환한다.
        public int solution(String s) {
            int answer = 0;
            String[] numStrArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i < numStrArr.length; i++) {
                if (s.contains(numStrArr[i])) s = s.replace(numStrArr[i], Integer.toString(i));
            }
            answer = Integer.parseInt(s);
            return answer;
        }
    }
}
