package car;


import java.util.ArrayList;
import java.util.List;

public class Chassi implements Component {
		private List<Component> arvorePecas;
		
		public Chassi() {
			arvorePecas = new ArrayList<>();
			arvorePecas.add(new TremForca());
			arvorePecas.add(new Peca("Suspensao", 80));
		}
		

		@Override
		public void calcularPesoParcial() {
			
			System.out.println("ADD CHASSI---");


			double PESO_PARCIAL = 0;
			// TODO Auto-generated method stub
			for (Component peca: arvorePecas) {
				PESO_PARCIAL += peca.calcularPesoTotal();
				peca.calcularPesoParcial();
				System.out.println("O peso parcial do Chassi é: " + PESO_PARCIAL);
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

	
