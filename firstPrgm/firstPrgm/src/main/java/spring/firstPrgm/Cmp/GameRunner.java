package spring.firstPrgm.Cmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.firstPrgm.game.GamingConsole;

//@Component
public class GameRunner {

    //@Autowired // since game is a dependency of GameRunner we have wired it with gameRunner
            // this is called dependency injection, @Autowired is used for DI.
            // While creating an instance of gameRunner class, spring will see that game is
            // a dependency of it and will search for the component that is an implementation of
            // gamingConsole class, after that it will autowire it with the gameRunner comp.
    GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game=game;
    }
    public void run(){
        System.out.println("Running game: "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
