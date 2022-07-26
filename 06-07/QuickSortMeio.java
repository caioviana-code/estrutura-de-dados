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
        int i = esq;
        int j = dir;
        while (i <= j) {
            if (vet[i] <= vet[pivo]) {
                i++;
            } else if (vet[j] >= vet[pivo]) {
                j--;
            } else {
                trocar(vet, i, j);
                i++;
                j--;
            }
        }

        if (pivo < j) {
            trocar(vet, j, pivo);
            pivo = j;
            return pivo;
        } else if (pivo > i) {
            trocar(vet, i, pivo);
            pivo =  i;
            return pivo;
        }
        
    }

    public static void trocar(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
}