package Prob1;

import java.util.*;

public class Main {
    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int idx1 = 0;
        int idx2 = 0;

        int len = arr1.length+arr2.length;

        for(int i = 0;i<len;i++) {
            if (idx1 == arr1.length) {
                for(int j = idx2;j<arr2.length;j++) {
                    answer.add(arr2[j]);
                }
                break;
            }
            if (idx2 == arr2.length) {
                for(int j = idx1;j<arr1.length;j++) {
                    answer.add(arr1[j]);
                }
                break;
            }

            if(arr1[idx1] <= arr2[idx2]) {
//                System.out.println("addA " + arr1[idx1] +" "+ idx1);
                answer.add(arr1[idx1]);
                idx1++;
            }
            else {
//                System.out.println("addB " + arr2[idx2] +" "+idx2);
                answer.add(arr2[idx2]);
                idx2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int[] arr2 = new int[a];
        for(int i = 0;i<a;i++) {
            arr2[i] = sc.nextInt();
        }

        for(int x : T.solution(arr1,arr2)) {
            System.out.print(x+" ");
        }

    }
}
