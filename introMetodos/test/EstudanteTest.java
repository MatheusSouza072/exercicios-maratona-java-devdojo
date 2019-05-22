package introMetodos.test;

import introMetodos.classes.Estudante;

public class EstudanteTest {
	 public static void main(String[] args) {
	        Estudante estudante = new Estudante();
	        estudante.setNome("Matheus Souza");
	        estudante.setIdade(16);
	        estudante.setNotas(new double[]{3,2,9.5});
	        estudante.print();
	        estudante.tirarNotaMedia();
	        System.out.println("Aprovado "+estudante.Aprovado());


	    }
}
