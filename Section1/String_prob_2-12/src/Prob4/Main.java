package Prob4;

import java.util.Scanner;
import java.util.*;

public class Main {
    public void Solution(int n, String[] str) {
        for(int i = 0;i<n;i++) {
            int len = str[i].length();
            for(int j = len-1;j>=0;j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }

    public ArrayList<String> solution2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public String[] solution3(String[] str) {
        String[] answer = new String[str.length];
        int len = str.length;

        for(int i = 0;i<len;i++) {
            String tmp = new StringBuilder(str[i]).reverse().toString();
            answer[i] = tmp;
        }

        return answer;
    }

    public ArrayList<String> solution4(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        int len = str.length;

        for(String x : str) {
            char[] arr = x.toCharArray();
            int lt = 0;
            int rt = arr.length - 1;
            while(lt<rt) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(arr);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0;i<n;i++) {
            str[i] = sc.next();
        }

//        T.Solution(n, str);
//        for(String x : T.solution2(str)) {
//            System.out.println(x);
//        }

//        for(String x : T.solution3(str)) {
//            System.out.println(x);
//        }

          for(String x : T.solution4(str)) {
              System.out.println(x);
          }

    }
}
