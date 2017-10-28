package main;
import entidades.CentroTrabajo;
import entidades.Maquinaria;
import entidades.MateriaPrima;
import entidades.ProductoMateriaPrima;
import entidades.ProductoTerminado;
import entidades.RutaFabricacion;
import java.util.List;

public class Controlador{

    private Experto experto = new Experto();

    public List<MateriaPrima> iniciar() {      
  
        return  experto.iniciar(); 
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
