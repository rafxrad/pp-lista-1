public class AmazoniaEnemyFactory implements EnemyFactory {

    @Override
    Enemy buildEnemy(){
        return new Mutant();
    }
}