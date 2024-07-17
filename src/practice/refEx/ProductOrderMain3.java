package practice.refEx;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[n];
        scanner.nextLine();

        for (int i = 0; i < orders.length; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명 : ");
            String PN = scanner.nextLine();

            System.out.print("가격 : ");
            int PR = scanner.nextInt();

            System.out.print("수량 : ");
            int QU = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(PN, PR, QU);
        }

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
            System.out.println("상품명 : " + a.PN + ", 가격 : " + a.PR + ", 수량 : " + a.QU);
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
