package level2.solution17_자연수뒤집어배열로만들기;

public class Solution17 {
    public int[] solution(long n) {
        // n을 string 으로 바꿔서 length 를 이용해 길이를 구할 수 있음.
        int[] answer = new int[(int)Math.log10(n)+1]; // n의 길이 구하기
        int idx = 0;
        while (n >= 1) {
            answer[idx] = (int)(n % 10); // int 형으로 변환
            idx++;
            n = n / 10;
        }
        return answer;
    }
}
