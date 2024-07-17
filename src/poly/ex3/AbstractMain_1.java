package poly.ex3;

public class AbstractMain_1 {
    public static void main(String[] args) {

        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();


        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal a : animals){
            soundAnimal(a);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
