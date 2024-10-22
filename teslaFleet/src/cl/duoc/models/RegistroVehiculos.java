/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class RegistroVehiculos {
    public List <Vehiculos> registro = new ArrayList<>();

    public RegistroVehiculos() {
        registro = new ArrayList();
        
    }
    
    
    public void agregarVehiculo(Vehiculos agregado){
        registro.add(agregado);
        System.out.println("--- Vehiculo Agregado!--- ");
        
    }
    
    
    public void listarVehiculos(){
        for (Vehiculos agregado : registro){
            System.out.println("vehiculo" + agregado.getCodigoUnico());
            
        }
        
    }   
        
     public void totalVehiculos(){
            System.out.println("---Total Vehiculos--" + registro.size());   
        
       
        
        

     }
            
       
            
}
