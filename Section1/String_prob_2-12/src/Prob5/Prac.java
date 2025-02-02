package Prob5;

import java.util.*;

public class Prac {
    public String solution(String str) {
        String answer = "";
        int len = str.length();
        int lt = 0;
        int rt = len - 1;
        char[] arr = str.toCharArray();

        while(lt<rt){
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else{
//              System.out.printf("%c %c change\n",arr[lt],arr[rt]);
              char tmp = arr[lt];
              arr[lt] = arr[rt];
              arr[rt] = tmp;
              lt++;
              rt--;
            }
        }

        answer += String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.solution(str));
    }
}
