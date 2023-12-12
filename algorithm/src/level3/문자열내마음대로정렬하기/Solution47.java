package level3.문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution47 {
    import java.util.*;

    class Solution {
        // 문자열배열 strings에서 인덱스 n에 해당하는 문자를 뽑아내서 문자열배열로 저장한다.
        // 뽑아낸 문자열배열을 중복된 문자열 제거하고 오름차순으로 정렬한다.
        // 문자열배열을 for문으로 돌리면서 해당 문자가 strings배열의 n에 해당하는 문자열이면 answer에 넣어준다.
        // !! 여러개 중복된 경우 오름차순으로 정렬한다.
        public String[] solution1(String[] strings, int n) {
            String[] answer = new String[strings.length];
            String[] wordArr = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                wordArr[i] = strings[i].substring(n,n+1);
            }
            wordArr = Arrays.stream(wordArr).distinct().toArray(String[]::new); // 중복된 문자는 제외
            Arrays.sort(wordArr);
            int idx = 0;
            for (String word : wordArr) {
                // 중복된 경우가 있기에 리스트를 만들어서 저장한다.
                List<String> strList = new ArrayList<>();
                for (int i = 0; i < strings.length; i++) {
                    if (strings[i].substring(n,n+1).equals(word)) {
                        strList.add(strings[i]);
                    }
                }
                Collections.sort(strList); // 중복된 경우 오름차순(사전순)으로 정렬
                for (String str : strList) {
                    answer[idx] = str;
                    idx++;
                }
                strList = new ArrayList<>(); // 리스트 초기화
            }
            return answer;
        }


        // n번째 인덱스에 해당하는 문자를 각 문자열 맨앞에 붙여서 정렬을 한다.
        // 그리고 앞에 붙인 문자를 제외하고 문자열배열을 얻어낸다.
        public String[] solution2(String[] strings, int n) {
            String[] answer = {};
            ArrayList<String> arr = new ArrayList<>();
            for (int i = 0; i < strings.length; i++) {
                arr.add(strings[i].charAt(n) + strings[i]);
            }
            Collections.sort(arr);
            answer = new String[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                answer[i] = arr.get(i).substring(1, arr.get(i).length());
            }
            return answer;
        }
    }

// Comparable 과 Comparator의 이해
}
