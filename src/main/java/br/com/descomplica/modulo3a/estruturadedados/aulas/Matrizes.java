package br.com.descomplica.modulo3a.estruturadedados.aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class Matrizes {
    
    public int Soma() {
        int MatSoma[][], soma = 0;
        
        MatSoma = new int[10][12];
        
        for (int a = 0; a <= 9; a++){
            for(int b = 0; b <= 11; b++){
                MatSoma[a][b] = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite um valor")
                );
                soma = soma + MatSoma[a][b];
            }
        }
        
        return soma;
    }
}
