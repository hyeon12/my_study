package lambda;

import java.util.List;
import java.util.function.Function;

public class Ex01 {
    public static void main(String[] args) {
        List<String> fruits = List.of("사과", "배", "수박");

        List<String> fruits2 = fruits.stream()
                .map(new Function<String, String>() {

                    @Override
                    public String apply(String s) {
                        return "★" + s + "★";
                    }
                }).toList();
        System.out.println(fruits2);
    }
}
