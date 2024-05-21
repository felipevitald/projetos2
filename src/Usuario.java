public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int matricula;

    public Usuario(String nome, String email, String senha, int matricula) {
        this.nome = nome;
        // Verifica se o email é corporativo
        if (email.endsWith("@nave.com.br")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email não é da Instituição.");
        }
        this.senha = senha;
        this.matricula = matricula;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@nave.com.br")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email não é da Instituição.");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
