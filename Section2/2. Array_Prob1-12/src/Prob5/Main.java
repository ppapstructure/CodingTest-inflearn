package Prob5;

import java.util.*;

public class Main {
    public int solution(int n) {
        int answer = 0;
        if(n>2) answer++;

        for(int i = 3;i<=n;i++) {
            boolean is_true = true;
            for(int j = 2;j<=i/2;j++) {
                if(i%j==0) {
                    is_true = false;
                    break;
                }
            }
            if(is_true) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(T.solution(n));

    }

}
