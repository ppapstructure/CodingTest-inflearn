package Prob11;

import java.util.*;

public class Answer {
    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int len = s.length();
        int cnt = 1;

        for(int i = 0;i<len-1;i++) {
            if(s.charAt(i) != s.charAt(i+1)) {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
            else cnt++;

        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
