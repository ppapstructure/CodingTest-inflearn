package Prob4;

import java.util.*;

public class Main {
    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for(int i = 0;i<n;i++) {
            // 캐시 순회
            for(int j = 0;j<size;j++) {
                // 캐시 히트
                if(arr[i] == cache[j]) {
                    for(int k = j;k>0;k--) {
                        cache[k] = cache[k-1];
                    }
                    cache[0] = arr[i];
                    break;
                }
            }
            // 캐시 미스
            if(cache[0] != arr[i]) {
                for (int k = size - 1; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = arr[i];
            }

//           for(int k = 0;k<size;k++) {
//               System.out.print(cache[k]+" ");
//           }
//           System.out.println();
        }

        return cache;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        for(int x : T.solution(s,n,arr))
            System.out.print(x+" ");

    }
}
