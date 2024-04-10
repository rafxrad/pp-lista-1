public class Amazonia implements Location {
    @Override 
    string getName(){
        return "Amazônia"
    }
    
    @Override
    EnemyFactory createEnemyFactory(){
        return new AmazoniaEnemyFactory();
    }
}