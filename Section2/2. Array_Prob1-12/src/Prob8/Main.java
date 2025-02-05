package Prob8;

import java.util.*;

public class Main {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int max = arr[0];
        int idx = -1;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                idx = i;
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

        for(int s : T.solution(arr))
        System.out.print(1);

    }
}
