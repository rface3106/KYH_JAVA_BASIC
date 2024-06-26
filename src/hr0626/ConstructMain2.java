package hr0626;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberDefault member1 = new MemberDefault("user1", 15, 90);
        MemberDefault member2 = new MemberDefault("user2", 16);

        MemberDefault[] members = {member1, member2};

        for (MemberDefault member : members) {
            System.out.println("이름:"+member.name+" 나이:"+member.age+" 성적:"+member.grade);
        }
    }

}
