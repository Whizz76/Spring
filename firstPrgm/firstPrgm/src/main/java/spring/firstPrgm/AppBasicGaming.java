package spring.firstPrgm;

import spring.firstPrgm.game.MarioGame;
import spring.firstPrgm.game.PacMan;
import spring.firstPrgm.game.SuperGame;
import spring.firstPrgm.game.gameRunner;

public class AppBasicGaming {
    public static void main(String[] args){
        var mario=new MarioGame();
        var superGame=new SuperGame();
        var pacMan=new PacMan();
        var game=new gameRunner(mario);
        var game2=new gameRunner(superGame);
        var game3=new gameRunner(pacMan);
        game.run();
        game2.run();
        game3.run();

    }
}
