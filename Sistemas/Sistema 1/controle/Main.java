import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Instituicao cursos = new Instituicao();

        while (true) {

            System.out.println("");
            System.out.println("Escolha o curso que deseja estudar na Instituição: \n[1]Edificacoes \n[2]Informatica");
            int escolha = leitor.nextInt();
            leitor.nextLine();

            if (escolha == 1) {
                System.out.print("Digite seu nome:  ");
                String nome = leitor.nextLine();
                System.out.print("Digite sua descricao: ");
                String descricao = leitor.nextLine();

                Curso edc = new Edificacoes(nome, descricao);
                cursos.adicionar(edc);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição do novo curso \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    System.out.println(cursos.mostrarCurso(cursos.tamanho() - 1));
                    System.out.println("Posicao: " + (cursos.tamanho() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < cursos.tamanho(); i++) {
                        System.out.println(cursos.mostrarCurso(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            }

            else if (escolha == 2) {
                System.out.print("Digite seu nome:  ");
                String nome = leitor.nextLine();
                System.out.print("Digite sua descricao: ");
                String descricao = leitor.nextLine();

                Curso ifc = new Informatica(nome, descricao);
                cursos.adicionar(ifc);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição do novo curso \n [2] Mostra tudo");
                int saida = leitor.nextInt();
                System.out.println("");

                if (saida == 1) {
                    System.out.println(cursos.mostrarCurso(cursos.tamanho() - 1));
                    System.out.println("Posicao: " + (cursos.tamanho() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < cursos.tamanho(); i++) {
                        System.out.println(cursos.mostrarCurso(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            }
        }

    }
}
