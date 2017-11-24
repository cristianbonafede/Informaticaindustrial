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
public class MateriaPrima {
    
   private int codigoMateriaPrima;
   private String nombreMateriaPrima;
   private String unidadMedida;
   private String descripcionMateriaPrima; 
   private int cantidadDisponible;
   private int precioPorUnidad;

    public MateriaPrima(int codigoMateriaPrima, String nombreMateriaPrima, String unidadMedida, String descripcionMateriaPrima, int cantidadDisponible, int precioPorUnidad) {
        this.codigoMateriaPrima = codigoMateriaPrima;
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.unidadMedida = unidadMedida;
        this.descripcionMateriaPrima = descripcionMateriaPrima;
        this.cantidadDisponible = cantidadDisponible;
        this.precioPorUnidad = precioPorUnidad;
    }
   
   


    public MateriaPrima() {
       
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


    public int getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(int precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }



    public int getCodigoMateriaPrima() {
        return codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(int codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public String getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public void setNombreMateriaPrima(String nombreMateriaPrima) {
        this.nombreMateriaPrima = nombreMateriaPrima;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getDescripcionMateriaPrima() {
        return descripcionMateriaPrima;
    }

    public void setDescripcionMateriaPrima(String descripcionMateriaPrima) {
        this.descripcionMateriaPrima = descripcionMateriaPrima;
    }
    
    
}
