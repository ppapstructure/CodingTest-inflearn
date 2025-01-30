import java.util.*;

public class Prac {
    public int solution(String str, char c) {
        int cnt = 0;
        String up_str = str.toUpperCase();
        char up_c = Character.toUpperCase(c);

//        for(int i = 0;i<str.length();i++) {
//            if(up_str.charAt(i) == up_c) cnt++;
//        }
        for(char x : up_str.toCharArray()) {
            if(x==up_c) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
