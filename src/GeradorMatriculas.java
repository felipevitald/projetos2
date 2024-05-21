import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorMatriculas {
    private static final int NUM_DIGITOS_MATRICULA = 7; // Número de dígitos da matrícula
    private static final Random random = new Random();

    public static List<String> gerarMatriculas(int quantidade) {
        List<String> matriculas = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            String matricula = gerarMatricula();
            matriculas.add(matricula);
        }
        return matriculas;
    }

    private static String gerarMatricula() {
        StringBuilder matricula = new StringBuilder();
        for (int i = 0; i < NUM_DIGITOS_MATRICULA; i++) {
            int digito = random.nextInt(10); // Gera um dígito aleatório de 0 a 9
            matricula.append(digito);
        }
        return matricula.toString();
    }

    public static void main(String[] args) {
        int quantidadeMatriculas = 5; // Exemplo: gerar 5 matrículas
        List<String> matriculasGeradas = gerarMatriculas(quantidadeMatriculas);
        for (String matricula : matriculasGeradas) {
            System.out.println(matricula);
        }
    }
}
