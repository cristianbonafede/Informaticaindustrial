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
public class ProductoMateriaPrima {
    private int codigoProductoMateriaPrima;
    private MateriaPrima codigoMateriaPrima;
    private ProductoTerminado codigoProductoTerminado;
    private int cantidadMateriaPrima;

    public ProductoMateriaPrima(int codigoProductoMateriaPrima, MateriaPrima codigoMateriaPrima, ProductoTerminado codigoProductoTerminado, int cantidadMateriaPrima) {
        this.codigoProductoMateriaPrima = codigoProductoMateriaPrima;
        this.codigoMateriaPrima = codigoMateriaPrima;
        this.codigoProductoTerminado = codigoProductoTerminado;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }
    public ProductoMateriaPrima(){
        
    }
    public int getCodigoProductoMateriaPrima() {
        return codigoProductoMateriaPrima;
    }

    public void setCodigoProductoMateriaPrima(int codigoProductoMateriaPrima) {
        this.codigoProductoMateriaPrima = codigoProductoMateriaPrima;
    }

    public MateriaPrima getCodigoMateriaPrima() {
        return codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(MateriaPrima codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public ProductoTerminado getCodigoProductoTerminado() {
        return codigoProductoTerminado;
    }

    public void setCodigoProductoTerminado(ProductoTerminado codigoProductoTerminado) {
        this.codigoProductoTerminado = codigoProductoTerminado;
    }

    public int getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }

    public void setCantidadMateriaPrima(int cantidadMateriaPrima) {
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }
        
        
}
