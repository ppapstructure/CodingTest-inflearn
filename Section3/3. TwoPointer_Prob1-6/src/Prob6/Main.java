package Prob6;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k,int[] arr) {
        int answer = 0,lt=0;
        int cnt = 0;
        for(int rt = 0;rt<n;rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, k,arr));
    }
}