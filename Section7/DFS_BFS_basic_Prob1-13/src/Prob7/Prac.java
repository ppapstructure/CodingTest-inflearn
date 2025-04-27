package Prob7;

import java.util.*;

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class Prac {
    Node2 root;


    public void BFS(Node2 root) {
        Queue<Node2> q = new LinkedList<>();
        q.offer(root);
    }

    public static void main(String[] args) {
        Prac tree = new Prac();
        Scanner sc = new Scanner(System.in);
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);

        tree.BFS(tree.root);

    }
}
