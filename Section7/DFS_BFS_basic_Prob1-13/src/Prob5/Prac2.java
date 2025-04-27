package Prob5;

import java.util.*;

class Node3 {
    int val;
    Node3 lt, rt;
    public Node3(int val) {
        this.val = val;
        lt = rt = null;
    }
}

public class Prac2 {
    public void DFS(Node3 tree) {
        if(tree == null) return;
        else {
            DFS(tree.lt);
            System.out.print(tree.val+" ");
            DFS(tree.rt);
        }
    }

    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Node3 root = new Node3(1);
        root.lt = new Node3(2);
        root.rt = new Node3(3);
        root.lt.lt = new Node3(4);
        root.lt.rt = new Node3(5);
        root.rt.lt = new Node3(6);
        root.rt.rt = new Node3(7);

        T.DFS(root);
    }
}
