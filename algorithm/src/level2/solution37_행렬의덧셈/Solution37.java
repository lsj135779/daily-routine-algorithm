package level2.solution37_행렬의덧셈;

public class Solution37 {
    // 2차배열을 탐색하며 같은 행, 열의 값을 더해서 새로운 2차배열을 만든다.
    // 2차배열을 탐색하기 위해서 for문을 2개 돌린다.
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
