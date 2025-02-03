package Prob12;

import java.util.*;

public class Main {
    public String solution(int n, String str) {
//        String[] newStr = new String[n];

        for(int i = 0;i<n;i++) {
            String tmp = str.substring((i*7),(i*7)+7);

            int[] arr = new int[7];

            for(int j = 0;j<7;j++) {
                if (tmp.charAt(j) == '#') arr[j] = 1;
                else if(tmp.charAt(j) == '*') arr[j] = 0;
            }

            // 2진수를 10진수로.
            for(int k = 0;k<7;k++) {


            }
            System.out.println();
        }

//        newStr[n-1] += str.substring(0,7);


        return "";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.print(T.solution(n,str));

    }
}
