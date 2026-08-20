import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Vota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int escolha = 0;
        int quantia = 0;
        int quantidadeCandidatos = 0;
        int voto;
        int totalVotos = 0;
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int votos5 = 0;
        String[] candidatos = null;

//------------------------------------------------------------------------------------------

        do {
            System.out.println("================================");
            System.out.println("       SISTEMA DE VOTAÇÃO       ");
            System.out.println("================================");
            System.out.println("\n");
            System.out.println("1 - Cadastro de candidatos");
            System.out.println("2 - Iniciar votação");
            System.out.println("3 - Exibir resultado");
            System.out.println("4 - Exibir matriz de votos");
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
                quantidadeCandidatos = quantia;
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



            }
            if (escolha == 2) {
                System.out.println("================================");
                System.out.println("       INÍCIO DA VOTAÇÂO        ");
                System.out.println("================================");
                System.out.println("\n");
                System.out.println("Candidatos cadastrados até agora:");
                for (int i = 0; i < quantia; i++) {
                    System.out.println((i + 1) + " - " + candidatos[i]);

                }
                System.out.print("\n");
                System.out.println("Digite 0 para encerrar a votação e 1 para continuar: ");
                System.out.print("\n");
                escolha = teclado.nextInt();
                System.out.print("\n");
                if (escolha == 1) {
                    System.out.println("Digite o número do candidato.");
                    voto = teclado.nextInt();

                    while (voto < 1 || voto > quantidadeCandidatos) {
                        System.out.println("Erro! Candidato inexistente.");
                        voto = teclado.nextInt();
                    }

                    if (voto == 1) votos1++;
                    if (voto == 2) votos2++;
                    if (voto == 3) votos3++;
                    if (voto == 4) votos4++;
                    if (voto == 5) votos5++;

                    totalVotos++;
                    System.out.println("Voto registrado com sucesso.");
                }

            }

//------------------------------------------------------------------------------------------

            if (escolha == 3) {
                int maiorNumeroDeVotos = votos1;

                if (votos2 > maiorNumeroDeVotos) maiorNumeroDeVotos = votos2;
                if (votos3 > maiorNumeroDeVotos) maiorNumeroDeVotos = votos3;
                if (votos4 > maiorNumeroDeVotos) maiorNumeroDeVotos = votos4; //ver quem ganhou
                if (votos5 > maiorNumeroDeVotos) maiorNumeroDeVotos = votos5;


                System.out.println("================================");
                System.out.println("       RESULTADO DA VOTAÇÃO     "); //exibe o resultado se n tiver empate
                System.out.println("================================");
                System.out.println(candidatos[0] + " -> " + votos1 + " votos");
                if (quantidadeCandidatos >= 2) System.out.println(candidatos[1] + " -> " + votos2 + " votos");
                if (quantidadeCandidatos >= 3) System.out.println(candidatos[2] + " -> " + votos3 + " votos");
                if (quantidadeCandidatos >= 4) System.out.println(candidatos[3] + " -> " + votos4 + " votos");
                if (quantidadeCandidatos >= 5) System.out.println(candidatos[4] + " -> " + votos5 + " votos");
                System.out.println("Total de votos: " + totalVotos);

//------------------------------------------------------------------------------------------

                int quantidadeEmpates = 0;
                if (votos1 == maiorNumeroDeVotos) quantidadeEmpates++;
                if (votos2 == maiorNumeroDeVotos && quantidadeCandidatos >= 2) quantidadeEmpates++;
                if (votos3 == maiorNumeroDeVotos && quantidadeCandidatos >= 3) quantidadeEmpates++; //defin se foi empate
                if (votos4 == maiorNumeroDeVotos && quantidadeCandidatos >= 4) quantidadeEmpates++;
                if (votos5 == maiorNumeroDeVotos && quantidadeCandidatos >= 5) quantidadeEmpates++;


                if (quantidadeEmpates > 1) {
                    System.out.println("\n================================");
                    System.out.println("       RESULTADO COM EMPATE     ");
                    System.out.println("================================");
                    System.out.println("RESULTADO DA VOTAÇÃO");
                    System.out.println("\n" + candidatos[0] + " -> " + votos1 + " votos");
                    if (quantidadeCandidatos >= 2) System.out.println(candidatos[1] + " -> " + votos2 + " votos");
                    if (quantidadeCandidatos >= 3) System.out.println(candidatos[2] + " -> " + votos3 + " votos");
                    if (quantidadeCandidatos >= 4) System.out.println(candidatos[3] + " -> " + votos4 + " votos");
                    if (quantidadeCandidatos >= 5) System.out.println(candidatos[4] + " -> " + votos5 + " votos");
                    System.out.println("\nTotal de votos: " + totalVotos);
                    System.out.println("\nEMPATE ENTRE:");

                    if (votos1 == maiorNumeroDeVotos) System.out.println("- " + candidatos[0]);
                    if (votos2 == maiorNumeroDeVotos && quantidadeCandidatos >= 2) System.out.println("- " + candidatos[1]);
                    if (votos3 == maiorNumeroDeVotos && quantidadeCandidatos >= 3) System.out.println("- " + candidatos[2]);
                    if (votos4 == maiorNumeroDeVotos && quantidadeCandidatos >= 4) System.out.println("- " + candidatos[3]);
                    if (votos5 == maiorNumeroDeVotos && quantidadeCandidatos >= 5) System.out.println("- " + candidatos[4]);
                } else {
                    System.out.println("\nVencedor:"); //mostra quem empatou ou quam venceu
                    if (votos1 == maiorNumeroDeVotos) System.out.println(candidatos[0]);
                    if (votos2 == maiorNumeroDeVotos && quantidadeCandidatos >= 2) System.out.println(candidatos[1]);
                    if (votos3 == maiorNumeroDeVotos && quantidadeCandidatos >= 3) System.out.println(candidatos[2]);
                    if (votos4 == maiorNumeroDeVotos && quantidadeCandidatos >= 4) System.out.println(candidatos[3]);
                    if (votos5 == maiorNumeroDeVotos && quantidadeCandidatos >= 5) System.out.println(candidatos[4]);
                }
            }

//------------------------------------------------------------------------------------------

        }while (escolha != 5) ;
        teclado.close();
    }
}