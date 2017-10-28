package main;


import entidades.*;
import java.sql.Timestamp;

import java.util.*;

public class Experto {
    private MateriaPrima materiaPrima;
    private ProductoTerminado productoTerminado;
    private ProductoMateriaPrima productoMateriaPrima;
    private CentroTrabajo centroTrabajo;
    private Maquinaria maquinaria;
    private RutaFabricacion rutaFabricacion;
    
    public List<MateriaPrima> iniciar() {

     List<MateriaPrima> listaMateriaPrima = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("");
     c0.setOperacion("");
     c0.setValor("");
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
            // Todos los tipos impuestos

     List<Object> listaMateriaPrimae = FachadaPersistencia.getInstance().buscar("MateriaPrima", l0);

        for (Object result : listaMateriaPrimae) {
             materiaPrima = (MateriaPrima) result;
             System.out.println(materiaPrima.getNombreMateriaPrima());
             listaMateriaPrima.add(materiaPrima);}
             
             
             
        return listaMateriaPrima;
    }
    
    
    public List<ProductoTerminado> iniciarProductoTerminado() {

     List<ProductoTerminado> listaProductoTerminado = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("");
     c0.setOperacion("");
     c0.setValor("");
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
            // Todos los tipos impuestos

     List<Object> listProductoTerminado = FachadaPersistencia.getInstance().buscar("ProductoTerminado", l0);

        for (Object result : listProductoTerminado) {
             productoTerminado = (ProductoTerminado) result;
             listaProductoTerminado.add(productoTerminado);}

             
        return listaProductoTerminado;
    }
    
    public List<RutaFabricacion> iniciarRutaFabricacionCompleta() {

     List<RutaFabricacion> listaRutaFabricacion = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("");
     c0.setOperacion("");
     c0.setValor("");
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
            // Todos los tipos impuestos

     List<Object> listRutaFabricacion = FachadaPersistencia.getInstance().buscar("RutaFabricacion", l0);

        for (Object result : listRutaFabricacion) {
             rutaFabricacion = (RutaFabricacion) result;
             listaRutaFabricacion.add(rutaFabricacion);}

             
        return listaRutaFabricacion;
    }
    public List<RutaFabricacion> iniciarRutaFabricacion(ProductoTerminado codigo) {

     List<RutaFabricacion> listaRutaFabricacion = new ArrayList<>();
     
     productoTerminado= codigo;
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("codigoProductoTerminado");
     c0.setOperacion("=");
     c0.setValor(codigo);
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
            // Todos los tipos impuestos

     List<Object> listRutaFabricacion = FachadaPersistencia.getInstance().buscar("RutaFabricacion", l0);

        for (Object result : listRutaFabricacion) {
             rutaFabricacion = (RutaFabricacion) result;
             listaRutaFabricacion.add(rutaFabricacion);}

             
        return listaRutaFabricacion;
    }
    
    
    
    
    public List<Maquinaria> iniciarMaquinaria() {

     List<Maquinaria> listaMaquinaria = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("");
     c0.setOperacion("");
     c0.setValor("");
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
            // Todos los tipos impuestos

     List<Object> listMaquinaria = FachadaPersistencia.getInstance().buscar("Maquinaria", l0);

        for (Object result : listMaquinaria) {
             maquinaria = (Maquinaria) result;
             listaMaquinaria.add(maquinaria);}

             
        return listaMaquinaria;
    }
    public List<Maquinaria> buscarMaquinariaPorcentro(CentroTrabajo codigo) {

     List<Maquinaria> listaMaquinaria1 = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("codigoCentroTrabajo");
     c0.setOperacion("=");
     c0.setValor(codigo);
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
            // Todos los tipos impuestos

     List<Object> listMaquinaria1 = FachadaPersistencia.getInstance().buscar("Maquinaria", l0);

        for (Object result : listMaquinaria1) {
             maquinaria = (Maquinaria) result;
             listaMaquinaria1.add(maquinaria);}

             
        return listaMaquinaria1;
    }
    
