package Prob2;
import java.util.Scanner;

// 대소문자 변환
public class Main {
    public String solution(String str) {
        char[] newStr = str.toCharArray();

        for(int i = 0;i<newStr.length;i++) {
            // 대문자면 소문자로
            if(newStr[i]<='Z' && newStr[i]>='A') {
                newStr[i] = (char)(newStr[i]+'a'-'A');

            }

            // 소문자면 대문자로
            else if(newStr[i]<='z' && newStr[i]>='a'){
                newStr[i] = (char)(newStr[i]-('a'-'A'));
            }
        }
        String answer = new String(newStr);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
// indexOf() 파악하기