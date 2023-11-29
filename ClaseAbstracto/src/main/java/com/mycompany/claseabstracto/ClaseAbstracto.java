
package com.mycompany.claseabstracto;


public class ClaseAbstracto {

    public static void main(String[] args) {
       Planta planta = new Planta();
       AnimalCarnivoro AnimalC = new AnimalCarnivoro();
       AnimalHervivoro AnimalH = new AnimalHervivoro();
       
       planta.alimentarse();
       AnimalC.alimentarse();
       AnimalH.alimentarse();
    }
}
