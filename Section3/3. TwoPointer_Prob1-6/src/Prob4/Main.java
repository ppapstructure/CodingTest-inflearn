package Prob4;

import java.util.*;

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        for(int i = 0;i<n;i++) {
            int tmp = 0;
            for(int j = i;j<n;j++) {
                tmp += arr[j];
                if(tmp == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public int solution2(int n, int m, int[] arr) {
        int answer = 0, sum=0 ,lt = 0;

        for(int rt = 0;rt<n;rt++) {
            sum += arr[rt];
            if(sum == m) answer++;
            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution2(n,m,arr));



    }
}
