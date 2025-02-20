package Prob2;

import java.util.*;

public class Main {
    public ArrayList<Character> solution(String str) {
        ArrayList<Character> answer = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == ')')  {
                while(!stack.isEmpty()) {
                    if(stack.peek()=='(') {
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
            }
            else {
                stack.push(c);
            }

        }

        while(!stack.isEmpty()) {
            answer.add(stack.pop());
        }

        Collections.reverse(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(char x : T.solution(str)) System.out.print(x);
    }
}
