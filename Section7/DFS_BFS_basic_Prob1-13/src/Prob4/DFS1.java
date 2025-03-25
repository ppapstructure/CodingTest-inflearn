package Prob4;

import java.util.*;

public class DFS1 {
    public int DFS(int n) {
        if(n==1) return 1;
        else if (n==2) return 1;
        else return DFS(n-1) + DFS(n-2);
    }

    public static void main(String[] args) {
        DFS1 T = new DFS1();
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        for(int i = 1;i<=n;i++) System.out.print(T.DFS(i)+" ");
    }
}
