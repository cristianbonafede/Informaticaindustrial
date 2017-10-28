/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import entidades.CentroTrabajo;
import entidades.RutaFabricacion;
import entidades.ProductoTerminado;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Cristian
 */
public class ABMRutaFabricacion extends javax.swing.JFrame {

    
    Controlador controlador;
    private TableRowSorter trsFiltro;
    private ProductoTerminado productoTerminado;
    private int contador = 0;
    List<CentroTrabajo> listCentroTrabajo;
    List<RutaFabricacion> listRutaFabricacion;
    
    public ABMRutaFabricacion(Controlador controlador, List<CentroTrabajo> listCentroTrabajo, ProductoTerminado productoTerminado, List<RutaFabricacion> listRutaFabricacion ) {
        this.controlador = controlador;
        this.productoTerminado = productoTerminado;
        initComponents();
        cargarCentroTrabajo(listCentroTrabajo);
        cargarRutaFabricacion(listRutaFabricacion);
        this.listRutaFabricacion = listRutaFabricacion;
        this.listCentroTrabajo = listCentroTrabajo;
        if(listRutaFabricacion != null){
        for (int i = 0; i < listRutaFabricacion.size(); i++) {
          contador= contador+1;  
        }}
    textoProductoTerminado.setText(productoTerminado.getNombreProductoTerminado());
    
    
    
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
 
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
   
  
}


