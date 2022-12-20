public class Pessoa {
    private String nome;
    private String matricula;

    public Pessoa(String nome, String matricula) {
        super();
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String toString() {
        String t = "Pessoa[Nome = " + this.nome + "  Matricula = " + this.matricula + "]";
        return t;
    }
}
