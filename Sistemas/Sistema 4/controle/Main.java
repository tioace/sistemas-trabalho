import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Turma alunos = new Turma();
        Turma professores = new Turma();

        while (true) {

            System.out.println("");
            System.out.println("Escolha o usuário que deseja cadastras: \n[1]Aluno \n[2]Professor");
            int escolha = leitor.nextInt();
            leitor.nextLine();

            if (escolha == 1) {
                System.out.print("Digite o nome:  ");
                String nome = leitor.nextLine();
                System.out.print("Digite a matricula: ");
                String matricula = leitor.nextLine();
                System.out.print("Digite o curso: ");
                String curso = leitor.nextLine();

                Aluno alp = new Aluno(nome, matricula, curso);
                alunos.adicionarA(alp);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição do novo aluno \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    System.out.println(alunos.mostrarAluno(alunos.tamanhoA() - 1));
                    System.out.println("Posicao:" + (alunos.tamanhoA() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < alunos.tamanhoA(); i++) {
                        System.out.println(alunos.mostrarAluno(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            } else if (escolha == 2) {
                System.out.print("Digite o nome:  ");
                String nome = leitor.nextLine();
                System.out.print("Digite a matricula: ");
                String matricula = leitor.nextLine();
                System.out.print("Digite a formacao: ");
                String formacao = leitor.nextLine();

                Professor pfp = new Professor(nome, matricula, formacao);
                professores.adicionarP(pfp);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição do novo professor \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    System.out.println(professores.mostrarProfessor(professores.tamanhoP() - 1));
                    System.out.println("Posicao:" + (professores.tamanhoP() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < professores.tamanhoP(); i++) {
                        System.out.println(professores.mostrarProfessor(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            }
        }

    }
}
