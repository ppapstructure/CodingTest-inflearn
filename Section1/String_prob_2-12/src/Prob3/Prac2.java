package Prob3;
import java.util.*;

public class Prac2 {
    public void solution(String str) {
        String[] tmp = str.split(" ");
        String answer = "";
        int len = Integer.MIN_VALUE;

        for(String s : tmp) {
            if(len < s.length()) {
                len = s.length();
                answer = s;
            }
        }

        System.out.print(answer);
    }

    public void solution2(String str) {
        String answer = "";
        int len = Integer.MIN_VALUE;

        while(str.indexOf(" ") != -1) {
            int idx = str.indexOf(" ");
            String tmp = str.substring(0,idx);

            if(len < idx) {
                len = idx;
                answer = tmp;
            }
//            System.out.println(tmp);
            str = str.substring(idx+1);
        }

        if(len < str.length()) answer = str;
        System.out.print(answer);
//        System.out.println(str);
    }

    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        T.solution(str);
        T.solution2(str);
    }
}
