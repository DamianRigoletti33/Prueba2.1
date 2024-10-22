/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;



/**
 *
 * @author Cetecom
 */
public class Autos extends Vehiculos{
    public int cantidadPasajeros;
    public boolean autopiloto;

    public Autos(int cantidadPasajeros, boolean autopiloto) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.autopiloto = autopiloto;
    }

    public Autos(int cantidadPasajeros, boolean autopiloto, String codigoUnico, boolean mantenimiento) {
        super(codigoUnico, mantenimiento);
        this.cantidadPasajeros = cantidadPasajeros;
        this.autopiloto = autopiloto;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isAutopiloto() {
        return autopiloto;
    }

    public void setAutopiloto(boolean autopiloto) {
        this.autopiloto = autopiloto;
    }

    @Override
    public String toString() {
        return "Autos{" + "cantidadPasajeros=" + cantidadPasajeros + ", autopiloto=" + autopiloto + '}';
    }

    
    //metodos

    public double calcularCosto(int Horas){
        double costo = VALOR_HORA_ALQUILER*Horas;
        if (autopiloto == true){
            costo *= 1.10;
            
        }
        return costo;
                
        
    }

    @Override
    public double calcularCostoAlquiler(int Horas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
   
    
    
}
