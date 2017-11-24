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
public class CostoFijo {
    
       private int codigoCostoFijo;
   private String nombreCostoFijo;
   private int pesos;
   private String descripcionCostoFijo; 

    public CostoFijo(int codigoCostoFijo, String nombreCostoFijo, int pesos, String descripcionCostoFijo) {
        this.codigoCostoFijo = codigoCostoFijo;
        this.nombreCostoFijo = nombreCostoFijo;
        this.pesos = pesos;
        this.descripcionCostoFijo = descripcionCostoFijo;
    }
    public CostoFijo(){
        
    }

    public int getCodigoCostoFijo() {
        return codigoCostoFijo;
    }

    public void setCodigoCostoFijo(int codigoCostoFijo) {
        this.codigoCostoFijo = codigoCostoFijo;
    }

    public String getNombreCostoFijo() {
        return nombreCostoFijo;
    }

    public void setNombreCostoFijo(String nombreCostoFijo) {
        this.nombreCostoFijo = nombreCostoFijo;
    }

    public int getPesos() {
        return pesos;
    }

    public void setPesos(int pesos) {
        this.pesos = pesos;
    }

    public String getDescripcionCostoFijo() {
        return descripcionCostoFijo;
    }

    public void setDescripcionCostoFijo(String descripcionCostoFijo) {
        this.descripcionCostoFijo = descripcionCostoFijo;
    }
    
   
   
}
