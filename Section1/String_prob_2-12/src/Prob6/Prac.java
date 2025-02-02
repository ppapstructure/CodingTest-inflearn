package Prob6;

import java.util.*;

public class Prac {
    public String solution(String str) {
        String answer = "";
        int len = str.length();

        for(int i = 0;i<len;i++) {
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.solution(str));
    }
}
