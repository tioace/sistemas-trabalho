import java.util.ArrayList;

public class Curso {
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        super();
        this.disciplinas = new ArrayList<>();
    }

    public void adicionar(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public Disciplina mostrarDisciplina(int posicao) {
        return this.disciplinas.get(posicao);
    }

    public int tamanho() {
        return this.disciplinas.size();
    }
}
