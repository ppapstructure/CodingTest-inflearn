package Prob7;

import java.util.*;

class Node{
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }

}

public class Main {
    Node root;
    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        int L = 0;
        Q.offer(root);

        while(!Q.isEmpty()) {
            int len = Q.size();

            System.out.print(L+" : ");
            for(int i = 0;i<len;i++) {
                Node tmp = Q.poll();
                System.out.print(tmp.data +" ");
                if(tmp.lt != null) Q.offer(tmp.lt);
                if(tmp.rt != null) Q.offer(tmp.rt);
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Main tree = new Main();
        Scanner sc = new Scanner(System.in);
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);

    }
}
