package ControleDeFluxo;

public class Controle1 {
	  public static void main(String[] args) {
	        
	        int idade = 14;
	        String categoria;
	        if(idade < 15) {
	            categoria = "infantil";
	        }else if(idade>=15 && idade < 18){
	            categoria = "juvenil";
	        }else{
	            categoria = "adulto";
	        }
	        System.out.println(categoria);

}
}
