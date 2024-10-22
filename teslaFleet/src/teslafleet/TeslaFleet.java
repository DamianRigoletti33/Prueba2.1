/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.models.Autos;
import cl.duoc.models.RegistroVehiculos;
import cl.duoc.models.Vehiculos;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RegistroVehiculos lista = new RegistroVehiculos();
        
        Autos auto2 = new Autos(3, false, "A002", true);
        Autos auto3 = new Autos(2, true, "A002", false);
        Autos auto4 = new Autos(2, false, "A003", true);
        
        auto2.calcularCosto(4);
        
 
                
        

        
        
        
        //MENU
        
        Scanner entrada = new Scanner (System.in);
        int opcion = 0;
        
        
        while(opcion != 4 ){
            
           
           System.out.println("[1] Elegir Vehiculo");
           System.out.println("[2] Agregar Vehiculo");
           System.out.println("[3] Alquiler total");
           System.out.println("[4] Salir");
           opcion = entrada.nextInt();
           
           switch(opcion){
               case 1:
                   
                   System.out.println("Vehiculos Disponibles");
                   lista.listarVehiculos();
                   break;
                   
                   
                   
                           
                   
               case 2:
                   System.out.println("Agregar Vehiculo ");
                   
                   
                   
                   
                   
               case 3:
                   System.out.println("Alquiler total");
                   
                   
               case 4:
                   System.out.println("");
                   
                  
                   
           }
           
           
           
           
     
           
           
        
        
    }
       
      
                
                
        
        
        
        
        
        
        
        
        
        
    }
    
}