    public List<CentroTrabajo> iniciarCentroTrabajo() {

     List<CentroTrabajo> listaCentroTrabajo = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("");
     c0.setOperacion("");
     c0.setValor("");
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
   

     List<Object> listCentroTrabajo = FachadaPersistencia.getInstance().buscar("CentroTrabajo", l0);

        for (Object result : listCentroTrabajo) {
             centroTrabajo = (CentroTrabajo) result;
             listaCentroTrabajo.add(centroTrabajo);}

             
        return listaCentroTrabajo;
    }
    
    public List<ProductoMateriaPrima> iniciarEstructuraProducto( ProductoTerminado codigo) {

     List<ProductoMateriaPrima> listaEstructura = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("codigoProductoTerminado");
     c0.setOperacion("=");
     c0.setValor(codigo);
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
     List<Object> listEstructura = FachadaPersistencia.getInstance().buscar("ProductoMateriaPrima", l0);

        for (Object result : listEstructura) {
             productoMateriaPrima = (ProductoMateriaPrima) result;
             listaEstructura.add(productoMateriaPrima);}

             
        return listaEstructura;
    }
    public List<ProductoMateriaPrima> iniciarEstructuraProductoCompleta( ) {

     List<ProductoMateriaPrima> listaEstructura = new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("");
     c0.setOperacion("");
     c0.setValor("");
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  

     List<Object> listEstructura = FachadaPersistencia.getInstance().buscar("ProductoMateriaPrima", l0);

        for (Object result : listEstructura) {
             productoMateriaPrima = (ProductoMateriaPrima) result;
             listaEstructura.add(productoMateriaPrima);}

             
        return listaEstructura;
    }
    
public void altaMateriaPrima(MateriaPrima materiaPrimaNueva ){
       
    int codigo = materiaPrimaNueva.getCodigoMateriaPrima(); //obtengo el codigo
   
      DTOCriterio c1 = new DTOCriterio();
      c1.setAtributo("codigoMateriaPrima");
      c1.setOperacion("=");
      c1.setValor(codigo);
      List<DTOCriterio> l1 = new ArrayList<>();   
      l1.clear();
      l1.add(c1); 

      try {    
   MateriaPrima materia = (MateriaPrima) FachadaPersistencia.getInstance().buscar("MateriaPrima", l1).get(0);
    if (materia != null)
          System.out.println("LA MATERIA PRIMA INGRESADA YA EXISTE");
          System.exit(0);
         }
 
      catch(IndexOutOfBoundsException e){}// Si no encuentra registro cae en catch y lo crea
  
   
        FachadaPersistencia.getInstance().guardar(materiaPrimaNueva);


           
}

public void altaMaquinaria (Maquinaria maquinariaNueva ){
        
    int codigo = maquinariaNueva.getCodigoMaquinaria(); //obtengo el codigo
   
      DTOCriterio c1 = new DTOCriterio();
      c1.setAtributo("codigoMaquinaria");
      c1.setOperacion("=");
      c1.setValor(codigo);
      List<DTOCriterio> l1 = new ArrayList<>();   
      l1.clear();
      l1.add(c1); 

      try {    
   Maquinaria maquinaria = (Maquinaria) FachadaPersistencia.getInstance().buscar("Maquinaria", l1).get(0);
    if (maquinaria != null)
          System.out.println("LA Maquinaria PRIMA INGRESADA YA EXISTE");
          System.exit(0);
         }
 
      catch(IndexOutOfBoundsException e){}// Si no encuentra registro cae en catch y lo crea
  
   
        FachadaPersistencia.getInstance().guardar(maquinariaNueva);


           
}
public void altaCentroTrabajo(CentroTrabajo centroTrabajoNueva ){
        
    int codigo = centroTrabajoNueva.getCodigoCentroTrabajo(); //obtengo el codigo
   
      DTOCriterio c1 = new DTOCriterio();
      c1.setAtributo("codigoCentroTrabajo");
      c1.setOperacion("=");
      c1.setValor(codigo);
      List<DTOCriterio> l1 = new ArrayList<>();   
      l1.clear();
      l1.add(c1); 

      try {    
   CentroTrabajo centro = (CentroTrabajo) FachadaPersistencia.getInstance().buscar("CentroTrabajo", l1).get(0);
    if (centro != null)
          System.out.println("EL Centro INGRESADO YA EXISTE");
          System.exit(0);
         }
 
      catch(IndexOutOfBoundsException e){}// Si no encuentra registro cae en catch y lo crea
  
   
        FachadaPersistencia.getInstance().guardar(centroTrabajoNueva);


           
}
public void altaProductoTerminado(ProductoTerminado productoTerminadoNueva ){
        
    int codigo = productoTerminadoNueva.getCodigoProductoTerminado(); //obtengo el codigo
   
      DTOCriterio c1 = new DTOCriterio();
      
      c1.setAtributo("codigoProductoTerminado");
      c1.setOperacion("=");
      c1.setValor(codigo);
      List<DTOCriterio> l1 = new ArrayList<>();   
      l1.clear();
      l1.add(c1); 

      try {    
   ProductoTerminado producto = (ProductoTerminado) FachadaPersistencia.getInstance().buscar("ProductoTerminado", l1).get(0);
    if (producto != null)
          System.out.println("LA MATERIA PRIMA INGRESADA YA EXISTE");
          System.exit(0);
         }
 
      catch(IndexOutOfBoundsException e){}// Si no encuentra registro cae en catch y lo crea
  
   
        FachadaPersistencia.getInstance().guardar(productoTerminadoNueva);


           
}
public MateriaPrima modificarMateriaPrima(int codigo){
      
      DTOCriterio c4 = new DTOCriterio();
      c4.setAtributo("codigoMateriaPrima");
      c4.setOperacion("=");
      c4.setValor(codigo);
      List<DTOCriterio> l4 = new ArrayList<>();  
      l4.clear();
      l4.add(c4); // Creo criterio para buscar si ya existe el TipoImpuesto
      
 
  MateriaPrima materiaprima = (MateriaPrima) FachadaPersistencia.getInstance().buscar("MateriaPrima", l4).get(0);
  materiaPrima=materiaprima;
                     
      return  materiaPrima;
     
    }
public RutaFabricacion modificarRutaFabricacion(int codigo){
      
      DTOCriterio c4 = new DTOCriterio();
      c4.setAtributo("codigoRutaFabricacion");
      c4.setOperacion("=");
      c4.setValor(codigo);
      List<DTOCriterio> l4 = new ArrayList<>();  
      l4.clear();
      l4.add(c4); // Creo criterio para buscar si ya existe el TipoImpuesto
      
 
  RutaFabricacion rutaFabricacione = (RutaFabricacion) FachadaPersistencia.getInstance().buscar("RutaFabricacion", l4).get(0);
  rutaFabricacion = rutaFabricacione;
                     
      return  rutaFabricacion;
     
    }
public Maquinaria modificarMaquinaria(int codigo){
         
    
      DTOCriterio c4 = new DTOCriterio();
      c4.setAtributo("codigoMaquinaria");
      c4.setOperacion("=");
      c4.setValor(codigo);
      List<DTOCriterio> l4 = new ArrayList<>();  
      l4.clear();
      l4.add(c4); // Creo criterio para buscar si ya existe el TipoImpuesto
      
 
  Maquinaria maquinaria1 = (Maquinaria) FachadaPersistencia.getInstance().buscar("Maquinaria", l4).get(0);
  maquinaria=maquinaria1;
                     
      return  maquinaria;
     
    }
public CentroTrabajo modificarCentroTrabajo(int codigo){
         
    
      DTOCriterio c4 = new DTOCriterio();
      c4.setAtributo("codigoCentroTrabajo");
      c4.setOperacion("=");
      c4.setValor(codigo);
      List<DTOCriterio> l4 = new ArrayList<>();  
      l4.clear();
      l4.add(c4); // Creo criterio para buscar si ya existe el TipoImpuesto
      
 
  CentroTrabajo centrotrabajo = (CentroTrabajo) FachadaPersistencia.getInstance().buscar("CentroTrabajo", l4).get(0);
  centroTrabajo=centrotrabajo;
                     
      return  centroTrabajo;
     
    }
public ProductoTerminado modificarProductoTerminado(int codigo){
         
    
      DTOCriterio c4 = new DTOCriterio();
      c4.setAtributo("codigoProductoTerminado");
      c4.setOperacion("=");
      c4.setValor(codigo);
      List<DTOCriterio> l4 = new ArrayList<>();  
      l4.clear();
      l4.add(c4); // Creo criterio para buscar si ya existe el TipoImpuesto
      
 
  ProductoTerminado productoterminado = (ProductoTerminado) FachadaPersistencia.getInstance().buscar("ProductoTerminado", l4).get(0);
  productoTerminado = productoterminado;
                     
      return  productoterminado;
     
    }
      
