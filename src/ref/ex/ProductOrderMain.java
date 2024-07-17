package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        System.out.println();

        System.out.println("총 결제 금액 : " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String pN, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.PN = pN;
        order.PR = price;
        order.QU = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.PN + ", 가격 : " + order.PR + ", 수량 : " + order.QU);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalprice = 0;
        for (ProductOrder order : orders) {
            totalprice += order.PR * order.QU;
        }
        return totalprice;
    }
}
