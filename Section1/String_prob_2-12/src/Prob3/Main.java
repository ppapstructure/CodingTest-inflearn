package Prob3;

import java.util.Scanner;

public class Main {
    public void Solution(String str) {
        String[] newStr = str.split(" ");
        String answer = "";
        // int len = newStr[0].length();
        int len = Integer.MIN_VALUE;

        for(String s : newStr) {
            if(len < s.length()) {
                len = s.length();
                answer = s;
            }
        }

        System.out.print(answer);
    }

    public void Solution2(String str) {
        String answer = "";
        int len = Integer.MIN_VALUE;

        while(str.indexOf(" ") != -1) {
            int idx = str.indexOf(" ");
            String tmp = str.substring(0,idx);

            if(len<tmp.length()) {
                len = tmp.length();
                answer = tmp;
            }
            str = str.substring(idx+1);
        }
        if(len < str.length()) {
            len = str.length();
            answer = str;
        }
        System.out.print(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

//        T.Solution(str);
        T.Solution2(str);
    }
}
