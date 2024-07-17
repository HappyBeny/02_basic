package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가. import 해도 접근 불가.
        //DefaultClass1 clas1 = new DefaultClass1();
        //DefaultClass2 clas2 = new DefaultClass2();
    }
}
