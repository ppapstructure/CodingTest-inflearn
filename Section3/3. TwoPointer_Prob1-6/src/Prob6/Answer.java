package Prob6;

import java.util.*;

public class Answer {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, cnt=0;
        int k = 0;
        for(int rt = 0;rt<n;rt++) {
            if(arr[rt] == 0) cnt++;

            while(cnt>m) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            k = rt-lt+1;
            System.out.printf("%d %d %d\n", lt, rt, k);
            answer = Math.max(answer, k);
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n,m,arr));
    }
}

