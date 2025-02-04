package Prob9;

import java.util.*;

public class Prac {
    public int solution(String s) {
        String tmp = s.replaceAll("[^0-9]","");
        int num = Integer.valueOf(tmp);

        return num;
    }

    public int solution2(String s) {
        int answer = 0;

        for(char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer = answer*10 + (int)(c - '0');
            }
        }
        return answer;
    }

    public int solution3(String s) {
        String answer = "";

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) answer += c;
        }

        return Integer.valueOf(answer);
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        System.out.print(T.solution(str));
//          System.out.print(T.solution2(str));
          System.out.print(T.solution3(str));

    }
}
