package blocosdeInicializacao.classes;

public class Cliente {
	private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for(int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
