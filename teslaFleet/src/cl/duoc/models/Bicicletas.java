/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Bicicletas extends Vehiculos {
    public String tipoFrenos;
    private int capacidadBateriakm;

    public Bicicletas(String tipoFrenos, int capacidadBateriakm) {
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriakm = capacidadBateriakm;
    }

    public Bicicletas(String tipoFrenos, int capacidadBateria, String codigoUnico, boolean mantenimiento) {
        super(codigoUnico, mantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriakm = capacidadBateria;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getCapacidadBateria() {
        return capacidadBateriakm;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateriakm = capacidadBateria;
    }

    @Override
    public String toString() {
        return "Bicicletas{" + "tipoFrenos=" + tipoFrenos + ", capacidadBateriakm=" + capacidadBateriakm + '}';
    }

    
    
    ///metodos
       public double calcularCosto(int Horas){
        double costo = VALOR_HORA_ALQUILER * Horas;
        
        if(capacidadBateriakm < 20){
            costo *= 0.95;
            
            
        }
        return costo;
       
       }

    @Override
    public double calcularCostoAlquiler(int Horas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
       
}

