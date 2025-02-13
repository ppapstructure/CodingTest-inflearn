package Prob1;

import java.util.*;

public class Main {
    public char solution(int n, char[]arr) {
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> vote = new HashMap<>();
        vote.put('A', 0);
        vote.put('B', 0);
        vote.put('C', 0);
        vote.put('D', 0);
        vote.put('E', 0);

        for(char c : arr) {
            if (vote.containsKey(c)) { // 해당 문자가 HashMap에 존재하면
                vote.put(c, vote.get(c) + 1); // 기존 값 +1 증가
            }
        }

        for(char s : vote.keySet()) {
            if(max < vote.get(s)) {
                max = vote.get(s);
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        char[] arr = input.toCharArray();

        System.out.print(T.solution(n,arr));

    }
}
