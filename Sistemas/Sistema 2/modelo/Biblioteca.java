import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Documento> documentos;

    public Biblioteca() {
        super();
        this.documentos = new ArrayList<>();
    }

    public void adicionar(Documento doc) {
        this.documentos.add(doc);
    }

    public Documento mostrarDocumento(int posicao) {
        return this.documentos.get(posicao);
    }

    public int tamanho() {
        return this.documentos.size();
    }
}
