package practice.oopEx;

public class AccountMain {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.deposit(10000);
        a1.withdraw(9000);
        a1.withdraw(2000);
        a1.showBalance();
    }
}
