package Prob12;

import java.util.*;

public class Prac {
    public String solution(int n,String s) {
        String answer = "";
        for(int i = 0;i<n;i++) {
            String tmp = s.substring(0,7);
            tmp = tmp.replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.print(T.solution(n,str));

    }
}
