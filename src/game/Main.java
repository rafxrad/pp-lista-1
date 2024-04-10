package game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Location rio = new RioDeJaneiro();
		Location amazonia = new Amazonia();
		
		Game mygame1 = new Game(rio);
		Game mygame2 = new Game(amazonia);
		
		mygame1.play();
		mygame2.play();
		
		

	}

}
