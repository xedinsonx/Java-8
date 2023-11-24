
package com.mycompany.ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author edins
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"La letra es Minuscula");
        }
    }
}
