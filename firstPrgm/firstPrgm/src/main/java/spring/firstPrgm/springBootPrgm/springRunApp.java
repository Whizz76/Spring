package spring.firstPrgm.springBootPrgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("spring.firstPrgm.springBootPrgm")
public class springRunApp {
    public static void main(String[] args){
        SpringApplication.run(springRunApp.class,args);

    }
}
