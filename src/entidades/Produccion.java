/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author TheUser
 */
public class Produccion {

    private int codigoOrdenProduccion;
    private ProductoTerminado productoTerminado;
    private int cantidadProducir;
    private Date fechaOrdenProduccion;
    private String estadoOrdenProduccion;

    public Produccion() {
    }

    public Produccion(int codigoOrdenProduccion, ProductoTerminado productoTerminado, int cantidadProducir, Date fechaOrdenProduccion, String estadoOrdenProduccion) {
        this.codigoOrdenProduccion = codigoOrdenProduccion;
        this.productoTerminado = productoTerminado;
        this.cantidadProducir = cantidadProducir;
        this.fechaOrdenProduccion = fechaOrdenProduccion;
        this.estadoOrdenProduccion = estadoOrdenProduccion;
    }

    public int getCodigoOrdenProduccion() {
        return codigoOrdenProduccion;
    }

    public void setCodigoOrdenProduccion(int codigoOrdenProduccion) {
        this.codigoOrdenProduccion = codigoOrdenProduccion;
    }

    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
    }

    public int getCantidadProducir() {
        return cantidadProducir;
    }

    public void setCantidadProducir(int cantidadProducir) {
        this.cantidadProducir = cantidadProducir;
    }

    public Date getFechaOrdenProduccion() {
        return fechaOrdenProduccion;
    }

    public void setFechaOrdenProduccion(Date fechaOrdenProduccion) {
        this.fechaOrdenProduccion = fechaOrdenProduccion;
    }

    public String getEstadoOrdenProduccion() {
        return estadoOrdenProduccion;
    }

    public void setEstadoOrdenProduccion(String estadoOrdenProduccion) {
        this.estadoOrdenProduccion = estadoOrdenProduccion;
    }

  
}
