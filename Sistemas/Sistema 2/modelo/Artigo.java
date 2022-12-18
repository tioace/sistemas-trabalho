public class Artigo extends Documento {
    private String doi;

    public Artigo(String titulo, String autor, String doi) {
        super(titulo, autor);
        this.setDoi(doi);
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getDoi() {
        return this.doi;
    }

    public String toString() {
        String t = "Artigo[Titulo = " + this.getTitulo() + "  Autor = " + this.getAutor() + "  Doi = " + this.doi + "]";
        return t;
    }
}
