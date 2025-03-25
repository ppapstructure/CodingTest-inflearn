package Prob4;

import java.util.*;

public class DFS2 {
    public static int[] arr;
    public int DFS(int n) {
        if(arr[n]>0) return arr[n];
        if(n==1) return arr[1]=1;
        else if (n==2) return arr[2]=1;
        else return arr[n]=DFS(n-1) + DFS(n-2);
    }

    public static void main(String[] args) {
        DFS2 T = new DFS2();
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        arr = new int[n+1];
        T.DFS(n);
        for(int i = 1;i<=n;i++) System.out.print(arr[i]+" ");
    }
}
