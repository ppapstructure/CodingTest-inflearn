package Prob8;

import java.util.*;

public class Main {
    int[] dis = {-1, 1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;

        while(!Q.isEmpty()) {
            int len = Q.size();

            for(int i = 0;i<len;i++) {
                int x = Q.poll();
                for(int j = 0;j<3;j++) {
                    int nx = x + dis[j];
                    if(nx == e) return L+1;
                    if(nx>0&&nx<10001&&ch[nx]==0) {
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
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();

        System.out.print(T.BFS(S,E));

    }
}
