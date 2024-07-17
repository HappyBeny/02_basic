package practice.class1Ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] po = new ProductOrder[3];

        //상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        //배열마다 초기화 해줘야 함.
        //o1객체 생성 후 po[0]에 할당 : o1을 또 쓸 일이 생길 때 용이함
        //po[0] 객체 생성 후 필드 지정 : 한 번만 쓸 때 코드가 짧아짐.
        ProductOrder o1 = new ProductOrder(); //po[0] = new ProductOrder();로 대체 가능
        o1.PN = "두부";
        o1.PR = 2000;
        o1.QU = 2;
        po[0] = o1;

        ProductOrder o2 = new ProductOrder();
        o2.PN = "김치";
        o2.PR = 5000;
        o2.QU = 1;
        po[1] = o2;

        ProductOrder o3 = new ProductOrder();
        o3.PN = "콜라";
        o3.PR = 1500;
        o3.QU = 2;
        po[2] = o3;

        int TP=0;
        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder a : po){
            System.out.println("상품명 : " + a.PN + ", 가격 : " + a.PR + ", 수량 : " + a.QU);
            TP += a.PR * a.QU;
        }
        System.out.println("총 결제 금액 : " + TP);
    }
}
