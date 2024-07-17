package practice.polyExSender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페메를 발송합니다 : " + message);
    }
}
