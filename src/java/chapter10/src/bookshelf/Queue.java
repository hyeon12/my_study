package bookshelf;

public interface Queue {
    void enQueue(String title); //입력되는 요소 값을 제일 마지막에 추가
    String deQueue(); //배열의 맨 앞에 있는 요소를 제거하고 그 값을 반환
    int getSize(); //현재 Queue에 있는 개수 반환
}
