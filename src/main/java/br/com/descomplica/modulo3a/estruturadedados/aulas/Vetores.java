package br.com.descomplica.modulo3a.estruturadedados.aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class Vetores {
    
    public int Soma() {
        int VetSoma [], soma = 0;
        
        VetSoma = new int[100];
        
        for (int i = 0; i <= 99; i++){
            VetSoma[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o Valor")
            );
            soma = soma + VetSoma[i];
        }
        
        return soma;
    }
    
}
