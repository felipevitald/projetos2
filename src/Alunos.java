public class Alunos extends Usuario {
    private int matricula;
    private String serie;

    public Alunos(String nome, String email, String senha, int matricula, String serie) {
        super(nome, email, senha, matricula);
        this.serie = serie;
    }

    // Getters e Setters

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
