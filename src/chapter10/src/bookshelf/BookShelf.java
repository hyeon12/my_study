package bookshelf;

public class BookShelf extends Shelf implements Queue{
    //Shelf 클래스가 가지고 있는 ArrayList 배열을 사용하여
    //Queue 인터페이스에서 선언한 메서드를 모두 구현

    @Override
    public void enQueue(String title) {
        shelf.add(title); //배열에 요소 추가
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
        //remove(int index) - 지정된 인덱스에 있는 요소 제거 + 반환
        //remove(Object o) - 지정된 객체와 동일한 첫번째 요소를 제거 -> 성공:true, 실패(리스트에 없으면):false
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
