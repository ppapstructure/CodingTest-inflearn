package Prob9;

import java.util.*;

public class Answer {
    public int solution(String str) {
//        int answer = 0;
        String answer = "";

        // Sol1)
//        for(char x : str.toCharArray()) {
//            if(x>='0' && x <= '9') {
//                answer = answer*10 + (int)(x - '0');
//            }
//        }

        // Sol2)
        for(char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer+=x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));

    }

}
