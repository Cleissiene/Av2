package Q1;

import Q1.entities.EscritorioDentista;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EscritorioDentista escritorio = new EscritorioDentista();

        String dia =JOptionPane.showInputDialog(null, "Informe o dia do atendimento ", "Dia da semana"
                , JOptionPane.PLAIN_MESSAGE);

        escritorio.setDia(dia);

        int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos horários atenderá neste dia", "Horários Disponíveis"
                , JOptionPane.PLAIN_MESSAGE));

        escritorio.setHorariosDis(dis);

        int ocu = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos horários já foram marcados", "Horários Ocupados"
                , JOptionPane.PLAIN_MESSAGE));

        escritorio.setHorariosOcu(ocu);

       int horariosLivres = escritorio.horariosRestantes();

        JOptionPane.showMessageDialog(null, "Na " + dia + " ainda restam " + horariosLivres + " horários", "Horários Restantes:", JOptionPane.PLAIN_MESSAGE);

        sc.close();
    }
}
