public class Edificacoes extends Curso {
    private String descricao;

    public Edificacoes(String nome, String descricao) {
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
        String t = "Edificacoes[Nome= " + this.getNome() + " Descricao= " + this.descricao;
        return t;
    }
}
