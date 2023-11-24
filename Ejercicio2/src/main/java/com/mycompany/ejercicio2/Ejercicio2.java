/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author edins
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero1,numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
        
         numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
       
       if(numero1 > numero2 ) {
           JOptionPane.showMessageDialog(null,"El numero "+numero1+" es mayor");
       } else if (numero1 < numero2) {
           JOptionPane.showMessageDialog(null,"El numero "+numero2+" es mayor");
       }else
         JOptionPane.showMessageDialog(null,"El numero son igual");  
       } 
    }

