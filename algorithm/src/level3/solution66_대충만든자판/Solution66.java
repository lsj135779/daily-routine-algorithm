package level3.solution66_대충만든자판;

public class Solution66 {
    // targets배열를 for문을 돌려서 문자열 1개씩 뽑아낸다.
    // 뽑아낸 문자열을 문자배열로 만들어 문자 한 개씩 뽑아낸다.
    // 뽑아낸 문자가 keymap에 있는 문자열들 중에서 가장 앞에 위치한 값을 가져와서 count에 더한다. (keymap에 없는 경우 -1)
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            String[] target = targets[i].split("");
            for (String word : target) { // 문자열에서 1개의 문자뽑기
                int min = 10001; // target의 최대길이(100) * keymap의 원소의 최대길이(100)
                for (int j = 0; j < keymap.length; j++) {
                    if (keymap[j].contains(word)) {
                        min = Math.min(min, keymap[j].indexOf(word) + 1);
                    }
                }
                count += min;
                if (min == 10001) {
                    answer[i] = -1;
                    break;
                }
            }
            if (!(count >= 10001)) answer[i] = count;
        }
        return answer;
    }
}
