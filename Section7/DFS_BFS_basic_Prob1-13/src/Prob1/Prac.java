package Prob1;

import java.util.*;

public class Prac {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        T.DFS(n);
    }
}
