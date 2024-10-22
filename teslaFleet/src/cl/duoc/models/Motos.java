/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Motos extends Vehiculos{
    public int capacidadBateria;
    public boolean modoeco;

    public Motos(int capacidadBateria, boolean modoeco) {
        this.capacidadBateria = capacidadBateria;
        this.modoeco = modoeco;
    }

    public Motos(int capacidadBateria, boolean modoeco, String codigoUnico, boolean mantenimiento) {
        super(codigoUnico, mantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.modoeco = modoeco;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isModoeco() {
        return modoeco;
    }

    public void setModoeco(boolean modoeco) {
        this.modoeco = modoeco;
    }

    @Override
    public String toString() {
        return "Motos{" + "capacidadBateria=" + capacidadBateria + ", modoeco=" + modoeco + '}';
    }
    
    //metodos
    
    public double calcularCosto(int Horas){
        double costo = VALOR_HORA_ALQUILER*Horas;
        
        if(modoeco == true){
            costo *= 1.08;
            
        }
        return costo;    
        
                
                
    }

    @Override
    public double calcularCostoAlquiler(int Horas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
}
