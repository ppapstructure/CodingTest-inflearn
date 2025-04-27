package Prob3;

import java.util.*;

public class Prac {
    public int fac(int n) {
        if(n==1) return 1;
        else return n*fac(n-1);
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);

        System.out.print(T.fac(5));
    }
}
