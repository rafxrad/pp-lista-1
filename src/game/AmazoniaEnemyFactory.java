package game;

public class AmazoniaEnemyFactory implements EnemyFactory {

    @Override
    public Enemy buildEnemy(){
        return new Mutant();
    }
}