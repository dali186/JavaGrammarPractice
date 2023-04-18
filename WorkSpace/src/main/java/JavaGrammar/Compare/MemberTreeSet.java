package JavaGrammar.Compare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;  // ArrayList 선언

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(new Member());  //멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member){  //treeSet 에 멤버 추가
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        Iterator<Member> ir = treeSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();

            int tempId = member.getMemberId();
            if(tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;
    }

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
