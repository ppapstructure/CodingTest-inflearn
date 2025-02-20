package Prob2;

import java.util.*;

public class Answer {
    public String solution(String str) {
        String answer = "";
        Stack<Character>stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c==')') {
                while(stack.pop() != '(');
            }
            else stack.push(c);
        }

        for(int i = 0;i<stack.size();i++) {
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.solution(str));

    }
}
