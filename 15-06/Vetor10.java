import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vetor10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] vetor = new int[10];
        int chave, pos;
        long tempoInicial, tempoFinal;

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(10);
        }

        Arrays.sort(vetor);

        for(int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }

        System.out.print("\nDigite um numero de 0 a 10: ");
        chave = scan.nextInt();

        System.out.println("\nBusca Sequencial ["+10+"]");

        tempoInicial = System.currentTimeMillis();

        pos = buscaSequencial(vetor, chave);
        if(pos == -1) {
            System.out.println("\nNumero nao encontrado");
        } else {
            System.out.println("\nNumero[" + chave + "] encontrado na posicao: " + pos);
        }

        tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("tempo de execucao: " + tempoFinal + "\n");

        // Busca Binaria
        System.out.println("\nBusca Binaria ["+10+"]");

        tempoInicial = System.currentTimeMillis();
        
        pos = buscaBinaria(vetor, chave);
        if(pos == -1) {
            System.out.println("\nNumero nao encontrado");
        } else {
            System.out.println("\nNumero[" + chave + "] encontrado na posicao: " + pos);
        }

        tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("tempo de execucao: " + tempoFinal + "\n");

    }

    public static int buscaSequencial(int[] vetor, int chave) {
        int pos;

        for(pos = 0; pos < vetor.length; pos++) {
            if(vetor[pos] == chave) {
                pos += 1;
                return pos;
            }
        }

        return 1;
    }

    public static int buscaBinaria(int[] vetor, int chave) {
        int primeiro, meio, ultimo;

        primeiro = 0;
        ultimo = vetor.length - 1;

        while(primeiro <= ultimo) {
            meio = (primeiro + ultimo) / 2;
            if(vetor[meio] == chave) {
                meio += 1;
                return meio;
            } else {
                if(chave < vetor[meio]) {
                    ultimo = meio - 1;
                } else {
                    primeiro = meio + 1;
                }
            }
        }

        return 1;
    }
}