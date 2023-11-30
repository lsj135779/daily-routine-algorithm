package level2.최대공약수와최소공배수;

public class Solution39 {
    // n의 약수들로 m을 나눴을 때 0이 되는 수 중에서 가장 큰 수가 최대공약수가 된다.
    // 최소 공배수는 n과 m을 곱한 수에서 최대공약수를 나누면 된다.
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int minNum = Math.min(n,m);
        int maxNum = Math.max(n,m);
        int gcd = 0;
        if (maxNum % minNum == 0) gcd = minNum;
        else {
            for(int i = 1; i <= minNum/2; i++) {
                if(minNum % i == 0 && maxNum % i == 0) {
                    gcd = i;
                }
            }
        }
        answer[0] = gcd;
        answer[1] = m * n / gcd;
        // answer[0] = gcd(n,m);
        // answer[1] = m * n / answer[0];
        return answer;
    }

    // 재귀함수!!
    // public static int gcd(int a, int b) {
    //     if (b == 0) return a;
    //     return gcd(b, a % b);
    // }
}
