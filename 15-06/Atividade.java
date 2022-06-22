import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Atividade {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        Random rand = new Random();
        long tempoInicioSequencial, tempoFinalSequencial, tempoInicioBinario, tempoFinalBinario;
        int escolha, chave;
        int[] vetor;
        
        do {

            System.out.println("\n1 - Vetor[10]");
            System.out.println("2 - Vetor[100]");
            System.out.println("3 - Vetor[1000]");
            System.out.println("4 - Vetor[10000]");
            System.out.println("5 - Vetor[100000]");
            System.out.println("0 - sair");
            System.out.print("> ");
            escolha = scan.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("\n\nDigite a chave: ");
                    chave = scan.nextInt();

                    vetor = new int[10];

                    for(int i = 0; i < vetor.length; i++) {
                        vetor[i] = rand.nextInt(20);
                    }

                    Arrays.sort(vetor);

                    tempoInicioSequencial = System.currentTimeMillis();
                    if(buscaSequencia(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalSequencial = System.currentTimeMillis() - tempoInicioSequencial;

                    System.out.println("\nTempo Busca Sequencial (ms): " + tempoFinalSequencial);

                    tempoInicioBinario = System.currentTimeMillis();
                    if(buscaBinaria(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalBinario = System.currentTimeMillis() - tempoInicioBinario;

                    System.out.println("\nTempo Busca Binaria (ms): " + tempoFinalBinario);
                break;

                case 2:
                    System.out.print("\n\nDigite a chave: ");
                    chave = scan.nextInt();

                    vetor = new int[100];

                    for(int i = 0; i < vetor.length; i++) {
                        vetor[i] = rand.nextInt(200);
                    }

                    Arrays.sort(vetor);

                    tempoInicioSequencial = System.currentTimeMillis();
                    if(buscaSequencia(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalSequencial = System.currentTimeMillis() - tempoInicioSequencial;

                    System.out.println("\nTempo Busca Sequencial (ms): " + tempoFinalSequencial);

                    tempoInicioBinario = System.currentTimeMillis();
                    if(buscaBinaria(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalBinario = System.currentTimeMillis() - tempoInicioBinario;

                    System.out.println("\nTempo Busca Binaria (ms): " + tempoFinalBinario);
                break;

                case 3:
                    System.out.print("\n\nDigite a chave: ");
                    chave = scan.nextInt();

                    vetor = new int[1000];

                    for(int i = 0; i < vetor.length; i++) {
                        vetor[i] = rand.nextInt(2000);
                    }

                    Arrays.sort(vetor);

                    tempoInicioSequencial = System.currentTimeMillis();
                    if(buscaSequencia(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalSequencial = System.currentTimeMillis() - tempoInicioSequencial;

                    System.out.println("\nTempo Busca Sequencial (ms): " + tempoFinalSequencial);

                    tempoInicioBinario = System.currentTimeMillis();
                    if(buscaBinaria(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalBinario = System.currentTimeMillis() - tempoInicioBinario;

                    System.out.println("\nTempo Busca Binaria (ms): " + tempoFinalBinario);
                break;

                case 4:
                    System.out.print("\n\nDigite a chave: ");
                    chave = scan.nextInt();

                    vetor = new int[10000];

                    for(int i = 0; i < vetor.length; i++) {
                        vetor[i] = rand.nextInt(20000);
                    }

                    Arrays.sort(vetor);

                    tempoInicioSequencial = System.currentTimeMillis();
                    if(buscaSequencia(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalSequencial = System.currentTimeMillis() - tempoInicioSequencial;

                    System.out.println("\nTempo Busca Sequencial (ms): " + tempoFinalSequencial);

                    tempoInicioBinario = System.currentTimeMillis();
                    if(buscaBinaria(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalBinario = System.currentTimeMillis() - tempoInicioBinario;

                    System.out.println("\nTempo Busca Binaria (ms): " + tempoFinalBinario);
                break;

                case 5:
                    System.out.print("\n\nDigite a chave: ");
                    chave = scan.nextInt();

                    vetor = new int[100000];

                    for(int i = 0; i < vetor.length; i++) {
                        vetor[i] = rand.nextInt(200000);
                    }

                    Arrays.sort(vetor);

                    tempoInicioSequencial = System.currentTimeMillis();
                    if(buscaSequencia(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalSequencial = System.currentTimeMillis() - tempoInicioSequencial;

                    System.out.println("\nTempo Busca Sequencial (ms): " + tempoFinalSequencial);

                    tempoInicioBinario = System.currentTimeMillis();
                    if(buscaBinaria(vetor, chave) == true) {
                        System.out.println("\nNumero Encontrado");
                    } else {
                        System.out.println("\nNumero Nao Encontrado");
                    }
                    tempoFinalBinario = System.currentTimeMillis() - tempoInicioBinario;

                    System.out.println("\nTempo Busca Binaria (ms): " + tempoFinalBinario);
                break;

                default:
                    System.out.println("\nOpcao Invalida");
                break;
            }

        } while(escolha != 0);
    }

    public static boolean buscaSequencia(int[] vetor, int chave) {

        for(int pos = 0; pos < vetor.length; pos++) {
            if(vetor[pos] == chave) {
                return true;
            }
        }

        return false;
    }

    public static boolean buscaBinaria(int[] vetor, int chave) {

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while(fim >= inicio) {
            meio = (inicio + fim) / 2;
            if(vetor[meio] < chave) {
                inicio = meio + 1;
            } else if(vetor[meio] > chave) {
                fim = meio - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}