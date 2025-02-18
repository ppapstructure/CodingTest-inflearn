package Prob4;

import java.util.*;

public class Answer {
    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();

        for(char x : t.toCharArray()) {
            tm.put(x,tm.getOrDefault(x,0)+1);
        }

        int L = t.length()-1;
        for(int i = 0;i<L;i++) {
            sm.put(s.charAt(i),sm.getOrDefault(s.charAt(i),0)+1);
        }

        int lt = 0;
        for(int rt = L;rt<s.length();rt++) {
            sm.put(s.charAt(rt),sm.getOrDefault(s.charAt(rt),0)+1);
            if(sm.equals(tm)) answer++;

            sm.put(s.charAt(lt),sm.get(s.charAt(lt))-1);
            if(sm.get(s.charAt(lt))==0) sm.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T =  new Answer();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.print(T.solution(s,t));

    }
}
