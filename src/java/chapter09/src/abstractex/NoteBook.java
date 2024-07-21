package abstractex;

public class NoteBook extends Computer{
    @Override
    public void typing() {
        System.out.println("노트북 typing");
    }

    @Override
    public void display() {
        System.out.println("노트북 display");
    }
}
