package herancas.tests;

import herancas.classes.Endereco;
import herancas.classes.Funcionario;

public class HerancaTest {
	public static void main(String[] args) {

      Endereco end = new Endereco();

      end.setRua("Rua 25");

 
      Funcionario f = new Funcionario("Matheus");
      f.setCpf("98765");
      f.setSalario(15000);
      f.setEndereco(end);


  }
}
