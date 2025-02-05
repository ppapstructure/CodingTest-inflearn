package Prob2;

import java.util.*;

public class Main {
    public int solution(int[] arr) {
        int answer =  1;
        int len = arr.length;
        int tmp = arr[0];

        for(int i = 1;i < len; i++) {
            if(tmp < arr[i]) {
                tmp = arr[i];
                answer++;
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
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(arr));
    }
}
