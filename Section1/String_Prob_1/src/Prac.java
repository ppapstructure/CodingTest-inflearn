import java.util.*;

public class Prac {
    public int solution(String str, char c) {
        int cnt = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for(char x : str.toCharArray()) {
//            if(x==c) cnt++;
//        }

        for(int i = 0;i<str.length();i++) {
            if(str.charAt(i) == c) cnt++;
        }

        return cnt;
    }

    public int solution2(String str, char c) {
        int cnt = 0;
        int len = str.length();
        char[] arr = str.toCharArray();
        // 대문자라면 소문자로 바꿔줍니다.
        if(c<='Z') c = (char)(c + ('a'-'A'));

        // 소문자로 통일
        for(int i = 0;i<len;i++) {
            if (arr[i] <= 'Z')
                arr[i] = (char)(arr[i] + ('a'-'A'));
        }
//        System.out.println(c);
        // 순회하면서 일치하는 문자 갯수 세기.
        for(char x : arr) {
            if(x == c) cnt++;
//            System.out.print(x);
        }

        return cnt;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
//        System.out.print(T.solution(str, c));
        System.out.print(T.solution2(str, c));
    }
}
