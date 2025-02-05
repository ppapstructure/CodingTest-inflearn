package Prob3;

import java.util.*;

public class Main {
    public char[] solution(int n,int[] A, int[] B) {
        char[] answer = new char[n];

        for(int i = 0;i<n;i++) {
            // 비긴경우
            if(A[i] == B[i]) answer[i] = 'D';

            // A가 이긴경우
            else if(A[i] == B[i]+1 || (B[i]==3&&A[i]==1)) answer[i] = 'A';

            // B가 이긴경우
            else answer[i] = 'B';
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0;i<n;i++)
            A[i] = sc.nextInt();
        for(int i = 0;i<n;i++)
            B[i] = sc.nextInt();

        for(char c : T.solution(n,A,B)) {
            System.out.println(c);
        }
    }
}
