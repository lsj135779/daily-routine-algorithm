package level2.solution38;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String answer = "";
        String aString = "";
        for (int i = 1; i <= a; i++) {
            aString += "*";
        }
        for (int i = 1; i <= b; i++) {
            answer += aString + "\n";
        }
        String[][] tdArr = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tdArr[i][j] = "*";
            }
        }
        System.out.println(answer);
    }
}
