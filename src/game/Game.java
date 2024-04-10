package game;

public class Game {
	
	Location location;
	
	public Game(Location location){
		this.location = location;
		// TODO Auto-generated constructor stub
	}

	public void play() {
	
		Enemy enemy = location.createEnemyFactory().buildEnemy();
		System.out.println("Você está em: " + location.getName() + " e seu inimigo aqui é " + enemy.getName());
		enemy.attack();
	}

}
