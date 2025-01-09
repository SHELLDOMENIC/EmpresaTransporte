
package com.mycompany.empresatransporte.clases.carro;

//hereda de clase de vehiculos 
//clase concreta
public class Avion extends Vehiculos {
    //implementamos el metodo de la clase principal, quitandole "Abstract"
    @Override
    //NO OLVIDAR PONER EL OVERRIDE 
    public void transportar(){
        System.out.println("El avion transporta productos grandes o internacionales de forma rapida por aire");
    }
    
}
