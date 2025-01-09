
package com.mycompany.empresatransporte.clases.carro;

// clases abstract /polimorfismo
public abstract class  Vehiculos {
    //metodo abstract
    public abstract void transportar (); 
    
     public double calcularDistancia  (double velocidad, double tiempo){
             return (velocidad*1);
       }
    
    public double calcularDistancia (double velocidad, double tiempo){
    return (velocidad * tiempo);
    
    }
    public double calcularDistancia (double velocidad,double tiempo,double constante){
    return (velocidad * tiempo* constante);
    }
}
