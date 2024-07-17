package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩X
        child.method(); //메서드 오버라이딩!
        System.out.println();
        //영한이형의 상자쌓기 그림보다 호빈이의 포함시키는 박스 그림이 이해하기 더 쉬운듯.
        //위계질서로는 쌓기그림, 실제 적용에서는 호빈이 그림으로 생각하자.

        //자식 변수가 부모 인스턴스 참조 (불가능) 이상해짐
//        Child poly2 = new Parent();
//        System.out.println("Child -> Parent");
//        System.out.println("value = " + poly2.value);
//        poly2.method();
    }
}
