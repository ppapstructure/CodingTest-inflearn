package Prob4;

import java.util.*;

public class Prac {
    public static int[] arr;
    public static int solution(int n) {
        if(arr[n]>0) return arr[n];
        if(n==1) return arr[1]=1;
        else if(n==2) return arr[2]=1;
        else {
            return arr[n]=solution(n-1) + solution(n-2);
        }

    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];

        for(int i = 1;i<=n;i++) System.out.print(T.solution(i)+" ");
    }
}
