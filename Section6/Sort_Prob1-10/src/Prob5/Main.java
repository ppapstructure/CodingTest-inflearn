package Prob5;

import java.util.*;

public class Main {
    public char solution(int n, int[] arr) {

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(i!=j && arr[i]==arr[j]) return 'D';
            }
        }

        return 'U';
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n,arr));
    }
}
