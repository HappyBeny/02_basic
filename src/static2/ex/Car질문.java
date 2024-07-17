package static2.ex;

public class Car질문 {
    private String name;
    private static int quantity;


    public Car질문(String name){
        System.out.println("차량 구입, 이름 : " + name);
        this.name = name;
        quantity++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + quantity);
    }
}//바로위에 스테틱 왜 붙냐.....ㅠ




