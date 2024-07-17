package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon(); //오버라이딩 된 Child의 메서드 호출

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon(); //오버라이딩 된 Child의 메서드 호출

        Child c = new Child();
        c.methodA();
        c.methodB();
        c.methodCommon();
    }
}
