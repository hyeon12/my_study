package chapter07.array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"java", "android", "c", "javascript", "python"};
        for(String lang : strArray){
            System.out.println(lang);
        }

        int[] numArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int num : numArray){//향상된 for문으로 numArray 배열의 각 요소를 num에 대입
            System.out.println(num);
        }
    }
}
