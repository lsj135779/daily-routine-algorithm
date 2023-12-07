package level3.solution44_최소직사각형;

public class Solution44 {
    class Solution {
        // 명함을 돌릴 수 있으므로 가로길이 <-> 세로길이 변할 수 있다.
        // 각 명함들을 0번째 인덱스에 가장 큰 길이를 두고 1번째 인덱스에 가장 작은 길이를 둔다. (회전을 하는것 의미)
        // 각 인덱스에서 가장 큰 수들을 뽑아낸 후 곱한 값을 출력한다.
        public int solution(int[][] sizes) {
            int answer = 0;
            int maxWidth = 0;
            int maxHeight = 0;
            for (int[] size : sizes) {
                if (size[0] < size[1]) {
                    int temp = size[0];
                    size[0] = size[1];
                    size[1] = temp;
                }
                if (size[0] > maxWidth) maxWidth = size[0];
                if (size[1] > maxHeight) maxHeight = size[1];
            }
            answer = maxWidth * maxHeight;
            return answer;
        }
    }
}
