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
public class ProductoTerminado {
   private int	codigoProductoTerminado;
   private String nombreProductoTerminado;
   private String descripcionProducto;
   private int cantidadDisponible;
   private int precioPorUnidad;

    public ProductoTerminado(int codigoProductoTerminado, String nombreProductoTerminado, String descripcionProducto, int cantidadDisponible, int precioPorUnidad) {
        this.codigoProductoTerminado = codigoProductoTerminado;
        this.nombreProductoTerminado = nombreProductoTerminado;
        this.descripcionProducto = descripcionProducto;
        this.cantidadDisponible = cantidadDisponible;
        this.precioPorUnidad = precioPorUnidad;
    }
    
    public ProductoTerminado(){
        
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



    public int getCodigoProductoTerminado() {
        return codigoProductoTerminado;
    }

    public void setCodigoProductoTerminado(int codigoProductoTerminado) {
        this.codigoProductoTerminado = codigoProductoTerminado;
    }

    public String getNombreProductoTerminado() {
        return nombreProductoTerminado;
    }

    public void setNombreProductoTerminado(String nombreProductoTerminado) {
        this.nombreProductoTerminado = nombreProductoTerminado;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }


}