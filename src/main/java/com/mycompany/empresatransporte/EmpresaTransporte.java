

package com.mycompany.empresatransporte;

//clase principal

import com.mycompany.empresatransporte.clases.carro.Avion;
import com.mycompany.empresatransporte.clases.carro.Carro;
import com.mycompany.empresatransporte.clases.carro.Moto;
import com.mycompany.empresatransporte.clases.carro.Vehiculos;

public class EmpresaTransporte {

    public static void main(String[] args) {
        //crear instancias de las subclases 
        Vehiculos carro =new Carro();
        Vehiculos moto =new Moto();
        Vehiculos avion = new Avion();
        System.out.println("velocidad "+ carro.calcularDistancia(0, 0));
       }
    
}
