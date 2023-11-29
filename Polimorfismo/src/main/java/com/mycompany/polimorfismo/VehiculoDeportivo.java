
package com.mycompany.polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    
    private int cilindrada;
    
    public VehiculoDeportivo(int cilindrada,String matricula,String marca,String modelo){
        super(matricula,marca,modelo);
        this.cilindrada= cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override
    public String MostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCilindrada"+cilindrada;
    }
}
