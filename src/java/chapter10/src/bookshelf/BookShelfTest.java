package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("책1");
        shelfQueue.enQueue("책2");
        shelfQueue.enQueue("책3");

        System.out.println(shelfQueue.deQueue());//remove(0) = 책1
        System.out.println(shelfQueue.getSize());
        //배열요소 총3개에서 하나 반환하며 삭제했으므로 2개
        System.out.println(shelfQueue.deQueue());//책2
        System.out.println(shelfQueue.deQueue());//책3
        System.out.println(shelfQueue.getSize());
        //반환 끝, 총갯수 0
        //System.out.println(shelfQueue.deQueue());
        //모두 반환했으므로 IndexOutOfBoundsException 발생
    }
}
