package game;

public abstract class Level {
    public abstract void run();
    public abstract void jump();
    public abstract void attack();
    public abstract void showLevel();

    final public void play(){
        run();
        jump();
        attack();
    }
}
