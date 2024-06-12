package chapter08.polymorphism;

import java.util.ArrayList;

public class AnimalTest {
    public void moveAnimal(Animal animal){
        animal.move();
    }
    //매개변수의 자료형을 상위 클래스로 정의함
    //어떤 인스턴스가 매개변수로 넘어와도 Animal형으로 형변환 됨.
    //그러나 생성된 인스턴스의 메서드를 사용하는 "가상메서드" 원리에 따라 각 인스턴스의 메서드가 출력됨.

    public static void main(String[] args) {

//        AnimalTest aTest = new AnimalTest();
//        aTest.moveAnimal(new Human());
//        aTest.moveAnimal(new Eagle());
//        aTest.moveAnimal(new Tiger());
//        aTest.moveAnimal(new Animal());


        ArrayList<Animal> aniList = new ArrayList<Animal>();
    }
}
