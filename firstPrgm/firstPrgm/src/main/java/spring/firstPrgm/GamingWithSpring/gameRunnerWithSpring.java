package spring.firstPrgm.GamingWithSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.firstPrgm.game.*;

public class gameRunnerWithSpring {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(ConfigGamingFile.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(gameRunner.class).run();
        }

    }
}
