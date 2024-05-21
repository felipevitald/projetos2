import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
    private List<Eletivas> eletivas;

    public Professor(String nome, String email, String senha, int matricula) {
        super(nome, email, senha, matricula);
        this.eletivas = new ArrayList<>();
    }

    // Método para adicionar uma eletiva
    public void adicionarEletiva(Eletivas eletiva) {
        eletivas.add(eletiva);
    }

    // Getters e Setters

    public List<Eletivas> getEletivas() {
        return eletivas;
    }

    public void setEletivas(List<Eletivas> eletivas) {
        this.eletivas = eletivas;
    }
}
