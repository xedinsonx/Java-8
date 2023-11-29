
package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
       
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo(4,"GH65","Toyota","AK9");
        misVehiculos[2] = new VehiculoDeportivo(500,"GG67","Camaro","R89");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"HH67","CHERY","E89");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.MostrarDatos());
            System.out.println("");
        }
    }
}
