package level3.solution52_콜라문제;

public class Solution52 {
    // 처음 n개의 병을 가지고 있을 때 빈병 a개 => 새병 b개를 얻는다.
    // 남는 빈병을 담아 놓는 temp를 만들어 둔다.
    // 빈병 개수가 최소 빈병개수보다 낮을 경우 temp와 합쳐서 바꿀 수 있는지 확인해 본다.
    // 최종적으로 빈병개수가 부족하면 바꿨던 모든 병의 개수를 구한다.
    public int solution1(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        while (n >= a) {
            answer += n / a * b; // 바꾼 병의 개수
            temp += n % a; // 바꾸지 않고 남은 병의 개수
            n = n / a * b;
            if (n < a) { // 바꿀 병의 개수가 부족할 경우
                n += temp;
                temp = 0;
            }
        }
        return answer;
    }

    // 위에 코드는 바꾸다 부족한 경우 남았던 병을 가지고 가는 방식이다.
    // 남은 병의 개수를 마트 갈 때 마다 가지고 가면 된다.
    public int solution2(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        while (n >= a) {
            answer += n / a * b; // 바꾼 병의 개수
            temp = n % a; // 바꾸지 않고 남은 병의 개수
            n = n / a * b + temp; // 남는 병도 포함해서 가져가기
        }
        return answer;
    }

    public int solution3(int a, int b, int n) {
        return (n - b) / (a - b) * b;
    }
}