 public void modificarSeleccionMP(MateriaPrima materiaPrimaM){
         
        String nombreMateriaPrima = materiaPrimaM.getNombreMateriaPrima();
        materiaPrima.setNombreMateriaPrima(nombreMateriaPrima);
        String unidad = materiaPrimaM.getUnidadMedida();
        materiaPrima.setUnidadMedida(unidad);
        String descripcion = materiaPrimaM.getDescripcionMateriaPrima();
        materiaPrima.setDescripcionMateriaPrima(descripcion);
        int cantidad = materiaPrimaM.getCantidadDisponible();
        materiaPrima.setCantidadDisponible(cantidad);
        int precio = materiaPrimaM.getPrecioPorUnidad();
        materiaPrima.setPrecioPorUnidad(precio);
                      
          
         FachadaPersistencia.getInstance().guardar(materiaPrima);
         
     }
       public void modificarSeleccionRF(List<RutaFabricacion> listaRutaFabricacion){
          List<RutaFabricacion> listRutaFabricacion =  iniciarRutaFabricacion(productoTerminado);
          for (int i = 0; i < listaRutaFabricacion.size(); i++) {
             int codigo= listaRutaFabricacion.get(i).getCodigoRutaFabricacion();
              bajaRF(codigo);
              
          }
          
          altaRutaFabricacion(listRutaFabricacion);
          
       
          
         FachadaPersistencia.getInstance().guardar(rutaFabricacion);
         
     }
 public void modificarSeleccionMaq(Maquinaria maquinariaM){
         
        String nombreMaquinaria = maquinariaM.getNombreMaquinaria();
        maquinaria.setNombreMaquinaria(nombreMaquinaria);
        CentroTrabajo centro = maquinariaM.getCodigoCentroTrabajo();
        maquinaria.setCodigoCentroTrabajo(centroTrabajo);
        String descripcion = maquinariaM.getDescripcionMaquinaria();
        maquinaria.setDescripcionMaquinaria(descripcion);
        String datos = maquinariaM.getDatosMantenimiento();
        maquinaria.setDatosMantenimiento(datos);
       
         FachadaPersistencia.getInstance().guardar(maquinaria);
         
     }
 public void modificarSeleccionCT(CentroTrabajo centroTrabajoM){
         
        String nombreCentroTrabajo = centroTrabajoM.getNombreCentroTrabajo();
        centroTrabajo.setNombreCentroTrabajo(nombreCentroTrabajo);
        String ubicacion = centroTrabajoM.getUbicacion();
        centroTrabajo.setUbicacion(ubicacion);
        String descripcion = centroTrabajoM.getDescripcionCentroTrabajo();
       centroTrabajo.setDescripcionCentroTrabajo(descripcion);
        int costoHH = centroTrabajoM.getCostoHoraHombrePesos();
        centroTrabajo.setCostoHoraHombrePesos(costoHH);
        int costoHM = centroTrabajoM.getCostoHoraMaquinaPesos();
        centroTrabajo.setCostoHoraMaquinaPesos(costoHM);
                      
          
         FachadaPersistencia.getInstance().guardar(centroTrabajo);
         
     }
 public void modificarSeleccionPT(ProductoTerminado productoTerminadoN){
         
        String nombre = productoTerminadoN.getNombreProductoTerminado();
        productoTerminado.setNombreProductoTerminado(nombre);
        String descripcion = productoTerminadoN.getDescripcionProducto();
        productoTerminado.setDescripcionProducto(descripcion);
        int cantidad = productoTerminadoN.getCantidadDisponible();
        productoTerminado.setCantidadDisponible(cantidad);
        int precio = productoTerminadoN.getPrecioPorUnidad();
        productoTerminado.setPrecioPorUnidad(precio);
                      
                 FachadaPersistencia.getInstance().guardar(productoTerminado);
         
     }
 public void modificarSeleccionEstructura(List<ProductoMateriaPrima> listProductoMateriaPrima){
         
      List<ProductoMateriaPrima> listaEstructura =  iniciarEstructuraProducto(productoTerminado);
          for (int i = 0; i < listaEstructura.size(); i++) {
             int codigo= listaEstructura.get(i).getCodigoProductoMateriaPrima();
              bajaPMP(codigo);
              
          }
          
          estructuraNueva(listProductoMateriaPrima);
          
     
 }
 public List<ProductoMateriaPrima> buscarEstructuraPorMateriaPrima(MateriaPrima codigo){
         
     List<ProductoMateriaPrima> listaPMP= new ArrayList<>();
     
     
     DTOCriterio c0 = new DTOCriterio();// criterio 0
     c0.setAtributo("codigoMateriaPrima");
     c0.setOperacion("=");
     c0.setValor(codigo);
     List<DTOCriterio> l0 = new ArrayList<>(); //lista de criterios 0
     l0.clear();
     l0.add(c0);
  
     List<Object> listaPMP1 = FachadaPersistencia.getInstance().buscar("ProductoMateriaPrima", l0);

        for (Object result : listaPMP1) {
             productoMateriaPrima = (ProductoMateriaPrima) result;
             listaPMP.add(productoMateriaPrima);}

             
        return listaPMP;
    
          
     
 }
      public void bajaMP(int cod){
          
      List<DTOCriterio> criterioList = new ArrayList<>();  
      DTOCriterio criterio3 = new DTOCriterio();
      criterio3.setAtributo("codigoMateriaPrima");
      criterio3.setOperacion("=");
      criterio3.setValor(cod);
      criterioList.clear();
      criterioList.add(criterio3);
      
         
       MateriaPrima materiaPrima = (MateriaPrima) FachadaPersistencia.getInstance().buscar("MateriaPrima", criterioList).get(0);
  
      List<ProductoMateriaPrima> listPMP = buscarEstructuraPorMateriaPrima(materiaPrima);
          for (int i = 0; i < listPMP.size(); i++) {
              bajaPMP(listPMP.get(i).getCodigoProductoMateriaPrima());
              
          }
       
                FachadaPersistencia.getInstance().eliminar(materiaPrima);
      }
      public void bajaMaq(int cod){
          
      List<DTOCriterio> criterioList = new ArrayList<>();  
      DTOCriterio criterio3 = new DTOCriterio();
      criterio3.setAtributo("codigoMaquinaria");
      criterio3.setOperacion("=");
      criterio3.setValor(cod);
      criterioList.clear();
      criterioList.add(criterio3);
      
         
       Maquinaria maquinaria = (Maquinaria) FachadaPersistencia.getInstance().buscar("Maquinaria", criterioList).get(0);
  
                FachadaPersistencia.getInstance().eliminar(maquinaria);
      }
      public void bajaCT(int cod){
          
      List<DTOCriterio> criterioList = new ArrayList<>();  
      DTOCriterio criterio3 = new DTOCriterio();
      criterio3.setAtributo("codigoCentroTrabajo");
      criterio3.setOperacion("=");
      criterio3.setValor(cod);
      criterioList.clear();
      criterioList.add(criterio3);
      
         
       CentroTrabajo centroTrabajo = (CentroTrabajo) FachadaPersistencia.getInstance().buscar("CentroTrabajo", criterioList).get(0);
  
         try{
       
             List<Maquinaria> listMaq = buscarMaquinariaPorcentro(centroTrabajo);
       
          for (int i = 0; i < listMaq.size(); i++) {
              bajaMaq(listMaq.get(i).getCodigoMaquinaria());
          }}
          catch(IndexOutOfBoundsException e){
                  
                  }
                FachadaPersistencia.getInstance().eliminar(centroTrabajo);
      }
      public void bajaPT(int cod){
          
      List<DTOCriterio> criterioList = new ArrayList<>();  
      DTOCriterio criterio3 = new DTOCriterio();
      criterio3.setAtributo("codigoProductoTerminado");
      criterio3.setOperacion("=");
      criterio3.setValor(cod);
      criterioList.clear();
      criterioList.add(criterio3);
      
         
       ProductoTerminado productoTerminado = (ProductoTerminado) FachadaPersistencia.getInstance().buscar("ProductoTerminado", criterioList).get(0);
      List<ProductoMateriaPrima> listaEstructura =  iniciarEstructuraProducto(productoTerminado);
          for (int i = 0; i < listaEstructura.size(); i++) {
             int codigo= listaEstructura.get(i).getCodigoProductoMateriaPrima();
              bajaPMP(codigo);
              
          }
          try{
          List<RutaFabricacion> listaRuta = iniciarRutaFabricacion(productoTerminado);
          System.out.println(listaRuta.size());
          for (int i = 0; i < listaRuta.size(); i++) {
              bajaRF(listaRuta.get(i).getCodigoRutaFabricacion());
          }}
          catch(IndexOutOfBoundsException e){
                  
                  }
          
          
                FachadaPersistencia.getInstance().eliminar(productoTerminado);
      }
      public void bajaPMP(int cod){
          
      List<DTOCriterio> criterioList = new ArrayList<>();  
      DTOCriterio criterio3 = new DTOCriterio();
      criterio3.setAtributo("codigoProductoMateriaPrima");
      criterio3.setOperacion("=");
      criterio3.setValor(cod);
      criterioList.clear();
      criterioList.add(criterio3);
      
         
       ProductoMateriaPrima productoMateriaPrima = (ProductoMateriaPrima) FachadaPersistencia.getInstance().buscar("ProductoMateriaPrima", criterioList).get(0);

                FachadaPersistencia.getInstance().eliminar(productoMateriaPrima);
      }
     
