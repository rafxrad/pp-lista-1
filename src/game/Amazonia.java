package game;

public class Amazonia implements Location {

	
    @Override 
    public String getName(){
        return "Amazônia";
    }
    
    @Override
    public EnemyFactory createEnemyFactory(){
        return new AmazoniaEnemyFactory();
    }
}