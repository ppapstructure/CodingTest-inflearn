package Prob4;

import java.util.*;

public class Main {
    public int solution(String s, String t) {
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        int answer = 0;

        for(char x : t.toCharArray()) {
            am.put(x,am.getOrDefault(x,0)+1);
        }
        int L = t.length() -1;
        for(int i =0;i<L;i++)
            bm.put(s.charAt(i),bm.getOrDefault(s.charAt(i),0)+1);

        int lt = 0;
        for(int rt = L;rt<s.length();rt++) {
            bm.put(s.charAt(rt),bm.getOrDefault(s.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;

            bm.put(s.charAt(lt),bm.get(s.charAt(lt))-1);
            if(bm.get(s.charAt(lt))==0) bm.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.print(T.solution(s,t));
    }
}