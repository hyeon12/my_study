package game;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();

        AdvancedLevel alevel = new AdvancedLevel();
        player.upgradeLevel(alevel);
        player.play();

        MasterLevel mlevel = new MasterLevel();
        player.upgradeLevel(mlevel);
        player.play();
    }
}
