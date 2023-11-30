package level2.solution40_3진법뒤집기;

public class solution40 {
    // 빈문자열을 만들고 반복문을 통해 n을 3으로 나눴을 때 나머지를 문자열에 더해준다.
    // 위와 같이 진행하면 3진법을 만든 후 앞뒤 반전한 문자열을 얻을 수 있다.
    // 문자열을 배열로 만들고 for문으로 돌리면서 Math.pow(및, 지수)를 활용해서 10진법으로 표현해준다. (answer에 나온 값들을 더하기)
    public int solution(int n) {
        int answer = 0;
        String ternaryStr = "";
        while (n >= 1) {
            ternaryStr += n % 3;
            n /= 3;
        }
        String[] strArr = ternaryStr.split("");
        for (int i = 0; i < strArr.length; i++) {
            answer += Math.pow(3, i) * Integer.parseInt(strArr[strArr.length - i - 1]);
        }
        return answer;

//        return Integer.parseInt(ternaryStr, 3);
    }
}
