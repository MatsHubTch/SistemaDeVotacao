import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Vota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int escolha = 0;
        int quantia = 0;
        String[] candidatos = null;


//------------------------------------------------------------------------------------------

        do {
            System.out.println("================================");
            System.out.println("       SISTEMA DE VOTAÇÃO       ");
            System.out.println("================================");
            System.out.println("\n");
            System.out.println("1 - Cadastro candidatos");
            System.out.println("2 - Iniciar votação");
            System.out.println("3 - Exibir resultado");
            System.out.println("4 - Exibir matrix de votos");
            System.out.println("5 - Encerrar sistema");
            System.out.print("\n");
            System.out.println("Selecione uma opção: ");
            System.out.print("\n");
            escolha = teclado.nextInt();
            System.out.print("\n");


//------------------------------------------------------------------------------------------

            if (escolha == 1) {


                System.out.println("Quantos candidatos deseja cadastrar?");
                System.out.print("\n");
                quantia = teclado.nextInt();
                teclado.nextLine();
                System.out.print("\n");

                candidatos = new String[quantia];
                for (int i = 0; i < quantia; i++) {
                    System.out.println("Qual o nome do candidato " + (i + 1) + "? ");
                    System.out.print("\n");
                    candidatos[i] = teclado.nextLine();
                    System.out.print("\n");
                }
                System.out.println("\nCandidatos cadastrados:");
                System.out.print("\n");
                for (int i = 0; i < quantia; i++) {
                    System.out.println(("Candidato " + (i + 1) + ":" + "\n") + ("Numero" + ": " + (i + 1) + "\n") + "Nome: " + candidatos[i] + "\n");
                }

                System.out.print("\n");
                System.out.println("Cadastro concluído com sucesso!");
                System.out.print("\n");

                System.out.println("Digite 0 para voltar ao menu e continuar a votação: ");
                System.out.print("\n");
                escolha = teclado.nextInt();
                System.out.print("\n");

            }
        }while (quantia != 5) ;

//------------------------------------------------------------------------------------------



        teclado.close();
    }
}
