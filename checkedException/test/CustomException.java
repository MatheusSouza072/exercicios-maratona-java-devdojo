package checkedException.test;

import CustomException.LoginInvalidoException;

public class CustomException {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace(); 
        }  
    } 
  
    private static void logar() throws LoginInvalidoException{  
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "222";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "312";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}