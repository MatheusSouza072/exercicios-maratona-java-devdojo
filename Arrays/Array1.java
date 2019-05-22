package Arrays;

public class Array1 {
	public static void main(String[] args) {
        
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Trunks";

        for(int i=0; i < nomes.length;i++){
            System.out.println((i + 1) + " nome "+nomes[i]);
        }

        nomes = new String[4];
	    }
}
