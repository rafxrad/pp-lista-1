package car;

import java.util.ArrayList;
import java.util.List;

public class Carroceria implements Component {

	private List<Component> arvorePecas;
	
	public Carroceria() {
		arvorePecas = new ArrayList<>();
		arvorePecas.add(new Peca("Para-lamas", 80));
		arvorePecas.add(new Peca("Paineis", 50));
		arvorePecas.add(new Peca("Portas", 120));
		arvorePecas.add(new Peca("Suspensao", 45));
		
		
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
