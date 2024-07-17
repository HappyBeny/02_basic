package practice.oopEx;

public class Account {
    int balance;

    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 잔액 : " + balance);
        System.out.println();
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔고가 부족합니다.");
            System.out.println("현재 잔고 : " + balance + ", 출금을 시도한 금액 : " + amount);
            System.out.println();
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 잔액 : " + balance);
            System.out.println();
        }
    }

    public void showBalance() {
        System.out.println("잔액 : " + balance);
    }
}
