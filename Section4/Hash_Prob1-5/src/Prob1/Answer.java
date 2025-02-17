package Prob1;

import java.util.*;

public class Answer {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        // 해쉬맵 생성.
        for(char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

//        System.out.print(map);
        int max = -1;
        for(char key : map.keySet()) {
//            System.out.println(key+ " "+map.get(key));
            if(max<map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(map);
        System.out.println(map.containsKey('F'));
        System.out.println(map.size());
        System.out.println(map.remove('C'));
        System.out.println(map);
        System.out.println(map.keySet());

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.print(T.solution(n,s));

    }
}
