package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2_re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력해주세요.");

            System.out.print("상품명 : ");
            String PN = scanner.nextLine();

            System.out.print("가격 : ");
            int PR = scanner.nextInt();

            System.out.print("수량 : ");
            int QU = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(PN, PR, QU);
        }

        printOrder(orders);

        System.out.println("총 가격 : " + totalPrice(orders));
    }

    static ProductOrder createOrder(String PN, int PR, int QU) {
        ProductOrder orders = new ProductOrder();
        orders.PN = PN;
        orders.PR = PR;
        orders.QU = QU;
        return orders;
    }

    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders){
            System.out.println("상품명 : " + order.PN + ", 가격 : " + order.PR + ", 수량 : " + order.QU + ", 총액 : " + order.PR * order.QU);
        }
        System.out.println();
    }

    static int totalPrice(ProductOrder[] orders){
        int TP = 0;
        for (ProductOrder order : orders){
            TP += order.PR * order.QU;
        }
        return TP;
    }
}
