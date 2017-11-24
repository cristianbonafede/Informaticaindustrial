/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Cristian Bonafede
 */
public class Maquinaria {
       private int codigoMaquinaria;
        private CentroTrabajo codigoCentroTrabajo;
	private String descripcionMaquinaria;
        private String nombreMaquinaria;
	private String datosMantenimiento;

    public Maquinaria(int codigoMaquinaria, CentroTrabajo codigoCentroTrabajo, String descripcionMaquinaria, String nombreMaquinaria, String datosMantenimiento) {
        this.codigoMaquinaria = codigoMaquinaria;
        this.codigoCentroTrabajo = codigoCentroTrabajo;
        this.descripcionMaquinaria = descripcionMaquinaria;
        this.nombreMaquinaria = nombreMaquinaria;
        this.datosMantenimiento = datosMantenimiento;
    }
     public Maquinaria(){
         
     }

    public String getNombreMaquinaria() {
        return nombreMaquinaria;
    }

    public void setNombreMaquinaria(String nombreMaqinaria) {
        this.nombreMaquinaria = nombreMaqinaria;
    }



    public int getCodigoMaquinaria() {
        return codigoMaquinaria;
    }

    public void setCodigoMaquinaria(int codigoMaquinaria) {
        this.codigoMaquinaria = codigoMaquinaria;
    }

    public CentroTrabajo getCodigoCentroTrabajo() {
        return codigoCentroTrabajo;
    }

    public void setCodigoCentroTrabajo(CentroTrabajo codigoCentroTrabajo) {
        this.codigoCentroTrabajo = codigoCentroTrabajo;
    }

    public String getDescripcionMaquinaria() {
        return descripcionMaquinaria;
    }

    public void setDescripcionMaquinaria(String descripcionMaquinaria) {
        this.descripcionMaquinaria = descripcionMaquinaria;
    }

    public String getDatosMantenimiento() {
        return datosMantenimiento;
    }

    public void setDatosMantenimiento(String datosMantenimiento) {
        this.datosMantenimiento = datosMantenimiento;
    }
       
        
        
}
