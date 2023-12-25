package level3.solution65_문자열나누기;

public class Solution65 {
    // map을 생성한다.
    // s를 split을 사용해서 문자열배열을 만들어준다.
    // for문을 돌려서 map에 새로운 키인지 기존에 있는 키인지에 따라 값을 카운트해준다.
    // map의 size가 2이상일 때 키set을 확인해서 새로 추가한 키값과 기존에 있는 키값을 비교해서 같은 경우 answer를 1더해준다.
    public int solution(String s) {
        // int answer = 0;
        // Map<String, Integer> hashMap = new HashMap<String, Integer>();
        // String[] words = s.split("");
        // for (String word : words) {
        //     if (!hashMap.containsKey(word)) {
        //         hashMap.put(word, 1);
        //     } else {
        //         hashMap.replace(word, hashMap.get(word) + 1);
        //     }
        //     if (hashMap.size() > 1) {
        //         Set<String> keySet = hashMap.keySet();
        //         for (String key : keySet) {
        //             if (!key.equals(word) && hashMap.get(key) == hashMap.get(word)) {
        //                 System.out.println(hashMap);
        //                 answer++;
        //                 hashMap = new HashMap<String, Integer>();
        //                 break;
        //             }
        //         }
        //     }
        // }
        // if (hashMap.size() > 0) answer++;
        // return answer;


        // 문제 이해를 잘 못함!!
        // 처음 나온 문자를 x로 두고 x와 x가 아닌 문자가 같아질 경우 카운트를 해야한다.
        int answer = 1; // 마지막 남은거 카운트
        String[] words = s.split("");
        String firstWord = words[0];
        int same = 1;
        int diff = 0;
        for (int i = 1; i < words.length; i++) {
            if (same == diff) {
                answer++;
                same = 1;
                diff = 0;
                firstWord = words[i];
            } else {
                if (words[i].equals(firstWord)) same++;
                else diff++;
            }
        }
        return answer;
    }
}
