package level3.solution60_기사단원의무기;

public class Solution60 {
    // 1 ~ number까지 각 숫자의 약수 개수를 가지는 배열을 만든다.
    // for문으로 배열을 돌려서 limit을 넘어가는 경우 power로 그 요소를 바꾼다.
    // 배열의 모든 요소를 더한 값을 출력한다.
    // 그냥 약수의 개수를 구하고 limit 넘어가는 것만 바꾸고 바로바로 answer에 저장해서 출력하면 될 거 같다. (시간이 오래걸림)
    public int solution1(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (j * j == i) cnt ++;
                else if (i % j == 0) cnt += 2;
            }
            if (cnt > limit) answer += power;
            else answer += cnt;
        }
        return answer;
    }

    // 약수 개수를 가지는 배열을 만드는 방식
    // 1 ~ number까지 나눠지는 곳에 1씩 더해주며 배열을 만든다.
    public int solution2(int number, int limit, int power) {
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}
