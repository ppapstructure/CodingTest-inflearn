package Prob7;

import java.util.*;

public class Prac {
    public String solution(String s) {
        int len = s.length();
        // 전부 대문자로 바꿔주고
        s = s.toUpperCase();

        for(int i = 0;i<len/2;i++) {
            if(s.charAt(i) != s.charAt(len-i-1)) return "NO";
        }

        return "YES";
    }

    public String solution2(String s) {

        s = s.toUpperCase();
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) return"YES";

        return "NO";
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

//        System.out.print(T.solution(str));
        System.out.print(T.solution2(str));

    }
}
