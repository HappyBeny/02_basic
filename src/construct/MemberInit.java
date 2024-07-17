package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void inItMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }//이 경우에 그럼 String 변수를 name 말고 다른걸로 설정하면 되는거 아냐..? this 쓰는 대신?
}
