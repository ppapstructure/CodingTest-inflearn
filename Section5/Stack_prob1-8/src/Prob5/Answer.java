package Prob5;

import java.util.*;

public class Answer {
    public int solution(String s) {
        int answer = 0;
        Stack<Character>stack = new Stack<>();

        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
            else if(s.charAt(i) == ')') {
                if(s.charAt(i-1)=='(') {
                    stack.pop();
                    answer += stack.size();
                }
                else {
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        System.out.print(T.solution(t));
    }
}
