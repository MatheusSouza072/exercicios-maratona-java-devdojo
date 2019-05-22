package polimorfismo.test;


import polimorfismo.classes.Gerente;
import polimorfismo.classes.RelatorioPagamento;
import polimorfismo.classes.Vendedor;


public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Matheus", 5000, 2000);
        Vendedor v = new Vendedor("Ana",2000,10000);
        RelatorioPagamento relatorio =  new RelatorioPagamento();

        relatorio.relatorioPagamentoGenerico(g);
      
        relatorio.relatorioPagamentoGenerico(v);

    }
}
