import java.util.*;

public class Prac2 {
    public int solution2(String str, char c) {
        int answer = 0;
        // 문자 및 문자열을 대문자나 소문자로 통일.
        c = Character.toUpperCase(c);
        str = str.toUpperCase();

        // 문자열을 순회하면서 문자와 같은 갯수세기.
        for(char x : str.toCharArray()) {
            if(x == c) answer++;
        }

        return answer;
    }

    public int solution(String str, char c) {
        int answer = 0;

        // 1. 대소문자를 대문자 및 소문자로 통일한다.
            // 1) 아스키코드, 2) 문자열을 전부 대문자 혹은 소문자로 통일.
        char[] tmp = str.toCharArray();

        for(int i = 0;i<tmp.length;i++)
            if(tmp[i]>='a') tmp[i] = (char)(tmp[i] - ('a'-'A'));
        if(c>='a') c = (char)(c - ('a'-'A'));

        for(char x: tmp) {
            if(x == c) answer++;
        }

        // 2. c가 str을 순회하면서 str에서 c와 일치하는 문자를 카운팅한다.
        return answer;
    }

    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

//        System.out.print(T.solution(str,c));
        System.out.print(T.solution2(str,c));
//        System.out.print((char)('a' - ('a'-'A')));
    }
}
