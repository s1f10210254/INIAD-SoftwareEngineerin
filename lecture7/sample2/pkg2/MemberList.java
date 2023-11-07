package sample2.pkg2; // パッケージは適切なものに修正してください

import java.util.HashMap;
import java.util.Map;
import sample2.pkg1.Member; // これも実際のパッケージに合わせてください

public class MemberList {
    private Map<String, Member> membersMap;

    public MemberList() {
        this.membersMap = new HashMap<>();
    }

    public void add(Member member) {
        membersMap.put(member.getId(), member);
    }

    public Member get(String id) {
        return membersMap.get(id);
    }

    public void remove(String id) {
        membersMap.remove(id);
    }

    public int count() {
        return membersMap.size();
    }
}
