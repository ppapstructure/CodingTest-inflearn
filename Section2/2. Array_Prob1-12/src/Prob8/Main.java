package Prob8;

import java.util.*;

public class Main {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0;i<arr.length;i++) {
            int cnt = 1;

            for(int j = 0;j<arr.length;j++) {
                if(arr[i] < arr[j]) cnt++;
            }

            answer[i] = cnt;
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
            System.out.print(s+" ");

    }
}
