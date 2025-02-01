package Prob8;

import java.util.*;

public class Answer {
    public String Solution(String str) {
        String answer = "YES";

        str = str.toUpperCase();
        str = str.replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) return answer;

//        System.out.print(str);
        return "NO";
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.Solution(str));

    }
}