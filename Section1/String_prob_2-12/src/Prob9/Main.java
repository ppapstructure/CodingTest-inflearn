package Prob9;

import java.util.*;

public class Main {
    public int Solution(String str) {
        int answer = 0;
        String su = "";
        // 문자열에서 숫자만 추출
        for(int i = 0;i<str.length();i++) {
            if(str.charAt(i) >= '0' && str.charAt(i)<= '9') {
                su += str.charAt(i);
            }
        }

        // 0이외의 최초의 숫자가 등장하는 부분부터추가
        for(int i = 0;i<su.length();i++) {
            if(su.charAt(i) != '0') {
                su = su.substring(i);
                break;
            }
        }


        // 1의자리수부터 숫자로 추가하는 과정
        for(int i = 0;i<su.length();i++) {
            answer += (int)(su.charAt(i)-48);
            answer *= 10;
        }

        answer /= 10;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.Solution(str));
    }
}
