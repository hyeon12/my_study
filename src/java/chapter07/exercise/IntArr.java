package chapter07.exercise;

public class IntArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 0;
        int total = 0;

        for(int j = 1; j <= 10; j++){
            if(j % 2 == 0){
                arr[index] = j;
                index++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("총 합계는 " + total);
    }
}

