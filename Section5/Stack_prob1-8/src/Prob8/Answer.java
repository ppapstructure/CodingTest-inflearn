package Prob8;

import java.util.*;

class People {
    int id;
    int priority;

    public People(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Answer {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<People> Q = new LinkedList<>();

        for(int i = 0;i<n;i++) Q.offer(new People(i,arr[i]));

        while(!Q.isEmpty()) {
            People tmp = Q.poll();

            for(People x : Q) {
                if(tmp.priority<x.priority) {
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }

            if(tmp != null) {
                answer++;
                if(tmp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n, m, arr));
    }
}
