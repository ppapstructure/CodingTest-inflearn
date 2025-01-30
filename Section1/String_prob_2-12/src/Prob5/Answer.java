package Prob5;

import java.util.*;

public class Answer {
    public String Solution(String str) {
        String answer = new String();
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        // lt와 rt가 문자열을 순회하며 알파벳만 교체
        while(lt<rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.Solution(str));
    }
}
