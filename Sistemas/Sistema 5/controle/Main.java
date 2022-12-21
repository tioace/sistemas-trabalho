import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Curso disciplinas = new Curso();

        while (true) {

            System.out.println("");
            System.out.println("Escolha o tipo de disciplina que deseja cadastrar: \n [1] Tecnica \n [2] Propedeutica");
            int escolha = leitor.nextInt();
            leitor.nextLine();

            if (escolha == 1) {
                System.out.print("Digite o nome: ");
                String nome = leitor.nextLine();
                System.out.print("Digite a ementa: ");
                String ementa = leitor.nextLine();
                System.out.print("Digite as habilidades: ");
                String habilidades = leitor.nextLine();

                Disciplina tcd = new Tecnica(nome, ementa, habilidades);
                disciplinas.adicionar(tcd);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição da nova disciplina \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    System.out.println(disciplinas.mostrarDisciplina(disciplinas.tamanho() - 1));
                    System.out.println("Posicao: " + (disciplinas.tamanho() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < disciplinas.tamanho(); i++) {
                        System.out.println(disciplinas.mostrarDisciplina(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            }

            else if (escolha == 2) {
                System.out.print("Digite o nome: ");
                String nome = leitor.nextLine();
                System.out.print("Digite a ementa: ");
                String ementa = leitor.nextLine();
                System.out.print("Digite os objetivos: ");
                String objetivos = leitor.nextLine();

                Disciplina pdd = new Propedeutica(nome, ementa, objetivos);
                disciplinas.adicionar(pdd);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição da nova disciplina \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    for (int i = 0; i < disciplinas.tamanho(); i--) {
                        System.out.println(disciplinas.mostrarDisciplina(i));
                        System.out.println("Posicao: " + i);
                    }
                } else if (saida == 2) {
                    for (int i = 0; i < disciplinas.tamanho(); i++) {
                        System.out.println(disciplinas.mostrarDisciplina(i));
                        System.out.println("Posicao: " + i);
                    }
                }

            }
        }
    }
}
