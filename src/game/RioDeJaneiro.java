public class RioDeJaneiro implements Location {
    @Override 
    string getName(){
        return "Rio de Janeiro"
    }
    
    @Override
    EnemyFactory createEnemyFactory(){
        return new RioEnemyFactory();
    }
}