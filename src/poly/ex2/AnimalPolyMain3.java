package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal an = new Animal();
        an.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};


        for (Animal a : animalArr) {
            soundAnimal(a);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal a) {
        System.out.println("동물 소리 테스트 시작");
        a.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
