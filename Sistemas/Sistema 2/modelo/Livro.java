public class Livro extends Documento {
    private String isbn;

    public Livro(String titulo, String autor, String isbn) {
        super(titulo, autor);
        this.setIsbn(isbn);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String toString() {
        String t = "Livro[Titulo = " + this.getTitulo() + "  Autor = " + this.getAutor() + "  Isbn = " + this.isbn
                + "]";
        return t;
    }
}
