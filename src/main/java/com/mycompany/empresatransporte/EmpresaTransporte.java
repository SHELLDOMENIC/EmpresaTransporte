

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
        
        
        System.out.println("Cálculo de distancia para un carro:");
        System.out.println("Distancia (solo velocidad): " + carro.calcularDistancia(100,12));
        System.out.println("Distancia (velocidad y tiempo): " + carro.calcularDistancia(100, 2));
        System.out.println("Distancia (con eficiencia): " + carro.calcularDistancia(100, 2, 0.8));
       
        // Uso del polimorfismo dinámico (sobrescritura)
        System.out.println("\nMétodos polimórficos dinámicos:");
        Vehiculos [] vehiculos = {carro, moto, avion};
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].transportar(); // Resuelto dinámicamente en tiempo de ejecución
       }    
    }
