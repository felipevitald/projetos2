import java.util.ArrayList;
import java.util.List;

public class Eletivas {
    private String nomeMateria;
    private int quantidadeAlunos;
    private String descricaoMateria;
    private List<String> materias;

    public Eletivas(String nomeMateria, int quantidadeAlunos, String descricaoMateria) {
        this.nomeMateria = nomeMateria;
        this.quantidadeAlunos = quantidadeAlunos;
        this.descricaoMateria = descricaoMateria;
        this.materias = new ArrayList<>();
    }

    // Getters e Setters

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getDescricaoMateria() {
        return descricaoMateria;
    }

    public void setDescricaoMateria(String descricaoMateria) {
        this.descricaoMateria = descricaoMateria;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void adicionarMateria(String materia) {
        materias.add(materia);
    }

    public void removerMateria(String materia) {
        materias.remove(materia);
    }
}
