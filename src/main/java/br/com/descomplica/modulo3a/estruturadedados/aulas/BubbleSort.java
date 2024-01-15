package br.com.descomplica.modulo3a.estruturadedados.aulas;

/**
 *
 * @author wilson
 */
public class BubbleSort {

    public static int[] sort(int num[]) {
        final int n = num.length;
        int aux;
        for(int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; i++){
                if (num[j] > num[j+1]){
                    aux = num[j];
                    num[j] = num[j+1];
                    num[j+1] = aux;
                }
            }
        }
        return num;
    }
}
