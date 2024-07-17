package oop1.ex;

public class Account {
    int balance; //이거 왜 0이라고 지정 안함? ㅅㅂ? >> 인스턴스 변수는 자동으로 0으로 초기화되거든 ^^

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("잔액 부족.");
        }
    }

    void check(){
        System.out.println("잔고 : " + balance);
    }
}
