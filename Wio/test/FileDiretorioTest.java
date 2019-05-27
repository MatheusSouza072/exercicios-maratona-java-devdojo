package Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {

        buscarArquivos();
    }

    public static void buscarArquivos() {
        File file = new File("/home/maximiliano/eclipse-workspace/DevDojo/folder2");
        String[] list = file.list();
        for (String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}


