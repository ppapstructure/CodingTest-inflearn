package Prob5;

import java.util.*;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        HashMap <Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> key = new ArrayList<>();

        int sum = 0;

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                for(int t = 0;t<n;t++) {
                    if(i!=j && i!=t && j!=t) {
                        sum += arr[i] + arr[j] + arr[t];
                        map.put(sum, map.getOrDefault(sum, 0) + 1);
                        sum = 0;
                    }
                }
            }
        }

        for(int i : map.keySet()) {
            key.add(i);
        }
//        Collections.sort(key);
        Collections.sort(key, Collections.reverseOrder());

        if(k>key.size()) return -1;
        else return key.get(k-1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n,k,arr));
    }
}
