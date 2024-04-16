package game;

public class Amazonia implements Location {

	String name = "Amazônia";
   
	@Override 
    public String getName(){
        return this.name;
    }
    
    @Override
    public EnemyFactory createEnemyFactory(){
        return new AmazoniaEnemyFactory();
    }
}