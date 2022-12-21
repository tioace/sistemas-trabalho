public class Tecnica extends Disciplina {
    private String habilidades;

    public Tecnica(String nome, String ementa, String habilidades) {
        super(nome, ementa);
        this.setHabilidades(habilidades);
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getHabilidades() {
        return this.habilidades;
    }

    public String toString() {
        String t = "Tecnica[Nome = " + this.getNome() + "  Ementa = " + this.getEmenta() + "  Habilidades = "
                + this.habilidades + "]";
        return t;
    }
}
