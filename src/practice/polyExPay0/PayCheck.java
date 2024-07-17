package practice.polyExPay0;

public abstract class PayCheck{
    public static Pay check(String payOption){
        if (payOption.equals("kakao")){
            return new KaKaoPay();
        } else if (payOption.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaltPay();
        }
    }
}
