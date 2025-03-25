package Prob4;

import java.util.*;

public class Main {
    public ArrayList<Integer> fibo(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        for(int i = 2; i < n;i++) {
            arr.add(arr.get(i-1)+arr.get(i-2));
        }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : T.fibo(n)) System.out.print(x+" ");

    }
}
