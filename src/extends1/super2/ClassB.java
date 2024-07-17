package extends1.super2;

public class ClassB extends ClassA{

    /*
    요게 있으면 ClassC에서도 생략가능한 기본생성자 super(); 사용 가능
    public ClassB() {
        System.out.println("ClassB 생성자");
    }
     */

    public ClassB(int a) {
        //super(); //기본 생성자 생략 가능
        this(a, 0);
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
