import java.util.Scanner;

public class Main {

    public static int solution(String str, char t){
        int len = str.length();
        int cnt = 0;
        String newStr = new String();

        // 문자가 대문자라면 소문자로 바꿔줍니다.
        if(t < 'a') t = (char)(t + 'a'-'A');

        // 문자열의 문자가 대문자라면 소문자로 바꿔줍니다.
        for(int i = 0;i<len;i++) {
            if(str.charAt(i) < 'a')
                newStr += (char)(str.charAt(i) + ('a'-'A'));
            else
                newStr += str.charAt(i);
        }

        // 문자열을 순회하면서 문자와 같은 문자를 찾습니다.
        for(int i = 0;i<len;i++) {
            if(newStr.charAt(i) == t) cnt++;
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

// 0. 나는 소문자로 통일
// 1. 문자열은 수정이 불가능 하다.
// 2. 대소문자는 아스키 코드를 이용해서 변환한다. 'A' = 65 , 'a' = 97


// java.util.* 에대해서 알아보자
// 답지는 전부다 대문자로 통일 
// .toUpperCase() 사용
// Charactor.toUpperCase() // 여기서 Charactor의 정체
// 향상된 for문 사용할것
// 코테할떄 따로 Main T = new Main(); 얘는 왜 설정하는거지?