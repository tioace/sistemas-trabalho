import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Biblioteca documentos = new Biblioteca();

        while (true) {

            System.out.println("");
            System.out.println("Escolha o documento que deseja implementar: \n[1]Artigo \n[2]Livro");
            int escolha = leitor.nextInt();
            leitor.nextLine();

            if (escolha == 1) {
                System.out.print("Digite o titulo:  ");
                String titulo = leitor.nextLine();
                System.out.print("Digite o(a) autor(es): ");
                String autor = leitor.nextLine();
                System.out.print("Digite o doi: ");
                String doi = leitor.nextLine();

                Documento atd = new Artigo(titulo, autor, doi);
                documentos.adicionar(atd);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição do artigo \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    System.out.println(documentos.mostrarDocumento(documentos.tamanho() - 1));
                    System.out.println("Posicao: " + (documentos.tamanho() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < documentos.tamanho(); i++) {
                        System.out.println(documentos.mostrarDocumento(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            } else if (escolha == 2) {
                System.out.print("Digite o titulo:  ");
                String titulo = leitor.nextLine();
                System.out.print("Digite o(a) autor(es): ");
                String autor = leitor.nextLine();
                System.out.print("Digite o isbn: ");
                String isbn = leitor.nextLine();

                Documento lvd = new Livro(titulo, autor, isbn);
                documentos.adicionar(lvd);

                System.out.println("");
                System.out.println(
                        "Escolha a saída das informações: \n [1] Mostar apenas a posição do livro \n [2] Mostra tudo");
                int saida = leitor.nextInt();

                if (saida == 1) {
                    System.out.println(documentos.mostrarDocumento(documentos.tamanho() - 1));
                    System.out.println("Posicao: " + (documentos.tamanho() - 1));
                } else if (saida == 2) {
                    for (int i = 0; i < documentos.tamanho(); i++) {
                        System.out.println(documentos.mostrarDocumento(i));
                        System.out.println("Posicao: " + i);
                    }
                }
            }
        }
    }
}