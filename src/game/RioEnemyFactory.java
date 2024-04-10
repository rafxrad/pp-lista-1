public class RioEnemyFactory implements EnemyFactory {

    @Override
    Enemy buildEnemy(){
        return new Criminoso();
    }
}