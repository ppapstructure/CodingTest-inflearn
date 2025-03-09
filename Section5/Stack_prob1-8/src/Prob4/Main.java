package Prob4;

import java.util.*;

public class Main {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer>stack = new Stack<>();

        for(char c : s.toCharArray()) {
            int lt=0, rt=0;
            if(c=='+') {
                rt = stack.pop();
                lt = stack.pop();
                stack.push(lt+rt);
            } else if(c=='-') {
                rt = stack.pop();
                lt = stack.pop();
                stack.push(lt-rt);
            } else if (c == '*') {
                rt = stack.pop();
                lt = stack.pop();
                stack.push(lt*rt);
            } else if (c == '/') {
                rt = stack.pop();
                lt = stack.pop();
                stack.push(lt/rt);
            } else {
                stack.push(c - '0');
            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(T.solution(s));

    }
}
