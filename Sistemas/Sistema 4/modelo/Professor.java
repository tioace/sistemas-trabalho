public class Professor extends Pessoa {
    private String formacao;

    public Professor(String nome, String matricula, String formacao) {
        super(nome, matricula);
        this.setFormacao(formacao);
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public String toString() {
        String t = "Professor[Nome = " + this.getNome() + "  Matricula = " + this.getMatricula() + "  Formacao = "
                + this.formacao + "]";
        return t;
    }
}
