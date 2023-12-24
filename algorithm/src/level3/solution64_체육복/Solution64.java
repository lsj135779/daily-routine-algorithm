package level3.solution64_체육복;

import java.util.Arrays;

public class Solution64 {
    // n의 크기를 갖는 배열을 만든다.
    // lost인 학생은 배열에서 false로 둔다.
    // for문으로 돌리면서 reserve가 있고 왼쪽이나 오른쪽에 false이면 하나를 true로 만들어준다.
    // 배열에서 true인 사람들만 count 한다.
    // reserve에 있는 학생이 lost에 있을 수 있다. true, false로만 구분해서 하면 안됨
    // 5, [2, 3, 4], [1, 2, 3]  결과:4  테스트 케이스 추가해서 진행
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] students = new int[n + 2];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 잃어버린 학생
        for (int i = 0; i < lost.length; i++) {
            students[lost[i]]--;
        }
        // 빌려줄 수 있는 학생
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i]]++;
        }
        // 체육복 빌려주기
        for (int i = 1; i < students.length; i++) {
            if (students[i] == 1) {
                if (students[i - 1] == -1) students[i - 1]++;
                else if (students[i + 1] == -1) students[i + 1]++;
            }
            // 체육복 없는 사람 빼기
            if (students[i - 1] == -1) answer--;
        }
        return answer;
    }
}
