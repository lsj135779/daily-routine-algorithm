package level3.solution67_둘만의암호;

public class Solution67 {
	// 문자열 s의 길이만큼 for문을 돌린다.
	// 전에 푼 문제 알파벳 넘기기를 이용해서 index만큼 소문자를 이동한다.
	// 단, skip에 있는 문자는 넘긴다.
	public String solution(String s, String skip, int index) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			int next = 1;
			char temp = s.charAt(i);
			while(next <= index) {
				// temp = temp == 'z' ? 'a' : (char) (temp + 1);
				temp = (char)('a' + (temp + 1 - 'a') % 26); // z -> a 이므로 소문자 전체 수 26
				if (!skip.contains(String.valueOf(temp))) {
					next++;
				}
			}
			answer += String.valueOf(temp);
		}
		return answer;
	}
}
