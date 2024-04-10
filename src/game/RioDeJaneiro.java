package game;


public class RioDeJaneiro implements Location {
    @Override 
    public String getName(){
        return "Rio de Janeiro";
    }
    
    @Override
    public EnemyFactory createEnemyFactory(){
        return new RioEnemyFactory();
    }
}