      public void bajaRF(int cod){
          
      List<DTOCriterio> criterioList = new ArrayList<>();  
      DTOCriterio criterio3 = new DTOCriterio();
      criterio3.setAtributo("codigoRutaFabricacion");
      criterio3.setOperacion("=");
      criterio3.setValor(cod);
      criterioList.clear();
      criterioList.add(criterio3);
      
         
       RutaFabricacion rutaFabricacion = (RutaFabricacion) FachadaPersistencia.getInstance().buscar("RutaFabricacion", criterioList).get(0);

                FachadaPersistencia.getInstance().eliminar(rutaFabricacion);
      }
     
    public void estructuraNueva (List<ProductoMateriaPrima> listProductoMateriaPrima){
      
            
    for(int i=0 ;i< listProductoMateriaPrima.size();i++ ){
        
        int codigo = listProductoMateriaPrima.get(i).getCodigoProductoMateriaPrima(); //obtengo el codigo
   
      DTOCriterio c1 = new DTOCriterio();
      
      c1.setAtributo("codigoProductoMateriaPrima");
      c1.setOperacion("=");
      c1.setValor(codigo);
      List<DTOCriterio> l1 = new ArrayList<>();   
      l1.clear();
      l1.add(c1); 

      try {    
   ProductoMateriaPrima estructura = (ProductoMateriaPrima) FachadaPersistencia.getInstance().buscar("ProductoMateriaPrima", l1).get(0);
    if (estructura != null)
          System.out.println("ProductoMateriaPrima INGRESADA YA EXISTE");
          System.exit(0);
         }
 
      catch(IndexOutOfBoundsException e){}// Si no encuentra registro cae en catch y lo crea
  
   
        FachadaPersistencia.getInstance().guardar(listProductoMateriaPrima.get(i));


      }     
      
  }
    
    public void altaRutaFabricacion (List<RutaFabricacion> listRutaFabricacion){
      
            
    for(int i=0 ;i< listRutaFabricacion.size();i++ ){
        
        int codigo = listRutaFabricacion.get(i).getCodigoRutaFabricacion(); //obtengo el codigo
   
      DTOCriterio c1 = new DTOCriterio();
      
      c1.setAtributo("codigoRutaFabricacion");
      c1.setOperacion("=");
      c1.setValor(codigo);
      List<DTOCriterio> l1 = new ArrayList<>();   
      l1.clear();
      l1.add(c1); 

      try {    
   RutaFabricacion rutaFabricacion = (RutaFabricacion) FachadaPersistencia.getInstance().buscar("RutaFabricacion", l1).get(0);
    if (rutaFabricacion != null)
          System.out.println("RutaFabricacion INGRESADA YA EXISTE");
          System.exit(0);
         }
 
      catch(IndexOutOfBoundsException e){}// Si no encuentra registro cae en catch y lo crea
  
   
        FachadaPersistencia.getInstance().guardar(listRutaFabricacion.get(i));


      }     
      
  }
    
      
}
