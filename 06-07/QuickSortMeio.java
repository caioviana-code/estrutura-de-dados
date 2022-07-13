import java.util.Arrays;
import java.util.Random;

public class QuickSortMeio {
    
    public static void main(String[] args) {
        
        int vet[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(10);
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
        int pivo = vet[esq + dir / 2];
        int i = esq, j = dir;
        while (i <= j) {
            if (vet[i] <= pivo)
                i++;
            else if (pivo < vet[j])
                j--;
            else {
                int troca = vet[i];
                vet[i] = vet[j];
                vet[j] = troca;
                i++;
                j--;
            }
        }
        vet[esq] = vet[j];
        vet[j] = pivo;
        return j;
    }

    public static void trocar(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
}