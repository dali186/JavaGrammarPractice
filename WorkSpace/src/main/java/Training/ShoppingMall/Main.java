package Training.ShoppingMall;

import Training.ShoppingMall.Arrays.Members;
import Training.ShoppingMall.Entity.Member;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Members memberList = Members.getInstance();
        Member user01 = new Member("user01", "User01!", "user01@gmail.com", "Seocho-gu,Seoul");
        Member user02 = new Member("user02", "User02!", "user02@gmail.com", "Nowon-gu,Seoul");
        Member user03 = new Member("user03", "User03!", "user03@gmail.com", "Mapo-gu,Seoul");
        memberList.addMember(user01);memberList.addMember(user02);memberList.addMember(user03);

        while (true) {
            System.out.println("아이디를 입력해주세요.");
            String userId = sc.nextLine();
            System.out.println("비밀번호를 입력해주세요.");
            String userPwd = sc.nextLine();
            if(!memberList.login(userId,userPwd)) continue;

            System.out.println("""
                    ====================
                    1. 회원정보 수정하기
                    77. 종료
                    ====================
                    """);
            int select = sc.nextInt();
            if (select == 77) break;
        }
    }
}
