package level2.solution12_평균구하기;

public class Solution12 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int num : arr) {
            answer += num;
        }
        return answer / arr.length;
    }
}
