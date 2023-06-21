package Q5;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

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


    public static void Sobrescrever(String caminho1, String caminho2, String caminho3) throws IOException {
        BufferedReader brTime1 = new BufferedReader(new FileReader(caminho1));
        BufferedReader brTime2 = new BufferedReader(new FileReader(caminho2));
        BufferedWriter brConfronto = new BufferedWriter(new FileWriter(caminho3));

        String time1, time2;
        String horaAleatoria = horaDoJogo();

        while ((time1 = brTime1.readLine()) != null && (time2 = brTime2.readLine()) != null) {
            brConfronto.write(time1 + " x " + time2 + " " + horaAleatoria + "\n");
        }
        brTime1.close();
        brTime2.close();
        brConfronto.close();

        System.out.println("\nConfrontos dos times foram gravados em: " + caminho3);
    }

    public static String horaDoJogo() {
        int hora = ThreadLocalRandom.current().nextInt(13, 22); //gera uma hora aleatoria entre 13 e 21h
        int minuto = ThreadLocalRandom.current().nextInt(0, 31); //gera meu minutos aleatorio entre 0 e 30

        String horaStr = String.format("%02d", hora);
        String minutoStr = String.format("%02d", minuto);

        return horaStr + ":" + minutoStr;
    }
    }

