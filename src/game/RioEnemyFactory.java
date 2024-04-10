package game;


public class RioEnemyFactory implements EnemyFactory {

    @Override
    public Enemy buildEnemy(){
        return new Criminoso();
    }
}