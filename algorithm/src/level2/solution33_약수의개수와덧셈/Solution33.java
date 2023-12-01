package level2.solution33_약수의개수와덧셈;

public class Solution33 {
    // left 부터 right 까지 for문으로 돌린다.
    // 해당숫자를 1부터 반절까지 for문을 돌리면서 약수인지 확인한다.
    // 약수면 count를 올린다.
    // count가 짝수인지 홀수인지 확인해서 더할지 뺄지를 정한다.
    public int solution(int left, int right) {
        int answer = 0;
        for (int num = left; num <= right; num++) {
            // 1부터 시작하는 것은 본인 자신
            int count = 1;
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) count++;
            }
            if (count % 2 == 0) answer += num;
            else {
                answer -= num;
            }
        }
        return answer;
    }
}
