package game;

public class Player {
    private Level level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevel();
    }

    public Level getLevel(){
        return level;
    }

    public void upgradeLevel(Level level){
        this.level = level;
        level.showLevel();
    }

    public void play(){
        level.play();
    }
}
