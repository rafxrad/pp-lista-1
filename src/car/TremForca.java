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
	public void calcularPesoParcial() {
		System.out.println("ADD TREM DE FORÇA----");
		double PESO_PARCIAL = 0;
		// TODO Auto-generated method stub
		for (Component peca: arvorePecas) {
			PESO_PARCIAL += peca.calcularPesoTotal();
			peca.calcularPesoParcial();
			System.out.println("O peso parcial é do Trem de Força é: " + PESO_PARCIAL);
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
