package sobrescritaDeMetodos.tests;

import sobrescritaDeMetodos.classes.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Matheus");
		p.setIdade(17);
		System.out.println(p);
		Pessoa p2 = new Pessoa();
		p2.setNome("Joca");
		p2.setIdade(12);
		System.out.println(p2);
	}
}
