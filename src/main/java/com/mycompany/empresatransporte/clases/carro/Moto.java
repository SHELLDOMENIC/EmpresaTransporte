
package com.mycompany.empresatransporte.clases.carro;

//hereda de clase de vehiculos 
//clase concreta
public class Moto extends Vehiculos {
    //implementamos el metodo de la clase principal, quitandole "Abstract"
    @Override
    //NO OLVIDAR PONER EL OVERRIDE
    public void transportar (){
        System.out.println("La moto tranporta productos pequeños rapidamente en areas urbanas.");
    } 
    
}

  
