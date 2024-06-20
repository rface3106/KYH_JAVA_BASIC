package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 14;
        member1.grade = 80;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 15;
        member2.grade = 40;

        MemberInit member3 = new MemberInit();
        member3.name = "user3";
        member3.age = 18;
        member3.grade = 50;

        MemberInit[] members = {member1, member2,member3};

        for (MemberInit s : members) {
            System.out.println("이름:"+s.name+" 나이:"+s.age+" 점수:"+s.grade);

        }
    }



}