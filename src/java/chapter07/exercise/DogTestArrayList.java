package chapter07.exercise;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("말티즈", "소형견"));
        dogs.add(new Dog("보더콜리", "대형견"));
        dogs.add(new Dog("치와와", "소형견"));
        dogs.add(new Dog("웰시코기", "중형견"));
        dogs.add(new Dog("진돗개", "멋진개"));

        for(int i = 0; i < dogs.size(); i++){
            Dog dog = dogs.get(i);
            dog.showDogInfo();
        }
    }
}
