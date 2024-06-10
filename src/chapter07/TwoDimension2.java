package chapter07;

public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int num = 1;

        for(int i = 0; i < arr.length; i++){//행
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = num;
                System.out.println(arr[i][j]);
                num++;
            }
            System.out.println();
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}
