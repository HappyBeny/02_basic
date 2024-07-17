package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String hello) {
        System.out.println("페메를 발송합니다 : " + hello);
    }
}
