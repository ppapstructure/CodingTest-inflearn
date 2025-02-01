package Prob7;

import java.util.*;

public class Answer {
    public String Solution(String str) {
        String answer = "YES";
        int len = str.length();

        // 문자를 대문자로 통일
        str = str.toUpperCase();
        // 문자열을 순회하면서 확인
        for(int i = 0;i<len/2;i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    public String Solution2(String str) {
        String answer = "YES";

        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) return answer;

        return "NO";
    }
    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        System.out.print(T.Solution(str));
        System.out.print(T.Solution2(str));

    }
}
