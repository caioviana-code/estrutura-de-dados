import java.util.Arrays;
import java.util.Random;

public class QuickSortFim {
    
    public static void main(String[] args) {
        
        int vet[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(20);
        }
        
        System.out.println("\n");
        System.out.println(Arrays.toString(vet));
        quickSort(vet, 0, vet.length-1);
        System.out.println(Arrays.toString(vet));
    }

    public static void quickSort(int[] vet, int esq, int dir) {
        if (esq < dir) {
            int j = separar(vet, esq, dir);
            quickSort(vet, esq, j-1);
            quickSort(vet, j+1, dir);
        }
    }

    public static int separar(int[] vet, int esq, int dir) {
        int pivo = vet[dir];
        int i = esq;
        for (int j = esq; j < dir; j++) {
            if (vet[j] <= pivo) {
                trocar(vet, i, j);
                i++;
            }
        }
        trocar(vet, i, dir);
        return i;
    }

    public static void trocar(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
}