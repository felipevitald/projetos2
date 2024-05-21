import java.util.List;

public class Administrativo extends Usuario {
    private GestaoAlunos gestaoAlunos;

    public Administrativo(String nome, String email, String senha, int matricula, GestaoAlunos gestaoAlunos) {
        super(nome, email, senha, matricula);
        this.gestaoAlunos = gestaoAlunos;
    }

    public void gerarMatriculas(int quantidade) {
        List<String> matriculasGeradas = GeradorMatriculas.gerarMatriculas(quantidade);
        for (String matricula : matriculasGeradas) {
            gestaoAlunos.adicionarAluno(matricula);
        }
    }

    public void adicionarAluno(String aluno) {
        gestaoAlunos.adicionarAluno(aluno);
    }

    public void removerAluno(String aluno) {
        gestaoAlunos.removerAluno(aluno);
    }

    public void remanejarAlunosRestantes() {
        gestaoAlunos.remanejarAlunosRestantes();
    }

}
