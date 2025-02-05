package Prob7;

import java.util.*;

public class Main {
    public int solution(int[] arr) {
        int answer = 0;
        int len = arr.length;
        int score = 1;

        for(int i = 0;i<len;i++) {
            if(arr[i] == 1) {
                answer += score;
                score++;
            }
            else {
                score = 1;
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
