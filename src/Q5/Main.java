package Q5;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            String time1 = "C:\\Users\\12116809\\IdeaProjects\\Av2\\src\\Q5\\times\\Minas e Rj.txt";
            String time2 = "C:\\Users\\12116809\\IdeaProjects\\Av2\\src\\Q5\\times\\Sp e Rio Grande do Sul.txt";
            String confronto = "C:\\Users\\12116809\\IdeaProjects\\Av2\\src\\Q5\\times\\Confronto.txt";

            TxtReader.leitor(time1);
            TxtReader.leitor(time2);
            TxtReader.Sobrescrever(time1, time2, confronto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

