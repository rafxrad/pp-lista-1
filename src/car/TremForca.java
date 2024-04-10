package car;

import java.util.ArrayList;
import java.util.List;

public class TremForca implements Component{
	
	private List<Component> arvorePecas;
	
	public TremForca() {
		arvorePecas = new ArrayList<>();
		arvorePecas.add(new Peca("motor", 200));
		arvorePecas.add(new Peca("transmissão", 40));
		arvorePecas.add(new Peca("diferencial", 60));
		arvorePecas.add(new Peca("rodas", 70));
	
		
	}
	

	@Override
	public void info() {
		// TODO Auto-generated method stub
		for (Component peca: arvorePecas) {
			System.out.println("Adicionando peça " + peca.getName());
		}
	}

	@Override
	public double calcularPeso() {
		// TODO Auto-generated method stub
		double PESO_TOTAL = 0;
		
		for (Component peca: arvorePecas) {
			PESO_TOTAL += peca.calcularPeso();
		}
		
		return PESO_TOTAL;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
