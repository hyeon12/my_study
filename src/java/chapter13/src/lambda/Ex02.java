package lambda;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> fruits = List.of("사과", "배", "수박");

        List<String> fruits2 = fruits.stream().map((s)->"★" + s + "★").toList();

        System.out.println(fruits2);
    }
}
