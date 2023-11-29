
package com.mycompany.polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    private int Npuertas;
    
    public VehiculoTurismo(int NPuertas, String matricula, String marca, String modelo){
        super(matricula,marca,modelo);
        this.Npuertas = Npuertas;
    }

    public int getNpuertas() {
        return Npuertas;
    }
    
    @Override
    public String MostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nNumero de Puertas"+Npuertas;
    }
    
}
