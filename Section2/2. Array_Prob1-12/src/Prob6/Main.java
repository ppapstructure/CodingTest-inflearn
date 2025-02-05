package Prob6;

import java.util.*;

public class Main {
    // 에라토스테네스
//    public ArrayList<Integer> solution2(int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        for(int i = 0;i<n;i++) {
//            int tmp = 0;
//            // 숫자 뒤집기.
//            while(arr[i] > 0) {
//                tmp = tmp*10 + arr[i]%10;
//                arr[i] /= 10;
//            }
//
//            // 소수판별 - 에라토스테네스의 체
//            // 에라토스는 n까지의 소수와 소수의 갯수를 구하는데 유리 일단 pass
//            if(tmp == 1) continue;
//            else {
//                int[] p = new int[tmp + 1];
//                for (int j = 2; j <= tmp;j++)
//            }
//
//        }
//
//
//        return answer;
//    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();

        int len = arr.length;

        for(int i = 0;i<len;i++) {
            int tmp = 0;
            // 숫자 뒤집기
            while(arr[i] > 0) {
                tmp = tmp*10 + arr[i]%10;
                arr[i] /= 10;
            }
//            System.out.println(tmp);

            // 소수 판별
            if(tmp == 2) a.add(tmp);
            else if (tmp == 1) continue;
            else {
                boolean is_true = true;
                for (int j = 3; j < tmp ; j++) {
                    if(tmp % j == 0) {
                        is_true=false;
                        break;
                    }
                }
                if(is_true) a.add(tmp);
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int s : T.solution(n,arr)) {
            System.out.print(s +" ");
        }

    }
}
