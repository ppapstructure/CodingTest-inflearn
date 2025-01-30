import java.util.Scanner;

public class Main {

    public static int solution(String str, char t){
        int len = str.length();
        int cnt = 0;
        char[] newStr = str.toCharArray();
        // 대문자라면 소문자로 바꿔줍니다.
        if(t <= 'Z')
            t = (char)(t + 'a' - 'A');

        for(char c : newStr) {
            if(c <= 'Z')
                c = (char)(c + 'a' - 'A');

            if(c == t) cnt++;
        }

        return cnt;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        System.out.print(T.solution(str, t));
    }
}

// 나는 소문자로 통일
// 아스키 코드를 이용하여 문자변환을 사용