
package com.mycompany.ejercicio2_poo;

import java.util.Scanner;

public class Ejercicio2_POO {
    
    public static int indiceCocheMBarato(Vehiculo coches[]){
            float precio;
            int indice = 0;
            
            precio = coches[0].getPrecio();
            for(int i=1;i<coches.length;i++){
                if(coches[i].getPrecio() < precio){
                    precio = coches[i].getPrecio();
                    indice = i;
                }
            }
            return indice;
        }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos;
        int indiceBarato;
        
        System.out.println("Digite la cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del coche :"+(i+1)+":");
            System.out.println("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.println("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca Precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo , precio);
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
