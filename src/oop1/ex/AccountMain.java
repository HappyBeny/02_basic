package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account myAc = new Account();
        myAc.deposit(10000);
        myAc.withdraw(9000);
        myAc.withdraw(2000);
        myAc.check();//문제에선 이거 왜 클래스에 추가안함?
    }
}
