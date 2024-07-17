package ref.ex;

public class ProductOrderMain_re {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);

        System.out.println("전체 가격은 " + totalPrice(orders) + "원 입니다.");
    }

    static ProductOrder createOrder(String PN, int PR, int QU){
        ProductOrder order = new ProductOrder();
        order.PN = PN;
        order.PR = PR;
        order.QU = QU;
        return order;
    }

    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders){
            System.out.println("상품명 : " + order.PN + ", 가격 : " + order.PR + ", 수량 : " + order.QU);
        }
    }

    static int totalPrice(ProductOrder[] orders){
        int TP = 0;
        for (ProductOrder order : orders){
            TP += order.PR * order.QU;
        }
        return  TP;
    }
}
