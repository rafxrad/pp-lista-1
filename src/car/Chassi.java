package car;

public class Chassi implements Component {

	private double peso = 0.9;
	private String name = "Chassi";
	
	
	
	
	public Chassi(double peso, String name) {
		super();
		this.peso = peso;
		this.name = name;
	}


	@Override
	public double calcularPeso() {
		// TODO Auto-generated method stub
		return peso;
	}
	
	

}
