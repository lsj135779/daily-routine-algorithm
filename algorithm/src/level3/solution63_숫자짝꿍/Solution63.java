package level3.solution63_숫자짝꿍;

public class Solution63 {
    // X와 Y에 공통으로 있는 것들을 뽑아내 리스트에 저장한다.
    // 내림차순으로 정렬한다.
    // 리스트를 문자열로 반환한다.
    // 시간복잡도 줄이는게 문제!!
    public String solution(String X, String Y) {
        String answer = "";
        // // 9부터 0까지 내려가면서 X, Y에 있는 경우 바로 answer에 더해준다.
        // // 시간초과!!!
        // int number = 9;
        // while (number >= 0) {
        //     String num = String.valueOf(number);
        //     if (X.contains(num) && Y.contains(num)) {
        //         answer += num;
        //         X = X.replaceFirst(num, "");
        //         Y = Y.replaceFirst(num, "");
        //     } else {
        //         number--;
        //     }
        // }

        // 다른방식으로 진행
        // X, Y 문자열이 각 숫자 몇개로 구성되어 있는지 확인한다.
        // 각 숫자의 최저 숫자만큼만 반복해서 answer에 더해준다. (9부터)
        int numCnt = 0;
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        for (String x : X.split("")) {
            xArr[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            yArr[Integer.parseInt(y)]++;
        }
        for (int num = 9; num >= 0; num--) {
            numCnt = Math.min(xArr[num], yArr[num]);
            answer += String.valueOf(num).repeat(numCnt);
        }

        if (answer.isEmpty()) answer = "-1"; // 짝꿍이 없는 경우
        else if (answer.charAt(0) == '0') answer = "0"; // 짝꿍이 0만 있는 경우
        return answer;
    }
}
