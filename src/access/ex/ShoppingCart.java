package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item items){
        if (itemCount >= 10){
            System.out.println("쇼핑카트가 가득 찼습니다.");
        }else {
            this.items[itemCount] = items;
            itemCount++;
        }
    }

    public void displayItems(){
        int totalCost = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++){
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].totalPrice());
            totalCost += items[i].totalPrice();
        }
        System.out.println("전체 가격 합 : " + totalCost);
    }
}
