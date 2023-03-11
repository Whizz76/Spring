package spring.firstPrgm.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Enter the hole");
    }
    public void left(){
        System.out.println("Move back");
    }
    public void right(){
        System.out.println("Acclerate");
    }
}
