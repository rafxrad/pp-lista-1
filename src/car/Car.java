package car;

import java.util.ArrayList;
import java.util.List;

public class Car implements Component{
	private List<Component> arvorePecas;
	
	public Car() {
		System.out.println("CONSTRUINDO CARRO");
		arvorePecas = new ArrayList<>();
		arvorePecas.add(new Carroceria());
		arvorePecas.add(new Chassi());
		
	}
	

	@Override
	public void calcularPesoParcial() {
		double PESO_PARCIAL = 0;
		// TODO Auto-generated method stub
		for (Component peca: arvorePecas) {
			PESO_PARCIAL += peca.calcularPesoTotal();
			peca.calcularPesoParcial();
			System.out.println("PESO PARCIAL DO CARRO: " + PESO_PARCIAL);
		}

	}

	@Override
	public double calcularPesoTotal() {
		// TODO Auto-generated method stub
		double PESO_TOTAL = 0;
		
		for (Component peca: arvorePecas) {
			peca.calcularPesoParcial();
			PESO_TOTAL += peca.calcularPesoTotal();
			
		}
		System.out.println("PESO TOTAL DO CARRO: " + PESO_TOTAL);
		return PESO_TOTAL;
	}
	

}
