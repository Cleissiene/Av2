package Q4.entities;

public class Doce {
    private String nome;
    private int quantidade;

    public Doce() {
    }

    public Doce(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Doce{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
