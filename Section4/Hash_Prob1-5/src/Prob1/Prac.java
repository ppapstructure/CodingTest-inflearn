package Prob1;

import java.util.*;

public class Prac {
    public char solution(int n, String s) {
        char answer = ' ';

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max = -1;
        for(char c : map.keySet()) {
            if(max < map.get(c)) {
                max = map.get(c);
                answer = c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.print(T.solution(n,s));
    }
}