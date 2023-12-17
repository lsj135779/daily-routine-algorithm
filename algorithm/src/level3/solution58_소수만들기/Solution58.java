package level3.solution58_소수만들기;

public class Solution58 {
    // nums에서 3개의 수를 선택해서 더해준다. (삼중for문)
    // 3개의 수를 더해준 값이 소수인지 확인한다.
    // 소수는 1과 자신의 수 외에는 나눌 수 없는 숫자이다.
    // 그러므로 1부터 자신까지 for문으로 나누면서 나머지가 0인지 확인한다.
    public int solution(int[] nums) {
        int answer = 0;
        int primeNum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    primeNum = nums[i] + nums[j] + nums[k];
                    // 소수인지 확인하기
                    boolean check = true;
                    // 아래 조건으로 바꾸면 시간을 단축할 수 있다.
                    // for (int num = 2 ;num <= (int)Math.sqrt(primeNum); num++)
                    for (int num = 2; num < primeNum; num++) {
                        if (primeNum % num == 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) answer++;
                }
            }
        }
        return answer;
    }
}
