package Prob5;

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
    public static void DFS2(Node2 root) {
        if(root==null) return;
        DFS2(root.lt);
        DFS2(root.rt);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        Node2 root = new Node2(1);
        root.lt = new Node2(2);
        root.rt = new Node2(3);
        root.lt.lt = new Node2(4);
        root.lt.rt = new Node2(5);
        root.rt.lt = new Node2(6);
        root.rt.rt = new Node2(7);

        DFS2(root);
    }
}
