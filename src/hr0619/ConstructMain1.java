package hr0619;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("이희령", 24, 13);
        MemberConstruct member2 = new MemberConstruct("이보송", 24, 13);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:"+member.name+" 나이:"+member.age+" 점수:"+member.grade);
        }
    }
}
