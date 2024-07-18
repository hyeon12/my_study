package exercise;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬방식을 선택 하세요.");
        System.out.println("B : BubbleSort ");
        System.out.println("H : HeapSort ");
        System.out.println("Q : QuickSort ");
        System.out.println("입력 : ");

        int ch = System.in.read();
        Sort sort = null;

        if(ch == 'Q' || ch == 'q'){
            sort = new QuickSort();
        } else if (ch == 'H' || ch == 'h'){
            sort = new HeapSort();
        } else if (ch == 'B' || ch == 'b'){
            sort = new BubbleSort();
        } else {
            System.out.println("없는 정렬입니다.");
        }

        int[] arr = new int[5];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();

    }
}
