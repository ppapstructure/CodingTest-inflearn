package Prob8;
//
import java.util.*;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for(int i = 0;i<n;i++) Q.offer(new Person(i,arr[i]));

        while(!Q.isEmpty()) {
            Person tmp = Q.poll();

            for(Person x : Q) {
                if(tmp.priority < x.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp != null) {
                answer++;
                if(m == tmp.id) return answer;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n,m,arr));

    }
}
