package game;

public class Sertao implements Location {

	
    @Override 
    public String getName(){
        return "Sertão";
    }
    
    @Override
    public EnemyFactory createEnemyFactory(){
        return new SertaoEnemyFactory();
    }
}