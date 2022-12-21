public class Disciplina {
    private String nome;
    private String ementa;

    public Disciplina(String nome, String ementa) {
        super();
        this.setNome(nome);
        this.setEmenta(ementa);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getEmenta() {
        return this.ementa;
    }

    public String toString() {
        String t = "Disciplina[Nome = " + this.nome + "  Ementa = " + this.ementa + "]";
        return t;
    }
}
