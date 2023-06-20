package Q1.entities;

public class EscritorioDentista {
    private String dia;
    private int horariosDis;
    private int horariosOcu;

    public EscritorioDentista() {
    }

    public EscritorioDentista(String dia, Integer horariosDis, Integer horariosOcu) {
        this.dia = dia;
        this.horariosDis = horariosDis;
        this.horariosOcu = horariosOcu;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getHorariosDis() {
        return horariosDis;
    }

    public void setHorariosDis(Integer horariosDis) {
        this.horariosDis = horariosDis;
    }

    public Integer getHorariosOcu() {
        return horariosOcu;
    }

    public void setHorariosOcu(Integer horariosOcu) {
        this.horariosOcu = horariosOcu;
    }

    public int horariosRestantes() {
        return horariosDis - horariosOcu;
    }

    @Override
    public String toString() {
        return "escritorioDentista{" +
                "dia='" + dia + '\'' +
                ", horariosDis=" + horariosDis +
                ", horariosOcu=" + horariosOcu +
                '}';
    }
}
