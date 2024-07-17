package final1;

public class FieldInit {

    static final int CONST_VALUE = 10; //static final이 붙으면 '상수', 다 대문자로 적는다.
    final int value = 10; //이건 몇개 만들건 10을 쓰겠다는 거니까, 스태틱 영역에 10 만들어두면 되지. 그게 상수!
/*
    public FieldInit(int value) {
        //this.value = value;  //이미 값 생성되어 있어서 생성자로 값 설정 불가능
    }

 */
}
