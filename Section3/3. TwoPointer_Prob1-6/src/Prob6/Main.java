package Prob6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = i+1;
        }
        System.out.print(T.solution(n, arr));
    }
}
