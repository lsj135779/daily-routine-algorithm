package level3.solution55_카드뭉치;

public class Solution55 {
    // cards1과 cards2를 동시에 이동하면서 탐색을 한다. (랜덤탐색이 아니라 앞에서 부터 차례로 탐색)
    // 기준은 goal이므로 goal을 돌면서 cards1에 있는지 2에 있는지 확인한다.
    // 그러다 해당 문자열에서 각 카드순서에서 안나오면 NO 를 출려한다.
    // for문이 다 돌아가면 YES를 출력한다.
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < goal.length; i++) {
            // if문 조건에서 &&로 2개의 조건이 있는데 앞뒤로 순서가 바뀌면 오류가 난다.
            // AND는 false가 하나라도 나오면 false이기 때문에 뒤를 보지 않는다.
            // 아래 조건 순서가 바뀌면 idx가 cards의 범위를 벗어나서 오류가 뜰 수 있다.
            if (!(idx1 == cards1.length) && goal[i].equals(cards1[idx1])) {
                idx1++;
                continue;
            } else if (!(idx2 == cards2.length) && goal[i].equals(cards2[idx2])) {
                idx2++;
                continue;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
