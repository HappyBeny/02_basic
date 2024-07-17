package practice.oopEx;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 8;
        rec.height = 8;

        int area = rec.calculateArea();
        System.out.println("넓이 : " +area);

        int per = rec.calculatePerimeter();
        System.out.println("둘레 : " + per);

        boolean squ = rec.isSquare();
        System.out.println("정사각형 여부 : " + squ);
    }
}
