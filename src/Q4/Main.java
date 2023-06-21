package Q4;

import Q4.entities.Doce;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Doce> listaDoces = new ArrayList<>();


        int numDoces = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos doces diferentes deseja registrar?","Doces diferentes",JOptionPane.PLAIN_MESSAGE));

        for (int i = 1; i <= numDoces; i++) {
            String nome = JOptionPane.showInputDialog(null,"Informe o nome do "+ i+  "º doce:","Qual seu doce?",JOptionPane.PLAIN_MESSAGE);
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade do "+ i+  "º doce:","Qual a quantidade?",JOptionPane.PLAIN_MESSAGE));

            Doce doce = new Doce(nome, quantidade);
            listaDoces.add(doce);
        }

        // cria meu arquivo e salva ele
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("estoque.txt"))) {
            for (Doce doce : listaDoces) {
                writer.write("Você comprou " + doce.getQuantidade() +" unidades de " + doce.getNome());
                writer.newLine();
            }
            System.out.println("Estoque registrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
