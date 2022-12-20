public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.setCurso(curso);
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public String toString() {
        String t = "Aluno[Nome = " + this.getNome() + "  Matricula = " + this.getMatricula() + "  Curso = " + this.curso
                + "]";
        return t;
    }
}
