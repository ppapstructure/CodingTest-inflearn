package Prob11;

import java.util.*;

public class Main {
    static int n,m, answer=0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int nv : graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n+1];

        for(int i=0;i<=n;i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.print(answer);

    }
}
