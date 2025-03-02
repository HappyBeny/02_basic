package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //Student 인스턴스(객체) 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 성적 : " + students[i].grade);
        }
        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; //s라는 단어에 배열 담기
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
        for (Student s : students) { //향상된 for문
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
        for (Student s : students) { //iter 쓰면 자동완성해줌
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}
