
package ClasesyObjetos;

public class Coche {
    
    //Atributos
    String color;
    String marca;
    int km;
    
    public static void main(String [] args){
        
        Coche coche1 = new Coche();
        
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El km del coche1 es: "+coche1.km);
        
        Coche coche2 = new Coche();
        
        coche2.color ="Rojo";
        coche2.marca ="Ferrari";
        coche2.km = 100;
        
        System.out.println("/El color del coche1 es: "+coche2.color);
        System.out.println("La marca del coche1 es: "+coche2.marca);
        System.out.println("El km del coche1 es: "+coche2.km);
        
    }
}
