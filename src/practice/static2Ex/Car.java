package practice.static2Ex;

public class Car {
    private static int totalCar;
    private String name;

    public Car(String name){
        this.name = name;
        System.out.println("차량 구입, 이릅 : " + name);
        totalCar++;
    }

    static void showTotalCars(){
        System.out.println();
        System.out.println("구매한 차량 수 : " + totalCar);
    }
}
