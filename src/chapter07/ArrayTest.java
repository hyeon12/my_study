package chapter07;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
            //System.out.println(sum); - 반복될때마다 출력, 최종합산값을 얻고싶으면 for문 밖에 쓰기~~!
        }
        System.out.println(sum);

        int[] arr = new int[]{3, 6, 9, 12};

        //System.out.println(arr[0] + 2);
        //System.out.println(arr[1] + arr[2]);
        //System.out.println(arr[4] - 2); - arr[4]는 없으므로, 컴파일 오류 발생
    }
}
