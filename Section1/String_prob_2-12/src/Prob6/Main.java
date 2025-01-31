package Prob6;

import java.util.*;

public class Main {
    public String Solution(String str) {
        String answer = "";
        int len = str.length();
        char[] arr = new char[len];

        int idx = 0;
        for(int i = 0;i<len;i++) {
            // 중복유무
            boolean is_true = false;

            // 탐색
            for(int j = 0;j<len;j++) {
                if(arr[j] == str.charAt(i)) {
                    is_true = true;
                }
            }
            if(!(is_true)) {
                arr[idx] = str.charAt(i);
                idx++;
            }

        }

        answer = answer.valueOf(arr).substring(0,idx);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.Solution(str));


    }
}
