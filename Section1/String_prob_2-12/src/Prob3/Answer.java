package Prob3;
import java.util.Scanner;

public class Answer {
    public void Solution(String str) {
        String answer = "";
        int len = str.length();
        int m = Integer.MIN_VALUE;
        // 공백 단위로 나누어 문자열 s에 저장합니다.
        String[] s = str.split(" ");

        // s의 문자 갯수만큼 순회 하면서 길이를 측정하고
        // 길이가 최대라면 길이가 최대인 단어를 갱신합니다.
        for(String x : s) {
            if(m<x.length()) {
                m = x.length();
                answer = x;
            }
        }

        System.out.print(answer);
    }

    public void Solution2(String str) {
        String answer = "";
        int len =Integer.MIN_VALUE;

        // 문자열의 길이를 비교 후 최대 길이라면
        // answer에 문자열을 대입하고, len에 최대 길이를 갱신
        while(str.indexOf(" ") != -1) {
            int idx = str.indexOf(" ");
            String tmp = str.substring(0,idx);
            if(len < tmp.length()) {
                len = tmp.length();
                answer = tmp;
            }

            str = str.substring(idx+1);
        }

        // 마지막 문자열이 최대 길이라면
        if(str.length() > len) {
            len = str.length();
            answer = str;
        }

        System.out.print(answer);
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

//        T.Solution(str);
//        T.Solution2(str);
    }
}
