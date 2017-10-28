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
public class RutaFabricacion {
 
        private int codigoRutaFabricacion;
	private CentroTrabajo codigoCentroTrabajo;
	private ProductoTerminado codigoProductoTerminado;
	private int numeroOrden;
	private int tiempoMaquinaria;
	private int tiempoManoObra;
	private int tiempoRestante;

    public RutaFabricacion(int codigoRutaFabricacion, CentroTrabajo codigoCentroTrabajo, ProductoTerminado codigoProductoTerminado, int numeroOrden, int tiempoMaquinaria, int tiempoManoObra, int tiempoRestante) {
        this.codigoRutaFabricacion = codigoRutaFabricacion;
        this.codigoCentroTrabajo = codigoCentroTrabajo;
        this.codigoProductoTerminado = codigoProductoTerminado;
        this.numeroOrden = numeroOrden;
        this.tiempoMaquinaria = tiempoMaquinaria;
        this.tiempoManoObra = tiempoManoObra;
        this.tiempoRestante = tiempoRestante;
    }

        public RutaFabricacion(){
            
        }
    public int getCodigoRutaFabricacion() {
        return codigoRutaFabricacion;
    }

    public void setCodigoRutaFabricacion(int codigoRutaFabricacion) {
        this.codigoRutaFabricacion = codigoRutaFabricacion;
    }

    public CentroTrabajo getCodigoCentroTrabajo() {
        return codigoCentroTrabajo;
    }

    public void setCodigoCentroTrabajo(CentroTrabajo codigoCentroTrabajo) {
        this.codigoCentroTrabajo = codigoCentroTrabajo;
    }

    public ProductoTerminado getCodigoProductoTerminado() {
        return codigoProductoTerminado;
    }

    public void setCodigoProductoTerminado(ProductoTerminado codigoProductoTerminado) {
        this.codigoProductoTerminado = codigoProductoTerminado;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public int getTiempoMaquinaria() {
        return tiempoMaquinaria;
    }

    public void setTiempoMaquinaria(int tiempoMaquinaria) {
        this.tiempoMaquinaria = tiempoMaquinaria;
    }

    public int getTiempoManoObra() {
        return tiempoManoObra;
    }

    public void setTiempoManoObra(int tiempoManoObra) {
        this.tiempoManoObra = tiempoManoObra;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }
        
        
}
