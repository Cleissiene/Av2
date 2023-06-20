package Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReader {
    public static void leitor (String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }


    public static void Escreve(String path) throws IOException {

        BufferedReader brNome = new BufferedReader(new FileReader(path));
        brNome.close();
    }
}

