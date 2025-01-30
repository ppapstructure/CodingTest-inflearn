package Prob4;

import java.util.Scanner;

public class Main {
    public void Solution(int n, String[] str) {
        for(int i = 0;i<n;i++) {
            int len = str[i].length();
            for(int j = len-1;j>=0;j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0;i<n;i++) {
            str[i] = sc.next();
        }

        T.Solution(n, str);
    }
}
