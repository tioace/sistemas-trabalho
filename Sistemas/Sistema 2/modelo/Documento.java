public class Documento {
    private String titulo;
    private String autor;

    public Documento(String titulo, String autor) {
        super();
        this.setAutor(autor);
        this.setTitulo(titulo);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public String toString() {
        String t = "Documento[Titulo= " + this.titulo + " Autor= " + this.autor + "]";
        return t;
    }
}