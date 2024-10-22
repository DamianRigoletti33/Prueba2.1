/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculos implements CostoAlquiler {

    public String codigoUnico;
    public boolean mantenimiento;

    public Vehiculos() {
    }

    public Vehiculos(String codigoUnico, boolean mantenimiento) {
        this.codigoUnico = codigoUnico;
        this.mantenimiento = mantenimiento;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public abstract String toString();
       

    
    //metodos
    
    public String getCodigo() {
        return codigoUnico;
        

    }
    
    
    //metodos
    public boolean mantenimiento(){
        return mantenimiento;
        
    }


    
}
