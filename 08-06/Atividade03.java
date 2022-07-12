import java.util.Scanner;

public class Atividade03 {
    
    public static void main(String[] args) {
         
        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite um numero inteiro:");
        numero = scan.nextInt();

        System.out.println("Invertido:");
        inverter(numero);
        System.out.println("\n");

    }

    public static int inverter(int numero) {

        int auxiliar = numero;

        if(numero == 0) {
            return 0;
        } else {
            auxiliar = numero % 10;
            numero = numero / 10;
            System.out.print(auxiliar);
            return inverter(numero);
        }
    }
}