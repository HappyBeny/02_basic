package practice.polyExPay0;

public class PayService{

    public void processPay(String payOption, int amount) {
        System.out.println("결제를 시작합니다. option = " + payOption + ", amount = " + amount);

        Pay pay = PayCheck.check(payOption);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제를 성공했습니다.");
        } else {
            System.out.println("결제를 실패했습니다.");
        }
    }
}
