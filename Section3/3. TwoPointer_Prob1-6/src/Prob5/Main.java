package Prob5;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0, sum=0, lt=0;

        for(int rt = 0; rt < n-1; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;

            while(sum >= n) {
//                System.out.println("rt : " + rt);
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }

        return answer;
    }

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
