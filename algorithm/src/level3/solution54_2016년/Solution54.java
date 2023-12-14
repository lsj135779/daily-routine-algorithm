package level3.solution54_2016년;

import java.util.Calendar;

public class Solution54 {
    // Calendar 클래스 이해하기
    // https://m.blog.naver.com/hj_kim97/222930615561 (참고)
    public String solution1(int a, int b) {
        String answer = "";
        Calendar c = Calendar.getInstance();
        c.set(2016, a - 1, b);
        int week = c.get(Calendar.DAY_OF_WEEK);
        switch (week) {
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
            case 7:
                answer = "SAT";
                break;
        }
        return answer;
    }

    // 2016년 한정 코드
    public String solution2(int a, int b) {
        String answer = "";

        int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"}; // 여기서 그 해의 시작이 몇요일인지에 따라 달라짐 (2016년 1월 1일 => 금요일)
        int Adate = 0;
        for(int i = 0 ; i < a - 1; i++){
            Adate += c[i];
        }
        Adate += b - 1;
        answer = MM[Adate % 7];

        return answer;
    }
}
