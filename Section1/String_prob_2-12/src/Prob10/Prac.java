package Prob10;

import java.util.*;

public class Prac {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;

        // 왼쪽에서 오른쪽으로 순회하며 거리 측정
        for(int i = 0;i<str.length();i++) {
            if(str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        // 오른쪽에서 왼쪽으로 순회하며 거리 측정
        for(int i = str.length() - 1; i >= 0 ;i--) {
            if(str.charAt(i) == t)  p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        for(int a : T.solution(str,t)) {
            System.out.print(a + " ");
        }
    }
}