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
		arvorePecas.add(new Peca("Capô", 45));
		
		
	}
	

	@Override
	public void calcularPesoParcial() {
		System.out.println("ADD CARROCERIA---");
		double PESO_PARCIAL = 0;
		// TODO Auto-generated method stub
		for (Component peca: arvorePecas) {
			PESO_PARCIAL += peca.calcularPesoTotal();
			peca.calcularPesoParcial();
			System.out.println("O peso parcial da Carroceria é: " + PESO_PARCIAL);
		}

	}

	@Override
	public double calcularPesoTotal() {
		// TODO Auto-generated method stub
		double PESO_TOTAL = 0;
		
		for (Component peca: arvorePecas) {
			PESO_TOTAL += peca.calcularPesoTotal();
		}
		
		return PESO_TOTAL;
	}
	

}
