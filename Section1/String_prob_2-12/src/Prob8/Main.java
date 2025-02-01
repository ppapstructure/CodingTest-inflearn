package Prob8;

import java.util.*;

public class Main {
    public void Solution(String str) {
        boolean is_true = true;
        int lt = 0;
        int rt = str.length() - 1;

        str = str.toUpperCase();

        while(lt < rt) {
            System.out.println(str.charAt(lt)+" "+str.charAt(rt));
            if (Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))) {
                if (str.charAt(lt) != str.charAt(rt)) {
                    is_true = false;
                    break;
                }
            }
            lt++;
            rt--;
        }
        if(is_true) System.out.print("YES");
        else System.out.print("NO");
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        T.Solution(str);
    }
}
