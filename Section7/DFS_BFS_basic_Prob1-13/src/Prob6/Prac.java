package Prob6;

import java.util.*;

public class Prac {
    static int[] ch;
    static int n;

    public void DFS(int t) {
        if(t == n+1) {
            String output = "";
            for(int i = 1;i<n+1;i++) {
                if(ch[i]==1) {
                    output += i+" ";
                }
            }
            if(output.length()>0) System.out.println(output);
        }
        else {
            ch[t] = 1;
            DFS(t+1);
            ch[t] = 0;
            DFS(t+1);
        }
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n+1];
        T.DFS(1);
    }
}
