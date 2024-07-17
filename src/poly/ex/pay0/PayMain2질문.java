package poly.ex.pay0;

import java.util.Scanner;

public class PayMain2질문 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while(true){
            System.out.print("결제 수단을 입력하세요 : ");
            String option = scanner.nextLine();
            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
                //break;는 반복문의 다음 코드를 실행하라는 명령.
                //반복문이 끝났다는 걸 더 명확하게 보여주기 위해서는 return;이 더 적절함
            }else {
            System.out.print("결제 금액을 입력하세요 : ");
            int amount = scanner.nextInt();
            payService.processPay(option, amount);
            scanner.nextLine();
            }
        }
    }
}
