package Prob2;

import java.util.*;

public class Prac2 {
    // 아스키 코드 사용.
    public String solution2(String str) {
        String answer = new String();

        for(char x : str.toCharArray()) {
            // 대문자면 소문자로
            if(x>='A' && x<='Z') {
                char t = (char)(x + ('a'-'A'));
                answer += t;
            }
            // 소문자면 대문자로
            else if(x>='a' && x<='z') {
                char t = (char)(x - ('a'-'A'));
                answer += t;
            }
        }

        return answer;
    }

    public ArrayList<Character> solution(String str) {
        ArrayList<Character>ch = new ArrayList<>();

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                ch.add(Character.toUpperCase(x));
            }
            else if(Character.isUpperCase(x)) {
                ch.add(Character.toLowerCase(x));
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        for(char x : T.solution(str)) System.out.print(x);
        System.out.print(T.solution2(str));
    }
}
