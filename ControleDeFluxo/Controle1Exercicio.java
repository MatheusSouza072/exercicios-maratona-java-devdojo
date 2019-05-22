package ControleDeFluxo;

public class Controle1Exercicio {
	public static void main(String[] args) {

		double sal = 1000;
		double impostoTotal = 0;
		if (sal <= 1000) {
			System.out.println("entro um");
			impostoTotal = sal * 0.05;
		} else if (sal >= 1000 && sal < 2000) {
			System.out.println("entrou dois");
			impostoTotal = sal * 0.1;  
		} else if (sal >= 2000 && sal < 4000) {
			impostoTotal = sal * 0.15;
		} else {
			impostoTotal = sal * 0.2;
		}

		System.out.print("O total de imposto : " + impostoTotal);

	}
}
