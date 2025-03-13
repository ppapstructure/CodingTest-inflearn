package Prob7;

import java.util.*;

public class Main {
    public String solution(String s1, String s2) {
        Queue<Character> Q1 = new LinkedList<>();
        Queue<Character> Q2 = new LinkedList<>();

        for(char c : s1.toCharArray()) Q1.offer(c);
        for(char c : s2.toCharArray()) Q2.offer(c);

        while(!Q2.isEmpty()) {
            if(Q1.peek() == Q2.peek()) {
                Q1.poll();
                Q2.poll();
            }
            else
                Q2.poll();

            if(Q1.isEmpty()) return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.print(T.solution(s1,s2));
    }
}
