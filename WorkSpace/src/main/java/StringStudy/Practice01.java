package StringStudy;

import java.util.Locale;
import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("message : ");
        String message = sc.nextLine().toUpperCase();   //걍 애초에 대문자로 바꿔버린다
        String newMessage = "";

        for (int i = 0; i < message.length(); i++) {
            if (i == 0 || message.charAt(i - 1) == ' ') {   //단어의 첫번쨰 / 첫 문자거나 내 앞에 공백이면, 단축계산 됐음
                //만약 대문자면 소문자로 변경
                //String은 수정이 안됨
                newMessage += (char)(message.charAt(i) + ('a' - 'A'));
            } else {
                newMessage += message.charAt(i);
            }

            //나머지 문자에 대해서는 소문자를 대문자로 바꾼다. 얘는 필요 없음
        }
        System.out.println(newMessage);
    }
}
