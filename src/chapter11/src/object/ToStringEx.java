package object;

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");
//        System.out.println(book1);
//        System.out.println(book1.toString());
//
//        String str = new String("test");
//        System.out.println(str);
//
//        Integer i1 = new Integer(100);
//        System.out.println(i1);

        Book book2= new Book(300, "비폭력대화");
        Book book3= new Book(300, "비폭력대화");
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));
    }
}
