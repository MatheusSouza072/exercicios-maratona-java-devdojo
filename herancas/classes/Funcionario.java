package herancas.classes;

public class Funcionario extends Pessoa {

    private double salario;

    {
        System.out.println("Bloco de inicializacao de funcionario 1");
    }

    {
        System.out.println("Bloco de inicializacao de funcionario 2");
    }

    static {
        System.out.println("Bloco de inicialização");
    }


    public Funcionario(String nome) {
        super(nome);
        
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + "recebi o pagamento de " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
