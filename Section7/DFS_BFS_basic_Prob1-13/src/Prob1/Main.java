package Prob1;

import java.util.*;

public class Main {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);
    }
}
