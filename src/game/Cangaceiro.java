package game;

public class Cangaceiro implements Enemy {
	
	@Override
    public String attack(){
        System.out.println("Você levou uma peixeirada!");
        return null;
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Cangaceiro";
	}

}
