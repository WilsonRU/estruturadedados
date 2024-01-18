package br.com.descomplica.modulo3a.estruturadedados.aulas.ordenacao;

/**
 *
 * @author wilson
 */
public class BubbleSort {

	private static int aux;
	/*
	 * Algoritimo de ordençao BubbleSort 
	*/
    public static int[] sort(int num[]) {
        for(int i = 0; i < num.length-1; i++){
            for (int j = 0; j < num.length-1-i; i++){
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
