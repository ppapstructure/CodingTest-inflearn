package Prob5;

import java.util.Scanner;

public class Main {
    public void Solution(String str) {
        char[] arr = str.toCharArray();
        int len = str.length();

        for(int i = 0;i<len;i++) {
            if((arr[i]<='z' && arr[i]>='a')||(arr[i]<='Z'&&arr[i]>='A')) {

            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        T.Solution(str);

    }
}
