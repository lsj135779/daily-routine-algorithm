package level3.solution68_햄버거만들기;

public class Solution68 {
	// ingredient배열을 for문으로 돌린다.
	// 빵-야채-고기-빵 => 1,2,3,1 순으로 쌓여야 햄버거로 포장이 가능하다.
	// 새로만든 배열에 ingredient를 하나씩 넣는다.
	// 넣는 과정에서 1231햄버거가 만들어지면 배열의 idx를 돌려서 새로 하나씩 넣는다.
	public int solution(int[] ingredient) {
		int answer = 0;
		int[] stack = new int[ingredient.length];
		int idx = 0;
		for (int num : ingredient) {
			stack[idx] = num;
			if (idx >= 3) {
				if (stack[idx] == 1 && stack[idx - 1] == 3 && stack[idx - 2] == 2 && stack[idx - 3] == 1) {
					answer++;
					idx -= 3;
					continue;
				}
			}
			idx++;
		}
		return answer;
	}
}
