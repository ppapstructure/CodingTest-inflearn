package Prob4;

import java.util.Scanner;
import java.util.*;

public class Answer {
    // for each 문에 특화된 ArrayList<String>
    public ArrayList<String> Solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        System.out.print(answer);
        return answer;
    }

    // Solution2는 String[]을 사용해보기
    public String[] Solution2(int n, String[] str) {
        String[] answer = new String[n];

        for(int i = 0;i<n;i++) {
            String tmp = new StringBuilder(str[i]).reverse().toString();
            answer[i] = tmp;
        }

        return answer;
    }

    // Solution3는 직접 구현하는 풀이
    public ArrayList<String> Solution3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] arr = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
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
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0;i<n;i++) {
            str[i] = sc.next();
        }

//        for(String x : T.Solution(n, str)) {
//            System.out.println(x);
//        }
            T.Solution(n, str);
//        for(String x : T.Solution2(n, str)) {
//            System.out.println(x);
//        }

//          for(String x : T.Solution3(n, str)) {
//            System.out.println(x);
//          }

    }
}
