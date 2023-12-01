package level2.solution29_제일작은수제거하기;

public class Solution29 {
    // answer 배열의 크기를 arr 배열의 길이에서 1를 뺀 것으로 생성한다. (최소값 제외하므로)
    // arr의 0번째 요소를 최소값으로 지정한다.
    // for문으로 arr를 돌리면서 최소값과 비교하면서 더 작은 경우 최소값을 그 요소로 변경한다.
    // 최소값을 제외하기 위해 다시 for문을 돌려서 최소값인 요소만 빼고 answer배열을 초기화한다.
    // arr 길이가 1인 경우를 조건문으로 빼준다.
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        if (arr.length == 1) return new int[]{-1};
        for (int num : arr) {
            min = (num < min) ? num : min;
        }
        int idx = 0;
        for (int num : arr) {
            if (num != min) {
                answer[idx] = num;
                idx++;
            }
        }
        return answer;
    }
}
