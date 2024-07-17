package practice.refEx;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrder(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int total = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액 : " + total);
    }

    static ProductOrder createOrder(String PN, int PR, int QU){
        ProductOrder po = new ProductOrder();
        po.PN = PN;
        po.PR = PR;
        po.QU = QU;
        return po;
    }

    static void printOrder(ProductOrder[] po){
        for (ProductOrder a : po){
            System.out.println("상품명 : " + a.PN + ", 가격 : " + a.PR + ", 수량" + a.QU);
        }
    }

    static int getTotalAmount(ProductOrder[] po){
        int TA=0;
        for (ProductOrder a : po){
            TA += a.PR*a.QU;
        }
        return TA;
    }
}
