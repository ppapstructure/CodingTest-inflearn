package Prob8;

import java.util.*;

public class Prac {
    public String solution(String s) {
        String answer = new String();

        // 전부 대문자로 바꿔줍니다.
        s = s.toUpperCase();

        // 정규표현식을 이용해서 대문자가 아닌것들을 공백으로 바꿔줍니다.
        answer = s.replaceAll("[^A-Z]", "");

        int len = answer.length();
        // 탐색하면서 다른게 하나라도 있다면 NO를 출력합니다.
//        for(int i = 0;i<len/2;i++) {
//            if(answer.charAt(i) != answer.charAt(len-i-1)) return "NO";
//        }
        String tmp = new StringBuilder(answer).reverse().toString();

        if(answer.equals(tmp)) return "YES";


        return "NO";
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(T.solution(str));

    }
}
