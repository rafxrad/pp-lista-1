package game;


public class Criminoso implements Enemy {

    @Override
    public String attack(){
        System.out.println("Um criminoso levou seu Iphone!");
        return null;
    }
}
