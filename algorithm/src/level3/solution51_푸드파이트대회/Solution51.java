package level3.solution51_푸드파이트대회;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution51 {
    // 음식을 넣을 리스트를 만든다.
    // food배열에서 1번인덱스 값부터 for문을 돌려서 확인한다.
    // 값을 2로 나눈 값으로 1부터 반복해서 리스트에 넣는다.
    // 해당 리스트를 뒤집은 리스트를 얻는다.
    // 완성된 리스트에 물인 0을 넣어준다.
    // 뒤집은 리스트도 더해준다.
    // 리스트를 문자열로 만들어 반환한다.
    public String solution1(int[] food) {
        String answer = "";
        // List<Integer> foodList = new ArrayList<>(); // Integer 리스트
        List<String> foodList = new ArrayList<>(); // String 리스트
        for (int i = 1; i < food.length; i++) {
            int repeatNum = food[i] / 2;
            for (int j = 0; j < repeatNum; j++) {
                // foodList.add(i);
                foodList.add(String.valueOf(i));
            }
        }
        // List<Integer> reverseList = new ArrayList<>(foodList); // Integer 리스트
        List<String> reverseList = new ArrayList<>(foodList); // String 리스트
        Collections.reverse(reverseList);
        // foodList.add(0); // Integer 리스트
        foodList.add("0"); // String 리스트
        foodList.addAll(reverseList);
        // answer = foodList.toString().replaceAll("[^0-9]",""); // Integer 리스트
        answer = String.join("", foodList); // String 리스트
        return answer;
    }


    // 뒷통수 맞았지만 내 코드보다 시간이 오래걸림!
    // 0을 기준으로 날개를 펴라
    public String solution2(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}
