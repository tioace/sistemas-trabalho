public class Propedeutica extends Disciplina {
    private String objetivos;

    public Propedeutica(String nome, String ementa, String objetivos) {
        super(nome, ementa);
        this.setObjetivos(objetivos);
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getObjetivos() {
        return this.objetivos;
    }

    public String toString() {
        String t = "Propedeutica[Nome = " + this.getNome() + "  Ementa = " + this.getEmenta() + "  Objetivos = "
                + this.objetivos + "]";
        return t;
    }
}
