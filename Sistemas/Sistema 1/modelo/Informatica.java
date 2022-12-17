public class Informatica extends Curso {
    private String descricao;

    public Informatica(String nome, String descricao) {
        super(nome);
        this.setDescricao(descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String toString() {
        String t = "Informatica[Nome= " + this.getNome() + " Descricao= " + this.descricao;
        return t;
    }
}