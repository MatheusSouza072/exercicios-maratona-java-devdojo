package sobrecargaDeMetodos.tests;

import sobrecargaDeMetodos.classes.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Kika Francisca", "323.231.312-34", 4500, "322342-9");
		Funcionario funcionarioDois = new Funcionario();

		funcionario.printS();
		funcionarioDois.printS();

	}
}
