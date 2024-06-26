package hr0626;

public class MemberDefault {
    String name;
    int age;
    int grade;

    MemberDefault(String name, int age){
        this(name, age, 50);
    }

    MemberDefault(String name, int age, int grade){
        System.out.println("생성자 호출 name="+name+" ,age="+age+" ,grade="+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;

    }
}