    private void close(){
        if (jOptionPane1.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", jOptionPane1.YES_NO_OPTION) == jOptionPane1.YES_OPTION)
            System.exit(0);
    }
        
    

    private ABMRutaFabricacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
public  void cargarCentroTrabajo(List<CentroTrabajo> listCentroTrabajo){
        
 DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listCentroTrabajo.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listCentroTrabajo.get(i).getCodigoCentroTrabajo(),
                    listCentroTrabajo.get(i).getNombreCentroTrabajo(),
                    listCentroTrabajo.get(i).getDescripcionCentroTrabajo(),
                    listCentroTrabajo.get(i).getUbicacion(),
                    listCentroTrabajo.get(i).getCostoHoraHombrePesos(),
                    listCentroTrabajo.get(i).getCostoHoraMaquinaPesos()
                    
                });
  }     
       
}

    public  void cargarRutaFabricacion(List<RutaFabricacion> listRutaFabricacion){
        
 DefaultTableModel dtm= (DefaultTableModel) tablaParametros.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listRutaFabricacion.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listRutaFabricacion.get(i).getCodigoCentroTrabajo().getCodigoCentroTrabajo(),
                    listRutaFabricacion.get(i).getCodigoCentroTrabajo().getNombreCentroTrabajo(),
                    listRutaFabricacion.get(i).getTiempoManoObra(),
                    listRutaFabricacion.get(i).getTiempoMaquinaria(),
                    listRutaFabricacion.get(i).getTiempoRestante(),
                    listRutaFabricacion.get(i).getNumeroOrden()
                                                          
                });
  }     
       
}
    
    public void filtroEstructura() {
        int columnaABuscar = 0;
        if (comboFiltroEstructura.getSelectedItem() == "Codigo") {
            
            columnaABuscar = 0;
        }
        if (comboFiltroEstructura.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 1;
        }
  
       trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltroEstructura.getText(), columnaABuscar));
} 
    public void filtroCT() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "Codigo") {
            
            columnaABuscar = 0;
        }
        if (comboFiltro.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 1;
        }
  
       trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltroMP.getText(), columnaABuscar));
} 
 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jOptionPane1 = new javax.swing.JOptionPane();
        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboFiltroEstructura = new javax.swing.JComboBox<>();
        txtFiltroEstructura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltroMP = new javax.swing.JTextField();
        jButtonInsertar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoProductoTerminado = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextCostoMaq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextCostoMO = new javax.swing.JTextField();
        jTextCostoOcio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaParametros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planete Pizza");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecionar los centros de trabajo correspondientes y compleatar el formulario");

        comboFiltroEstructura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));

        txtFiltroEstructura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroEstructuraActionPerformed(evt);
            }
        });
        txtFiltroEstructura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroEstructuraKeyTyped(evt);
            }
        });

        jLabel2.setText("Filtrar por:");

        jLabel3.setText("Ruta Faricacion pra Producto:");

        jLabel4.setText("Filtrar por:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        txtFiltroMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroMPActionPerformed(evt);
            }
        });
        txtFiltroMP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroMPKeyTyped(evt);
            }
        });

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        textoProductoTerminado.setEditable(false);
        jScrollPane3.setViewportView(textoProductoTerminado);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CódigoCentroTrabajo", "Nombre", "Descripcion", "Ubicacion", "CostoHoraHombre", "CostoHoraMaquina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setText("Cantidad Hrs MO");

        jLabel8.setText("Cantida Hrs Maq");

        jLabel9.setText("Cantidad Hrs Ocio");

        tablaParametros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CódigoCentroTrabajo", "Nombre C Trabajo", "Cantidad Hrs MO", "Cantidad Hrs Maq", "Canitdad Hrs Ocio", "Nro Orden"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaParametros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(tablaParametros);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFiltroMP, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInsertar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextCostoMO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCostoMaq, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextCostoOcio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Guardar)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonEliminar)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminar)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltroMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextCostoMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextCostoMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jTextCostoOcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(Guardar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     
        if (contador != 0 ){
      List<RutaFabricacion> listRuta= new ArrayList<>();
            System.out.println(contador);
      for(int i=0 ;i< contador; i++ ){
          
    CentroTrabajo centro = null; 
          if (tablaParametros.getValueAt(i,3 )!= null){
             
                int codigoCentroTrabajo = (int) tablaParametros.getValueAt(i,0);
                int nroOrden = (int) tablaParametros.getValueAt(i,5);
                int codigoProductoTerminado = productoTerminado.getCodigoProductoTerminado();
                int hrMaq = (int)tablaParametros.getValueAt(i,3);
                int hrMO = (int) tablaParametros.getValueAt(i,2);
                int hrOcio = (int) tablaParametros.getValueAt(i,4);

                  int codigoProductoRF = codigoProductoTerminado*codigoCentroTrabajo/(codigoCentroTrabajo+18);
        
      
                    for(int j=0 ;j< listCentroTrabajo.size(); j++ ){
                     
                     int cod = listCentroTrabajo.get(j).getCodigoCentroTrabajo();
                     
                     if(cod == codigoCentroTrabajo){
                          centro = listCentroTrabajo.get(j);
                     }
                 }
                
                

         RutaFabricacion productoCentroTrabajo = new RutaFabricacion(codigoProductoRF, centro, productoTerminado, nroOrden, hrMaq, hrMO,hrOcio );
         listRuta.add(productoCentroTrabajo);
          
          
          }
      }
      if(listRutaFabricacion.size()!=0){
          System.out.println(listRutaFabricacion.size());
                System.out.println("Despues del viejo");
                        controlador.modificarSeleccionRF(listRuta);
                    
               
      }
                else{
                System.out.println("Antes del nuevo");
                controlador.altaRutaFabricacion(listRuta); 
                System.out.println("Despues del Nuevo");
                        }
          
      
                  
        List<ProductoTerminado> listProductoTerminado = controlador.iniciarProductoTerminado();
    
       TablaProducto  Gui_NuevaAbm = new TablaProducto(controlador, listProductoTerminado);
        Gui_NuevaAbm.setVisible(true);
         dispose();
         
   
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void txtFiltroEstructuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroEstructuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroEstructuraActionPerformed

    private void txtFiltroEstructuraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroEstructuraKeyTyped

        txtFiltroEstructura.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltroEstructura.getText());
                txtFiltroEstructura.setText(cadena);
                repaint();
                filtroEstructura();
            }
        });
        trsFiltro = new TableRowSorter(tablaParametros.getModel());
        tablaParametros.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroEstructuraKeyTyped

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void txtFiltroMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroMPActionPerformed

    private void txtFiltroMPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroMPKeyTyped
        // TODO add your handling code here:

       txtFiltroMP.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltroMP.getText());
                txtFiltroMP.setText(cadena);
                repaint();
                filtroCT();
            }
        });
        trsFiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtFiltroMPKeyTyped

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
       try{
           int bandera = 0;
       
        int row = jTable1.getSelectedRow();
        int codigo = (int) jTable1.getValueAt(row,0);
           for(int i=0 ;i< contador; i++ ){
       
             if( (int)tablaParametros.getValueAt(i,0) == codigo){
                 
                 bandera=1;
             }
               
           }
        if(bandera==0){
        Object nombre = jTable1.getValueAt(row, 1);
        int hrMO = Integer.parseInt(jTextCostoMO.getText());
        int hrMaq = Integer.parseInt(jTextCostoMaq.getText());
        int hrOcio = Integer.parseInt(jTextCostoOcio.getText());
        
        
         DefaultTableModel tablaParametro= (DefaultTableModel) tablaParametros.getModel();
           
   tablaParametro.setRowCount(contador);     
   
                 tablaParametro.addRow(new Object[]{
                    codigo,
                    nombre,
                    hrMO,
                    hrMaq,
                    hrOcio,
                    contador+1
                    
                });
                 
                 contador = contador+1;
   
        }}
       catch(java.lang.NumberFormatException    e){
           
       }
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:

        int row = tablaParametros.getSelectedRow();
        
                 DefaultTableModel modelo = (DefaultTableModel)tablaParametros.getModel();
                 modelo.removeRow(row); 
                if (contador != 0){     
                contador= contador-1;}
              
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           PaginaInicial pagina = new PaginaInicial();
     pagina.setVisible(true);
     
     dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RutaFabricacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RutaFabricacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RutaFabricacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RutaFabricacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMRutaFabricacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<String> comboFiltroEstructura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCostoMO;
    private javax.swing.JTextField jTextCostoMaq;
    private javax.swing.JTextField jTextCostoOcio;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tablaParametros;
    private javax.swing.JTextPane textoProductoTerminado;
    private javax.swing.JTextField txtFiltroEstructura;
    private javax.swing.JTextField txtFiltroMP;
    // End of variables declaration//GEN-END:variables
}
