package Prob6;

import java.util.*;

public class Answer {
    public String Solution(String str) {
        String answer = "";

        for(int i = 0;i<str.length();i++) {
//            System.out.println(str.charAt(i)+" "+str.indexOf(str.charAt(i)));
            if(i==str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.print(T.Solution(str));
    }
}
