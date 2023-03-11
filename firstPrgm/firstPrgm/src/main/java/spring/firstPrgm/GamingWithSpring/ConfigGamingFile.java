package spring.firstPrgm.GamingWithSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.firstPrgm.game.*;

@Configuration
public class ConfigGamingFile {
    @Bean
    @Primary
    public GamingConsole marioGame(){
        return new MarioGame();
    }
    @Bean
    public GamingConsole superGame(){
        return new SuperGame();
    }
    @Bean
    public GamingConsole pacManGame(){
        return new PacMan();
    }
    @Bean
    public gameRunner gameRunner(){
        return new gameRunner(marioGame());
    }
}
