package Prob1;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character>stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if (c=='(') stack.push(c);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.solution(str));
    }
}
