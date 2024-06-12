package game;

public class BeginnerLevel extends Level {
    @Override
    public void run() {
        System.out.println("천천히.... 달..린..다..");
    }

    @Override
    public void jump() {
        System.out.println("뛸 줄.. 몰라..");
    }

    @Override
    public void attack() {
        System.out.println("공격.. 못해 ..");
    }

    @Override
    public void showLevel() {
        System.out.println("**********초보자 레벨**********");
    }
}
