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
		double PESO_PARCIAL = 0;
		// TODO Auto-generated method stub
		for (Component peca: arvorePecas) {
			PESO_PARCIAL += peca.calcularPeso();
			peca.info();
			System.out.print("O peso parcial é: " + PESO_PARCIAL);
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


	

}
