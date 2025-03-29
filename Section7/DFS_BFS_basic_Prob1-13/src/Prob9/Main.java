package Prob9;

import java.util.*;

class Node {
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}

public class Main {
    Node root;

    public int DFS(int L, Node root) {
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1,root.lt), DFS(L+1,root.rt));
    }

    public int BFS(int L, Node root) {
        Queue<Node> Q = new LinkedList<>();

        Q.offer(root);
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0;i<len;i++) {
                Node tmp = Q.poll();
                if(tmp.lt == null && tmp.rt == null) return L;
                if(tmp.lt != null) Q.offer(tmp.lt);
                if(tmp.rt != null) Q.offer(tmp.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(0);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);

//        System.out.print(T.DFS(0,T.root));
        System.out.print(T.BFS(0,T.root));
    }
}
