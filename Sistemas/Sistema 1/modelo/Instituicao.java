import java.util.ArrayList;

public class Instituicao {
    private ArrayList<Curso> cursos;

    public Instituicao() {
        super();
        this.cursos = new ArrayList<Curso>();
    }

    public void adicionar(Curso nome) {
        cursos.add(nome);
    }

    public Curso mostrarCurso(int posicao) {
        return this.cursos.get(posicao);
    }

    public int tamanho() {
        return this.cursos.size();
    }
}
