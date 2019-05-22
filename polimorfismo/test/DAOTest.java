package polimorfismo.test;

import polimorfismo.classes.ArquivoDAOImpl;

import polimorfismo.classes.GenericDAO;


import java.util.LinkedList;
import java.util.List;


public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        for(String nome : lista ){
            System.out.println(nome);
        }
    }
}
