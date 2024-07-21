package game;

public class AdvancedLevel extends Level{
    @Override
    public void run() {
        System.out.println("빠르게 달린다~");
    }

    @Override
    public void jump() {
        System.out.println("점프!");
    }

    @Override
    public void attack() {
        System.out.println("공격.. 못해 ..");
    }

    @Override
    public void showLevel() {
        System.out.println("**********중급자 레벨**********");
    }
}
