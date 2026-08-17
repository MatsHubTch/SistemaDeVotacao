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

            escolha = teclado.nextInt();
        } while (quantia > 5);

//------------------------------------------------------------------------------------------

        if (escolha == 1) {


            do {

                System.out.println("Quantos candidatos deseja cadastrar?");
                quantia = teclado.nextInt();
                teclado.nextLine();
                candidatos = new String[quantia];
                for (int i = 0; i < quantia; i++) {
                    System.out.print("Qual o nome do candidato " + (i + 1) + "? ");
                    candidatos[i] = teclado.nextLine();
                }

            } while (quantia >= 6);

//------------------------------------------------------------------------------------------

        }

        teclado.close();
    }
}
