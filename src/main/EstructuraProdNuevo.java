/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import entidades.MateriaPrima;
import entidades.ProductoMateriaPrima;
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
public class EstructuraProdNuevo extends javax.swing.JFrame {

    
    Controlador controlador;
    private TableRowSorter trsFiltro;
    private ProductoTerminado productoTerminado;
    private int contador = 0;
    List<MateriaPrima> listMateriaPrima;
    List<ProductoMateriaPrima> listProductoMateriaPrima;
    
    public EstructuraProdNuevo(Controlador controlador, List<MateriaPrima> listMateriaPrima, ProductoTerminado productoTerminado, List<ProductoMateriaPrima> listProductoMateriaPrima ) {
        this.controlador = controlador;
        this.productoTerminado = productoTerminado;
        initComponents();
        cargarMateriaPrima(listMateriaPrima);
        cargarProductoMateriaPrima(listProductoMateriaPrima);
        this.listProductoMateriaPrima = listProductoMateriaPrima;
        this.listMateriaPrima = listMateriaPrima;
        if(listProductoMateriaPrima != null){
        for (int i = 0; i < listProductoMateriaPrima.size(); i++) {
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
    
        
    

    private EstructuraProdNuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    public  void cargarMateriaPrima(List<MateriaPrima> listMateriaPrima){
        
 DefaultTableModel dtm= (DefaultTableModel) jTablaMP.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listMateriaPrima.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listMateriaPrima.get(i).getCodigoMateriaPrima(),
                    listMateriaPrima.get(i).getNombreMateriaPrima(),
                    listMateriaPrima.get(i).getDescripcionMateriaPrima(),
                    listMateriaPrima.get(i).getUnidadMedida(),
                    listMateriaPrima.get(i).getPrecioPorUnidad(),
                    listMateriaPrima.get(i).getCantidadDisponible()
                    
                });
  }     
       
}
    public  void cargarProductoMateriaPrima(List<ProductoMateriaPrima> listProductoMateriaPrima){
        
 DefaultTableModel dtm= (DefaultTableModel) tablaParametros.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listProductoMateriaPrima.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listProductoMateriaPrima.get(i).getCodigoMateriaPrima().getCodigoMateriaPrima(),
                    listProductoMateriaPrima.get(i).getCodigoMateriaPrima().getNombreMateriaPrima(),
                    listProductoMateriaPrima.get(i).getCodigoMateriaPrima().getUnidadMedida(),
                    listProductoMateriaPrima.get(i).getCantidadMateriaPrima()
                    
                });
  }     
       
}
    
    public void filtroEstructura() {
        int columnaABuscar = 0;
        if (comboFiltroEstructura.getSelectedItem() == "Código") {
            
            columnaABuscar = 0;
        }
        if (comboFiltroEstructura.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 1;
        }
  
       trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltroEstructura.getText(), columnaABuscar));
} 
    public void filtroMP() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "Código") {
            
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
        fachadaInterna1 = new main.FachadaInterna();
        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaParametros = new javax.swing.JTable();
        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboFiltroEstructura = new javax.swing.JComboBox<>();
        txtFiltroEstructura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaMP = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltroMP = new javax.swing.JTextField();
        jButtonInsertar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoProductoTerminado = new javax.swing.JTextPane();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planete Pizza");

        tablaParametros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CodigoMateria", "Nombre", "Unidad Medida", "Cantidad Necesaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaParametros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaParametrosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaParametros);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecionar las materias prima correspondiente a la estructura producto  y completar la cantidad necesesaria: en la tabla");

        comboFiltroEstructura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nombre" }));

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

        jTablaMP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CódigoMateriaPrima", "Nombre", "Descripcion", "Unidad Medida", "PrecioPorUnidad", "CantidadDisponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaMP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTablaMP);

        jLabel3.setText("Estructura del Producto:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFiltroMP, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonInsertar)
                                .addGap(206, 206, 206)
                                .addComponent(Guardar)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEliminar)
                                .addGap(52, 52, 52))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltroMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(Guardar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     
        if (contador != 0 ){
      List<ProductoMateriaPrima> listProdMatPrima = new ArrayList<>();
            System.out.println(contador);
      for(int i=0 ;i< contador; i++ ){
          
    MateriaPrima matPrima = null; 
          if (tablaParametros.getValueAt(i,3 )!= null){
             
                int codigoMateriaPrima = (int) tablaParametros.getValueAt(i,0);
                System.out.println("1");
                int cantidadNecesaria = (int) tablaParametros.getValueAt(i,3);
                System.out.println("2");
                int codigoProductoTerminado = productoTerminado.getCodigoProductoTerminado();

                  int codigoProductoMP = codigoProductoTerminado*codigoMateriaPrima/(codigoMateriaPrima+12);
        
                System.out.println(codigoProductoMP);
      
                    for(int j=0 ;j< listMateriaPrima.size(); j++ ){
                     
                     int cod = listMateriaPrima.get(j).getCodigoMateriaPrima();
                     
                     if(cod == codigoMateriaPrima){
                          matPrima = listMateriaPrima.get(j);
                     }
                 }
                
                

         ProductoMateriaPrima productoMateriaPrima = new ProductoMateriaPrima(codigoProductoMP, matPrima, productoTerminado, cantidadNecesaria );
              System.out.println(productoMateriaPrima.getCodigoProductoMateriaPrima());
         listProdMatPrima.add(productoMateriaPrima);
          
          
          }
      }
      if(listProductoMateriaPrima.size()!=0){
          System.out.println(listProductoMateriaPrima.size());

                        controlador.modificarSeleccionEstructura(listProdMatPrima);
                           List<ProductoTerminado> listProductoTerminado = controlador.iniciarProductoTerminado();
    
       TablaProducto  Gui_NuevaAbm = new TablaProducto(controlador, listProductoTerminado);
        Gui_NuevaAbm.setVisible(true);
         dispose(); 
               
      }
                else{

                controlador.estructuraNueva(listProdMatPrima); 
              List<ProductoTerminado> listProductoTerminado = controlador.iniciarProductoTerminado();
    
       ABMProductoTerminado  Gui_NuevaAbm = new ABMProductoTerminado(controlador, listProductoTerminado);
        Gui_NuevaAbm.setVisible(true);
         dispose();

                        }
          
      
         
   
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void tablaParametrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaParametrosKeyPressed
   
    }//GEN-LAST:event_tablaParametrosKeyPressed

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
                filtroMP();
            }
        });
        trsFiltro = new TableRowSorter(jTablaMP.getModel());
        jTablaMP.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtFiltroMPKeyTyped

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        int bandera = 0;
        int row = jTablaMP.getSelectedRow();
        int codigo = (int) jTablaMP.getValueAt(row,0);
           for(int i=0 ;i< contador; i++ ){
       
             if( (int)tablaParametros.getValueAt(i,0) == codigo){
                 
                 bandera=1;
             }
               
           }
        if(bandera==0){
        Object unidad = jTablaMP.getValueAt(row, 3);
        Object nombre = jTablaMP.getValueAt(row, 1);
        
        
         DefaultTableModel tablaParametro= (DefaultTableModel) tablaParametros.getModel();
           
   tablaParametro.setRowCount(contador);     
   
                 tablaParametro.addRow(new Object[]{
                    codigo,
                     nombre,
                    unidad,
                    
                });
                 
                 contador = contador+1;
   
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
            java.util.logging.Logger.getLogger(EstructuraProdNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstructuraProdNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstructuraProdNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstructuraProdNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstructuraProdNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<String> comboFiltroEstructura;
    private main.FachadaInterna fachadaInterna1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTablaMP;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tablaParametros;
    private javax.swing.JTextPane textoProductoTerminado;
    private javax.swing.JTextField txtFiltroEstructura;
    private javax.swing.JTextField txtFiltroMP;
    // End of variables declaration//GEN-END:variables
}
