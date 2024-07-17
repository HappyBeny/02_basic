package practice.accessEx;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //TODO 나머지 코드를 완성해라.
    public void addItem(Item items) {
        if (itemCount >= this.items.length){
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            this.items[itemCount] = items;
            itemCount++;
        }
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++){
            Item a = items[i];
            System.out.println("상품 : " + a.getName() + ", 가격 : " + a.getPrice());
        }
        int total = calculateTotalPrice();
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item a = items[i];
            total += a.getPrice();
        }
        return total;
    }
}
