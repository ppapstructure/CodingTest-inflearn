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
        Node root;
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        T.DFS(root);
    }
}
