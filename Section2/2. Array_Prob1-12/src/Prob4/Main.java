package Prob4;

import java.util.*;

public class Main {
    // 재귀함수로도 구현 가능
    public int solution2(int n) {
        if(n==1) return 1;
        if(n==2) return 1;

        return solution2(n-2) + solution2(n-1);
    }
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2;i<n;i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        for(int i : T.solution(n)) {
//            System.out.print(i+" ");
//        }

        System.out.print(T.solution2(n));
    }
}
