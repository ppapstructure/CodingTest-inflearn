package Prob7;

import java.util.*;

class Point implements Comparable<Point> {
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.x != point.x)
            return this.x - point.x;
        else
            return this.y - point.y;
    }

}

public class Main  {
    public Point[] solution(int n, Point[] arr) {
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];

        for(int i = 0;i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Point(a,b);
        }


        for(Point t : T.solution(n,arr)) {
            System.out.println(t.x+" "+t.y);
        }

    }
}
