package Prob5;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        this.data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;
    public void DFS(Node t) {
        if(t==null) return;
        else{
            DFS(t.lt);
            DFS(t.rt);
            System.out.print(t.data);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.DFS(T.root);
    }
}
