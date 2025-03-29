package Prob8;

import java.util.*;

public class Prac {
    int[] ch = new int[10001];
    int[] dis = {-1, 1, 5};

    public int BFS(int s, int e) {
        int L = 0;
        Queue<Integer> Q = new LinkedList<>();
        ch[s] = 1;
        Q.offer(s);
        while(!Q.isEmpty()) {
            int len = Q.size();

            for(int i = 0;i<len;i++) {
                int x = Q.poll();
                for(int j = 0;j<3;j++) {
                    int nx = x + dis[j];
                    if(nx == e) return L+1;
                    if(nx>=1&&nx<=10000&&ch[nx]==0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        System.out.print(T.BFS(S,E));

    }
}
