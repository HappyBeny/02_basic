package poly.ex4;


public class AbstractMain_1 {
    public static void main(String[] args) {

        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cow.move();
        System.out.println();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 테스트 종료");
        System.out.println();
    }
}
