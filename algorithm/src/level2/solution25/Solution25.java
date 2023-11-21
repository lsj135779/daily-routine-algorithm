package level2.solution25;

import java.util.Arrays;

class Solution25 {
    // arr 배열을 오름차순으로 정렬한다.
    // 반복문으로 arr 배열의 요소들을 탐색하면서 divisor로 나눴을 때 나머지가 0인 것을 찾는다.
    // 찾은 요소들을 선언한 문자열에 더한다.
    // 더할 때 구분자를 넣어주고 처음에 넣어진 구분자는 삭제한다. (나중에 split 하기 위해서)
    // 해당 문자열을 split했을 때 길이로 answer 크기를 지정해준다.
    // for문으로 문자열을 int로 변환해서 answer 배열에 넣어준다.
    // 문자열읠 길이가 0이면 answer 배열을 [-1] 로 만든다.
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        String temp = "";
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp += "%" + arr[i];
            }
        }
        if (temp.length() == 0) {
            answer = new int[] {-1};
        } else {
            temp = temp.substring(1);
            String[] tempArr = temp.split("%");
            answer = new int[tempArr.length];
            for (int i = 0; i < tempArr.length; i++) {
                answer[i] = Integer.parseInt(tempArr[i]);
            }
        }
        return answer;
        // 아래 코드는 오름차순이랑 [-1] 기준은 제외한 코드
//        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}
