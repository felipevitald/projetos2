import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {
    private List<String> alunos;

    public GestaoAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(String aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String aluno) {
        alunos.remove(aluno);
    }

    public void remanejarAlunosRestantes() {
        // Implemente aqui a lógica para remanejar os alunos restantes
        System.out.println("Remanejando alunos restantes...");
    }

    public void imprimirListaAlunos() {
        System.out.println("Lista de Alunos:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
