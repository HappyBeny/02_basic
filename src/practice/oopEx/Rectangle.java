package practice.oopEx;

public class Rectangle {
    int height;
    int width;

    public int calculateArea(){
        return width * height;
    }

    public int calculatePerimeter(){
        return 2 * (width + height);
    }

    public boolean isSquare(){
        return width == height;
    }
}




