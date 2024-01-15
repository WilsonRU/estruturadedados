package br.com.descomplica.modulo3a.estruturadedados.aulas;

/**
 *
 * @author wilson
 */
public class QuickSort {
    public static void sort(int p, int q, int vetor[]){
        int x;
        if (p < q){
            x = part(p, q, vetor);
            sort(p, x - 1, vetor);
            sort(x+1, q, vetor);
        }
    }
    
    private static int part(int p, int q, int vetor[]){
        int j = p - 1;
        int temp, aux = vetor[q];
        
        for (int i = p; i<=q; i++){
            if (vetor[i] <= aux){
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        return j;
    }
}
