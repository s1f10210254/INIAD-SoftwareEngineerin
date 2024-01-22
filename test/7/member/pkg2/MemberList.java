package member.pkg2;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import member.pkg1.Member;

public class MemberList{
    // private ArrayList<Member> members;
    private Map<String, Member> memberMap;
    public MemberList(){
        this.memberMap = new HashMap<>();
       // this.members = new ArrayList<>();
    };

    public void add(Member member){
        // memberMap.put(member.ge, member);
        // members.add(member);
    };

    public Member get(String id){
        return memberMap.get(id);

        // if (i >= 0 && i < members.size()) {
        //     return members.get(i);
        // }
        // return null; 

    }

    public void remove(String id){
        memberMap.remove(id);
        // members.remove(member);

    }

    public int count(){
        return memberMap.size();
    };
}
