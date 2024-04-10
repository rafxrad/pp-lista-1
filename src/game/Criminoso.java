package game;


public class Criminoso implements Enemy {
	
	public String getName() {
		return "Criminoso";
	}

    @Override
    public String attack(){
        System.out.println("Um criminoso levou seu Iphone!");
        return null;
    }
}
