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
public class CentroTrabajo {
        private int codigoCentroTrabajo;
        private String ubicacion;
        private String nombreCentroTrabajo;
	private int costoHoraHombrePesos;
	private int costoHoraMaquinaPesos;
	private String descripcionCentroTrabajo;

    public CentroTrabajo(int codigoCentroTrabajo, String ubicacion, String nombreCentroTrabajo, int costoHoraHombrePesos, int costoHoraMaquinaPesos, String descripcionCentroTrabajo) {
        this.codigoCentroTrabajo = codigoCentroTrabajo;
        this.ubicacion = ubicacion;
        this.nombreCentroTrabajo = nombreCentroTrabajo;
        this.costoHoraHombrePesos = costoHoraHombrePesos;
        this.costoHoraMaquinaPesos = costoHoraMaquinaPesos;
        this.descripcionCentroTrabajo = descripcionCentroTrabajo;
    }



public CentroTrabajo(){
    
}

    public String getNombreCentroTrabajo() {
        return nombreCentroTrabajo;
    }

    public void setNombreCentroTrabajo(String nombreCentroTrabajo) {
        this.nombreCentroTrabajo = nombreCentroTrabajo;
    }


    public int getCodigoCentroTrabajo() {
        return codigoCentroTrabajo;
    }

    public void setCodigoCentroTrabajo(int codigoCentroTrabajo) {
        this.codigoCentroTrabajo = codigoCentroTrabajo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCostoHoraHombrePesos() {
        return costoHoraHombrePesos;
    }

    public void setCostoHoraHombrePesos(int costoHoraHombrePesos) {
        this.costoHoraHombrePesos = costoHoraHombrePesos;
    }

    public int getCostoHoraMaquinaPesos() {
        return costoHoraMaquinaPesos;
    }

    public void setCostoHoraMaquinaPesos(int costoHoraMaquinaPesos) {
        this.costoHoraMaquinaPesos = costoHoraMaquinaPesos;
    }

    public String getDescripcionCentroTrabajo() {
        return descripcionCentroTrabajo;
    }

    public void setDescripcionCentroTrabajo(String descripcionCentroTrabajo) {
        this.descripcionCentroTrabajo = descripcionCentroTrabajo;
    }
        
        
}
