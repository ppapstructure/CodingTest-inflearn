package Prob2;
import java.util.*;

// 2번 대소문자 변환
public class Prac {
    public String solution(String str) {
        char[] newStr = str.toCharArray();
        String answer = "";
        for(char x : newStr) {
            // x가 대문자라면 소문자로 바꿔서 answer에 추가.
            if(Character.isUpperCase(x)) {
                x = Character.toLowerCase(x);
                answer += x;
            }
            // x가 소문자라면 대문자로 바꿔서 answer에 추가.
            else {
                x = Character.toUpperCase(x);
                answer += x;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        char[] arr = str.toCharArray();

        for(char x : arr)  {
            // 대문자 --> 소문자
            if(x<='Z' && x >= 'A') {
                x = (char)(x + ('a'-'A'));
                answer += x;
            }
            // 소문자 --> 대문자
            else {
                x = (char)(x - ('a'-'A'));
                answer += x;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        System.out.print(T.solution(str));
        System.out.print(T.solution2(str));
    }
}