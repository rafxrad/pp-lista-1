package car;

public class Peca implements Component {
	
	private String name;
	private double peso;
	
	

	public Peca(String name, double peso) {
		this.name = name;
		this.peso = peso;
	}

	

	@Override
	public double calcularPesoTotal() {
		// TODO Auto-generated method stub
		return peso;
	}



	@Override
	public void calcularPesoParcial(){
		// TODO Auto-generated method stub
		System.out.println("Adicionando a parte: " + name + " PESO: " + peso);
	}



	public String getName() {
		return name;
	}



	public double getPeso() {
		return peso;
	}
	
	
	

}
