package chapter07.exercise;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("말티즈", "소형견");
        dogs[1] = new Dog("보더콜리", "대형견");
        dogs[2] = new Dog("치와와", "소형견");
        dogs[3] = new Dog("웰시코기", "중형견");
        dogs[4] = new Dog("진돗개", "멋진개");

        for(int i = 0; i < dogs.length; i++){
            dogs[i].showDogInfo();
        }
        System.out.println();

        System.out.println("===== 향상된 for 문 =====");
        for(Dog dog : dogs){
            dog.showDogInfo();
        }
    }
}
