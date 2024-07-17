package static2;

import static static2.DecoData.staticCall; //정적 메서드 사용하겠다는 선언. 원래 있던 DecoData.는 다 지워짐
//import static static2.DecoData.*;   적으면 데코데이타꺼 다쓸거라는 선언

public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1 : 정적 호출"); //스태틱 1증가
        staticCall();

        System.out.println("2. 인스턴스 호출"); //스태틱 1증가, 인스턴스(data1) 생성,+1
        DecoData data1 = new DecoData(); //인스턴스1 생성
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출"); //스태틱 1증가, 인스턴스(data2) 생성, +1
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);
    }
}
