package Prob1;

import java.util.*;

public class Main {
    public void solution(int[] arr) {
        int len = arr.length;

        System.out.print(arr[0]+" ");
        for(int i = 1;i<len;i++) {
            if(arr[i]>arr[i-1]) System.out.print(arr[i] +" ");
        }
    }

    public String solution2(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int len = arr.length;

        answer.add(arr[0]);
        for(int i = 1;i<len;i++) {
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }

        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
//            System.out.println(answer.get(i));
        }

        String tmp = Arrays.toString(result);
        return tmp;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

//        T.solution(arr);
        System.out.print(T.solution2(arr));
    }
}
