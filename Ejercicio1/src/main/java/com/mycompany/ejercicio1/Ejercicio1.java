/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author edins
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(numero %10 == 0){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" es multiplo de diez");
        }
        else
            JOptionPane.showMessageDialog(null, "el numero no es multiplo de diez");
        }
    }
