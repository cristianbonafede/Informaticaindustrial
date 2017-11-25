/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author TheUser
 */
public class OrdenCompra {
    
    private int codigoOrdenCompra;
    private MateriaPrima materiaPrima;
    private java.util.Date fechaOrdenCompra;

    private String estadoOrdenCompra;
    private int cantidadComprar;

    public OrdenCompra(int codigoOrdenCompra, MateriaPrima materiaPrima, int cantidadComprar) {
        this.codigoOrdenCompra = codigoOrdenCompra;
        this.materiaPrima = materiaPrima;
        this.estadoOrdenCompra = "Creada";
        this.cantidadComprar = cantidadComprar;
        this.fechaOrdenCompra = Calendar.getInstance().getTime();
    }

    
    public OrdenCompra()
    {
        
    }
    public void setFechaOrdenCompra(Date fechaOrdenCompra) {
        this.fechaOrdenCompra = fechaOrdenCompra;
    }
    
    public int getCantidadComprar() {
        return cantidadComprar;
    }

    public void setCantidadComprar(int cantidadComprar) {
        this.cantidadComprar = cantidadComprar;
    }

    public int getCodigoOrdenCompra() {
        return codigoOrdenCompra;
    }

    public void setCodigoOrdenCompra(int codigoOrdenCompra) {
        this.codigoOrdenCompra = codigoOrdenCompra;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public Date getFechaOrdenCompra() {
        return fechaOrdenCompra;
    }



    public String getEstadoOrdenCompra() {
        return estadoOrdenCompra;
    }

    public void setEstadoOrdenCompra(String estadoOrdenCompra) {
        this.estadoOrdenCompra = estadoOrdenCompra;
    }
   

    
    
}
