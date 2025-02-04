package Prob11;

import java.util.*;

public class Prac {
    public String solution(String s) {
        String answer = "";
        StringBuilder tmp = new StringBuilder();
        int cnt = 1;
        char c = s.charAt(0);
        tmp.append(c);
        s += " ";

        for(int i = 1;i < s.length(); i++) {
            if(c == s.charAt(i)) cnt++;
            else{
                if(cnt > 1) tmp.append(cnt);
                tmp.append(s.charAt(i));
                cnt = 1;
                c = s.charAt(i);
            }
        }

        answer = tmp.toString();
        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        s += " ";
        int cnt = 1;

        for(int i = 0; i< s.length()-1;i++) {
            if(s.charAt(i) != s.charAt(i+1)) {
                answer += s.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt);
                cnt = 1;
            }
            else cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
//        System.out.print(T.solution(s));
        System.out.print(T.solution2(s));
    }
}
