package biblioteca;

import java.time.LocalDate;

public class Autor {
    private String nome;
    private LocalDate dataDeNascimento;
    private String paisDeOrigem;
    private String bibliografia;

    public Autor(String nome, LocalDate dataDeNascimento, String paisDeOrigem, String bibliografia){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.paisDeOrigem = paisDeOrigem;
        this.bibliografia = bibliografia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", paisDeOrigem='" + paisDeOrigem + '\'' +
                ", bibliografia='" + bibliografia + '\'' +
                '}';
    }
}
