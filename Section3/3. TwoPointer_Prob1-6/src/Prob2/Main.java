package Prob2;

import java.util.*;

public class Main {
    public ArrayList<Integer> solution(int[]arr1, int[]arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int len1 = arr1.length;
        int len2 = arr2.length;

        int len = arr1.length + arr2.length;

        int idx1 = 0;
        int idx2 = 0;

        for(int i = 0;i<len;i++) {
            if (idx1 == len1 || idx2 == len2) break;

            if(arr1[idx1] < arr2[idx2]) {
                idx1++;
            }
            else if(arr1[idx1] > arr2[idx2]) {
                idx2++;
            }
            else {
                answer.add(arr1[idx1]);
                idx1++;
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

        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int j=0;j<m;j++) {
            arr2[j] = sc.nextInt();
        }

        for(int x : T.solution(arr1,arr2)) {
            System.out.print(x+" ");
        }

    }
}