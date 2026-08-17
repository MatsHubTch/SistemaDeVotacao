import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Vota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int escolha;

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

        

        teclado.close();
    }
}
