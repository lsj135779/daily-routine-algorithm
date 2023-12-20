package level3.solution62_옹알이2;

public class Solution62 {
    // for문으로 babbling 배열을 돌리면서 문자열을 뽑아낸다.
    // 뽑아낸 문자열이 정해진 4개의 문자열로 조합이 가능한지 확인을 한다.
    // 가능한 경우 answer를 1씩 증가시킨다.
    public int solution1(String[] babbling) {
        int answer = 0;
        String[] pronunciations = {"aya", "ye", "woo", "ma"};
        for (String babble : babbling) {
            for (String pronunciation : pronunciations) {
                if (babble.contains(pronunciation + pronunciation)) { // 같은 발음은 연속으로 불가능
                    break;
                }
                if (babble.contains(pronunciation)) { // 해당 문자열이 있을 경우
                    babble = babble.replace(pronunciation, " "); // 띄워쓰기 없이 빈문자열로 할 경우 위에서 연속된 발음으로 잡힐 수 있음
                }
                if (babble.trim().isEmpty()) { // 조합으로 구성된 문자열인 경우
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }

    // 다른 사람 풀이
    // 가능한 발음을 바로 문자열로 적용
    public int solution2(String[] babblings) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for(int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");

            if(babblings[i].length()  == 0) answer++;

        }
        return answer;
    }
}
