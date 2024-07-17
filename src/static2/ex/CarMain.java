package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car질문 car1 = new Car질문("K3");
        Car질문 car2 = new Car질문("G80");
        Car질문 car3 = new Car질문("Model Y");

        Car질문.showTotalCars(); //구매한 차량 수를 출력하는 static 메서드
    }
}
