package Prob2;

import java.util.*;

public class Prac {
    String ans = "";

    public void DFS(int n) {
        if(n==0) return;

        else {
            DFS(n/2);
            ans += n%2;
        }

    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);
        int result = Integer.parseInt(T.ans);
        System.out.print(result);
    }
}
