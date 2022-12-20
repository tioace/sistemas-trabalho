import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Turma() {
        super();
        this.alunos = new ArrayList<Aluno>();
        this.professores = new ArrayList<Professor>();
    }

    public void adicionarA(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno mostrarAluno(int posicao) {
        return this.alunos.get(posicao);
    }

    public int tamanhoA() {
        return this.alunos.size();
    }

    public void adicionarP(Professor professor) {
        professores.add(professor);
    }

    public Professor mostrarProfessor(int posicao) {
        return this.professores.get(posicao);
    }

    public int tamanhoP() {
        return this.professores.size();
    }
}
