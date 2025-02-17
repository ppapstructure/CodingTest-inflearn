package Prob2;

import java.util.*;

public class Main {
    public String solution(String a, String b) {

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for(char c : a.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c,0)+1);
        }

        for(char c : b.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c,0)+1);
        }

        boolean is_true = true;
        for(char c : mapA.keySet()) {
            if(mapB.containsKey(c) && mapA.get(c) == mapB.get(c)) {
//                System.out.println("mapA: "+ c +mapA.get(c));
//                System.out.println("mapB: "+ c +mapB.get(c));
            }
            else {
                is_true = false;
            }
        }


        if(is_true) {
            return "YES";
        }else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.print(T.solution(a,b));
    }
}
