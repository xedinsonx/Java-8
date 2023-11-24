/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional1;

import javax.swing.JOptionPane;

/**
 *
 * @author edins
 */
public class Condicional1 {

    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero de 1 a 5 "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                break;
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
                break;
            case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
                break;
            case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
                break;    
            default:JOptionPane.showMessageDialog(null,"El numero no cumple la condicion");
        }
    }
}
