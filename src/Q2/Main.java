package Q2;


import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        try {

            System.out.println("Atrações da semana:");
            String pathBandas = "C:\\Users\\12116809\\IdeaProjects\\Av2\\src\\Q2\\txt\\Shows.txt";
            TxtReader.leitor(pathBandas);
            TxtReader.Escreve(pathBandas);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
