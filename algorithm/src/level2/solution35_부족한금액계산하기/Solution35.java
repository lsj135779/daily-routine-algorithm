package level2.solution35_부족한금액계산하기;

public class Solution35 {
    // price가 count 늘어날때마다 n배가 되기때문에 for문을 돌아준다.
    // 그렇게 다 더한 값에서 money를 빼준다.
    // money가 더 크면 0을 리턴한다.
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }
        return answer >= money ? answer - money : 0;
    }
}
