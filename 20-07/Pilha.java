import java.util.Scanner;

public class Pilha {

    public static final int TAM = 5;
    public static int[] pilha = new int[TAM];
    public static int topo = 0;
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        int op;

        do {

            System.out.println(menu());
            op = scan.nextInt();

            switch (op) {
                case 1:
                    empilhar();
                break;

                case 2:
                    desempilhar();
                break;

                case 3:
                    mostrarPilha();
                break;

                case 4:
                    procurar();
                break;
            }

        } while (op != 0);
    }

    public static void empilhar() {
        if (cheia()) {
            System.out.println("\n----------------------------------");
            System.out.print("Digite um número para empilhar: ");
            int valor = scan.nextInt();
            System.out.println("----------------------------------");
            pilha[topo] = valor;
            topo++;
            pausa();
        } else {
            System.out.println("\nPilha cheia!");
            pausa();
        }
    }

    public static void desempilhar() {
        if (vazia()) {
            int valor = pilha[topo-1];
            pilha[topo-1] = 0;
            topo--;
            System.out.println("\nValor [" + valor + "] Retirado");
            pausa();
        } else {
            System.out.println("\nPilha Vazia!");
            pausa();
        }
    }

    public static void mostrarPilha() {

        if (vazia()) {
            System.out.println("\n--PILHA--");
            for (int i = topo-1; i >= 0; i--) {
                System.out.println("["+ (i+1) +"] - " + pilha[i]);
            }
            System.out.println("---------");
            pausa();
        } else {
            System.out.println("\nPilha vazia!");
            pausa();
        }
        
    }

    public static void procurar() {

        if (vazia()) {
            System.out.println("\n----------------------------------");
            System.out.print("Digite um número para procurar: ");
            int valor = scan.nextInt();
            System.out.println("----------------------------------");

            int flag = 0;
            for (int i = 0; i < pilha.length; i++) {
                if (pilha[i] == valor) {
                    System.out.println("\nNúmero " + valor + " encontrada na posição [" + (i+1) + "]");
                    flag = 1;
                }
            }

            if (flag == 0) {
                System.out.println("\nNúmero não encontrado!");
            }
            pausa();

        }  else {
            System.out.println("\nPilha Vazia!");
            pausa();
        }
    }

    public static boolean cheia() {
        if (topo >= TAM) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean vazia() {
        if (topo <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String menu() {

        String str = "";
        str += "\n";
        str += "1 - Empilhar\n";
        str += "2 - Desempilhar\n";
        str += "3 - Mostrar Pilha\n";
        str += "4 - Procurar Elemento\n";
        str += "0 - Sair\n";

        return str;
    } 

    public static void pausa() {

        scan.nextLine();
        System.out.println("\nAPERTE QUALQUER TECLA PARA CONTINUAR");
        String pausa = scan.nextLine();
        

    }
}

