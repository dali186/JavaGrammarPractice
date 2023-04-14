package Training.ShoppingMall.Arrays;

import Training.ShoppingMall.Entity.Member;

import java.util.ArrayList;

public class Members {

    private static Members membersInstance;
    private ArrayList<Member> memberList = new ArrayList<>();

    public static Members getInstance() {
        if (membersInstance == null) {
            membersInstance = new Members();
        }
        return membersInstance;
    }

    private Members() {
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void addMember(Member member) {
        memberList.add(member);
        System.out.println(member.getUserId() + " Joined");
    }

    public boolean login(String userId, String userPwd){
        if(userId == null || userPwd == null) {
            System.out.println("아이디와 비밀번호를 입력해주세요.");
            return false;
        }

        Member loginUser = null;

        for(int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getUserId().equals(userId)) {
                loginUser = memberList.get(i);
                break;
            }
        }
        if(loginUser == null || !loginUser.getUserPwd().equals(userPwd)) {
            System.out.println("아이디와 비밀번호를 확인해주세요.");
            return false;
        }
        System.out.println(loginUser.getUserId()+ "님 환영합니다!");
        return true;
    }

}
