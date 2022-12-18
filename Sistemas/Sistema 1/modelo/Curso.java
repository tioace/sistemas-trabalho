public class Curso {
    private String nome;

    public Curso(String nome) {
        super();
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        String t = "Curso[Nome= " + this.nome + "]";
        return t;
    }
}
