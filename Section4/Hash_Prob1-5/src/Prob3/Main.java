package Prob3;

import java.util.*;

public class Main {
    public int[] solution(int a, int b, int[] arr) {
        int[] answer = new int[a-b+1];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<b;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        answer[0] = map.size();

        for(int i = 0;i<a-b;i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)-1);
            if(map.get(arr[i]) == 0) map.remove(arr[i]);
            map.put(arr[a-b+i+1],map.getOrDefault(arr[a-b+i+1],0)+1);
            answer[i+1] = map.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0;i<a;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : T.solution(a,b,arr)) {
            System.out.print(i+" ");
        }

    }
}
