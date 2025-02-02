package Prob11;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        char tmp = str.charAt(0);
        int cnt = 1;

        for(int i = 1;i<str.length();i++) {
            if(tmp == str.charAt(i)) cnt++;
            else {
                answer += tmp;
                if(cnt != 1) answer += (char)(cnt + 48);
                tmp = str.charAt(i);
                cnt = 1;
            }
        }

        answer += tmp;
        if (cnt != 1) answer += (char)(cnt + 48);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
