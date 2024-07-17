package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }
    //요 메서드 사용하는 원리가 잘 이해가 안 됨. 메서드는 함수 지정.
    //initStudent 라는 함수를 정의하고, St타입의 st라는 변수에 name값, age값, grade값 배치하겠다.
    //그다음... 내가 init에 적은 변수 값을 클래스로 전달한다?
    //매서드 자체에 대한 이해가 좀더 필요할듯

    //교재보니까 '전달한 학생 객체의 필드에 값을 설정한다'라는데 문장 이해 잘 안 됨
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ",성적 : " + student.grade);
    }
}
