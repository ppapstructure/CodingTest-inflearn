package Prob4;

import java.util.*;

public class Prac {
    public int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        for(int i = 0;i<n;i++) {
            int pos = -1;
            // 캐시 히트
            for(int j=0;j<s;j++) {
                if(arr[i] == cache[j]) {
                    pos = j;

                    for (int k = pos; k > 0; k--) {
                        cache[k] = cache[k - 1];
                    }

                    cache[0] = arr[i];
                }
            }

            // 캐시 미스
            if(pos == -1) {
                for(int j = s-1;j>0;j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = arr[i];
            }

        }

        return cache;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n; i++) arr[i] = sc.nextInt();

        for(int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }

    }
}
