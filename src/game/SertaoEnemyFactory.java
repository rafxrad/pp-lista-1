package game;

public class SertaoEnemyFactory implements EnemyFactory {
	
    @Override
    public Enemy buildEnemy(){
        return new Cangaceiro();
    

    }
    
}
