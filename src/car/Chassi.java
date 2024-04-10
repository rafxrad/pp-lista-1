package car;

public class Chassi implements Component {

	private double peso;
	private String name;
	
	
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

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
	

}
