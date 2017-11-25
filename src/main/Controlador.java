package main;
import entidades.CentroTrabajo;
import entidades.CostoFijo;
import entidades.Maquinaria;
import entidades.MateriaPrima;
import entidades.OrdenCompra;
import entidades.ProductoMateriaPrima;
import entidades.ProductoTerminado;
import entidades.RutaFabricacion;
import java.util.List;

public class Controlador{

    private Experto experto = new Experto();

    public List<MateriaPrima> iniciar() {      
  
        return  experto.iniciar(); 
    }
    public List<CostoFijo> iniciarCostoFijo() {      
  
        return  experto.iniciarCostoFijo(); 
    }
    public List<OrdenCompra> iniciarOrdenCompra() {      
  
        return  experto.iniciarOrdenCompra(); 
    }
    public List<Maquinaria> iniciarMaquinaria() {      
  
        return  experto.iniciarMaquinaria(); 
    }
    public List<ProductoTerminado> iniciarProductoTerminado() {      
  
        return  experto.iniciarProductoTerminado();
    }
     public List<CentroTrabajo> iniciarCentroTrabajo() {
     return  experto.iniciarCentroTrabajo();
    }
    
       public void altaMateriaPrima(MateriaPrima materiaPrima){ 
               experto.altaMateriaPrima(materiaPrima);
    }
       public void altaOrdenCompra(OrdenCompra ordenCompra){ 
               experto.altaOrdenCompra(ordenCompra);
    }
       public void altaCostoFijo(CostoFijo costoFijo){ 
               experto.altaCostoFijo(costoFijo);
    }
       public void altaMaquinaria(Maquinaria maquinaria){ 
               experto.altaMaquinaria(maquinaria);
    }
    
       public void altaCentroTrabajo(CentroTrabajo centroTrabajo){ 
               experto.altaCentroTrabajo(centroTrabajo);
    }
       public void altaProductoTerminado(ProductoTerminado productoTerminado){ 

         experto.altaProductoTerminado(productoTerminado);
    }
       
   public List<ProductoMateriaPrima> iniciarEstructuraProducto( ProductoTerminado codigo) {

        return experto.iniciarEstructuraProducto(codigo);
    }
   public List<RutaFabricacion> iniciarRutaFabricacion( ProductoTerminado codigo) {

        return experto.iniciarRutaFabricacion(codigo);
    }
       public List<ProductoMateriaPrima> iniciarEstructuraProductoCompleta( ) {

        return experto.iniciarEstructuraProductoCompleta();
    }
   
    public void modificarSeleccionEstructura(List<ProductoMateriaPrima> listProductoMateriaPrima){

        experto.modificarSeleccionEstructura(listProductoMateriaPrima);
    }
    public void modificarSeleccionRF (List<RutaFabricacion> listRutaFabricacion){

        experto.modificarSeleccionRF(listRutaFabricacion);
    }
   
      public MateriaPrima modificarMateriaPrima(int codigo){    
        return experto.modificarMateriaPrima(codigo);
    }
      public OrdenCompra buscarOrdenCompra(int codigo){    
        return experto.buscarOrdenCompra(codigo);
    }
      public  List<OrdenCompra> buscarOrdenCompraPorMateria(int codigo){    
        return experto.buscarOrdenCompraPorMateria(codigo);
    }
      public CostoFijo modificarCostoFijo(int codigo){    
        return experto.modificarCostoFijo(codigo);
    }
      public Maquinaria modificarMaquinaria(int codigo){    
        return experto.modificarMaquinaria(codigo);
    }
      public CentroTrabajo modificarCentroTrabajo(int codigo){    
        return experto.modificarCentroTrabajo(codigo);
    }
      public ProductoTerminado modificarProductoTerminado(int codigo){    
        return experto.modificarProductoTerminado(codigo);
    }
      
          public void modificarSeleccionMP(MateriaPrima materiaPrima){
          experto.modificarSeleccionMP(materiaPrima);
     }
          public void modificarSeleccionOC(OrdenCompra ordenCompra){
          experto.modificarSeleccionOC(ordenCompra);
     }
          public void modificarSeleccionCF(CostoFijo costoFijo){
          experto.modificarSeleccionCF(costoFijo);
     }
          public void modificarSeleccionMaq(Maquinaria maquinaria){
          experto.modificarSeleccionMaq(maquinaria);
     }
      public void modificarSeleccionCT(CentroTrabajo centroTrabajoM){
          experto.modificarSeleccionCT(centroTrabajoM);
     }
          public void modificarSeleccionPT(ProductoTerminado productoTerminado){
          experto.modificarSeleccionPT(productoTerminado);
     }
    
        public void bajaMP(int cod){
        experto.bajaMP(cod);
    }
        public void bajaCF(int cod){
        experto.bajaCF(cod);
    }
        public void bajaMaq(int cod){
        experto.bajaMaq(cod);
    }
        public void bajaCT(int cod){
        experto.bajaCT(cod);
    }
        
        public void bajaPT(int cod){
        experto.bajaPT(cod);
    }
        
           public void estructuraNueva (List<ProductoMateriaPrima> listProductoMateriaPrima){
     experto.estructuraNueva(listProductoMateriaPrima);
      }
           public void altaRutaFabricacion (List<RutaFabricacion> listRutaFabricacion){
     experto.altaRutaFabricacion(listRutaFabricacion);
      }
}
