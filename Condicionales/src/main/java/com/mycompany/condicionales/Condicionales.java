
 

package com.mycompany.condicionales;

import javax.swing.JOptionPane;



/**
 *
 * @author edins
 */
public class Condicionales {

    public static void main(String[] args) {
      
        int numero, dato =5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero > dato){
            JOptionPane.showMessageDialog(null,"El numero es mayor o igual 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es menor de 5");
            
        }
        
    }
}
