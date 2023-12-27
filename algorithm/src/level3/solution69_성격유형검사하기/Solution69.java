package level3.solution69_성격유형검사하기;

public class Solution69 {
	// 점수배열을 만든다.
	// survey배열을 for문으로 돌면서 질문을 뽑아낸다.
	// 질문의 선택지가 7이므로 4를 기준으로 낮으면 질문왼쪽에 점수를 주고 높으면 질문오른쪽에 점수를 준다.
	// 최종적으로 R와T, C와F, J와M ,A와N 점수에 따라 성격유형을 뽑아낸다.
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		int[] score = {3,2,1,0,1,2,3};
		String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
		int[] result = new int[8];
		for (int i  = 0; i < survey.length; i++) {
			// survey에서 성격 유형 정하기
			char type = ' ';
			if (choices[i] < 4) {
				type = survey[i].charAt(0);
			} else if (choices[i] > 4) {
				type = survey[i].charAt(1);
			}
			// 성격 유형에 따라 점수주기
			switch (type) {
				case 'R':
					result[0] += score[choices[i] - 1];
					break;
				case 'T':
					result[1] += score[choices[i] - 1];
					break;
				case 'C':
					result[2] += score[choices[i] - 1];
					break;
				case 'F':
					result[3] += score[choices[i] - 1];
					break;
				case 'J':
					result[4] += score[choices[i] - 1];
					break;
				case 'M':
					result[5] += score[choices[i] - 1];
					break;
				case 'A':
					result[6] += score[choices[i] - 1];
					break;
				case 'N':
					result[7] += score[choices[i] - 1];
					break;
			}
		}
		// 결과에 따라 해당하는 성격유형 뽑아내기
		for (int i = 0; i < result.length; i += 2) {
			if (result[i] >= result[i+1]) {
				answer += types[i];
			} else {
				answer += types[i+1];
			}
		}
		return answer;
	}
}
