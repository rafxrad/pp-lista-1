package game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Location rio = new RioDeJaneiro();
		Location amazonia = new Amazonia();
		Location sertao = new Sertao();
		
		
		Game mygame1 = new Game(rio);
		Game mygame2 = new Game(amazonia);
		Game mygame3 = new Game(sertao);
		
		
		mygame1.play();
		mygame2.play();
		mygame3.play();
		
		

	}

}
