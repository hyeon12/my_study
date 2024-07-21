package game;

public class MasterLevel extends Level{
    @Override
    public void run() {
        System.out.println("제일 빠르게 달리지~~~");
    }

    @Override
    public void jump() {
        System.out.println("슈퍼 점프~~~~");
    }

    @Override
    public void attack() {
        System.out.println("공격 성공!!!!");
    }

    @Override
    public void showLevel() {
        System.out.println("**********고급자 레벨**********");
    }
}
