package level3.solution43_크기가작은부분문자열;

public class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) answer++;
        }

        return answer;
    }
}
