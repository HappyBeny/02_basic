package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle질문 = new Rectangle();
        rectangle질문.width = 7;
        rectangle질문.height = 8;

        int area = rectangle질문.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle질문.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean isSquare = rectangle질문.isSquare();
        System.out.println("정사각형 여부 : " + rectangle질문.isSquare());
    }
}
