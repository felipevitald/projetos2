import java.util.ArrayList;
import java.util.List;

public class SelecionarEletivas {
    private List<String> eletivasDisponiveis;
    private List<String> eletivasSelecionadas;

    public SelecionarEletivas() {
        this.eletivasDisponiveis = new ArrayList<>();
        this.eletivasSelecionadas = new ArrayList<>();
    }

    public void adicionarEletiva(String eletiva) {
        eletivasDisponiveis.add(eletiva);
    }

    public void selecionarEletiva(String eletiva) {
        if (eletivasDisponiveis.contains(eletiva)) {
            if (eletivasSelecionadas.size() < 2) {
                eletivasSelecionadas.add(eletiva);
                System.out.println("Eletiva selecionada: " + eletiva);
            } else {
                System.out.println("Você já selecionou duas eletivas.");
            }
        } else {
            System.out.println("Eletiva não disponível.");
        }
    }

    public void mostrarEletivasDisponiveis() {
        System.out.println("Eletivas Disponíveis:");
        for (String eletiva : eletivasDisponiveis) {
            System.out.println(eletiva);
        }
    }

    public static void main(String[] args) {
        SelecionarEletivas selecaoEletivas = new SelecionarEletivas();

        // Adicionar eletivas disponíveis
        selecaoEletivas.adicionarEletiva("Matemática");
        selecaoEletivas.adicionarEletiva("História");
        selecaoEletivas.adicionarEletiva("Artes");

        selecaoEletivas.mostrarEletivasDisponiveis();

        // Aluno seleciona eletivas
        selecaoEletivas.selecionarEletiva("Matemática");
        selecaoEletivas.selecionarEletiva("História");
        selecaoEletivas.selecionarEletiva("Artes"); // Tentativa de selecionar mais do que o permitido
    }
}
