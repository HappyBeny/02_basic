package oop1.ex;

public class Rectangle {
    int width;
    int height;


    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter(){
        return (width + height) * 2;
    }

    boolean isSquare(){
        return this.width == this.height;
    } //this뭐야 갑자기 >> 안써도됨 ^^
}