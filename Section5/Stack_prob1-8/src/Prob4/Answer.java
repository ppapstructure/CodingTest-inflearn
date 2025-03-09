package Prob4;

import java.util.*;

public class Answer {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer>stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) stack.push(c-'0');
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c=='+') stack.push(lt+rt);
                else if(c=='-') stack.push(lt-rt);
                else if(c=='*') stack.push(lt*rt);
                else stack.push(lt/rt);
            }
        }

        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(T.solution(s));

    }
}
