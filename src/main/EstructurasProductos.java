
package main;


import entidades.MateriaPrima;
import entidades.ProductoMateriaPrima;
import entidades.ProductoTerminado;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EstructurasProductos extends javax.swing.JFrame {

   Controlador controlador;
      private TableRowSorter trsFiltro;
    List<ProductoMateriaPrima> listProductoMateriaPrima;
   
    public EstructurasProductos(Controlador controlador,List<ProductoMateriaPrima> listProductoMateriaPrima) {
      
        this.controlador = controlador;
        initComponents();
        cargarProductoMateriaPrima(listProductoMateriaPrima);
        this.listProductoMateriaPrima = listProductoMateriaPrima;
        
        
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
        
    private EstructurasProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
      
            
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        comboFiltroEstructura = new javax.swing.JComboBox<>();
        txtFiltroEstructura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaParametros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planete Pizza");

        comboFiltroEstructura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CodigoPT", "NombrePT", "CodigoMP", "NombreMP", "Unidad" }));

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

        jLabel3.setText("Estructuras Productos:");

        tablaParametros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CodigoProdTerminado", "NombreProdTerminado", "Codigo Materia Prima", "Nombre Mat Prima", "Unidad Medida", "Cantidad Necesaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true
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

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Estructura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una Estructura para modificarla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton2)
                        .addGap(96, 96, 96)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFiltroEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
 public void filtroEstructura() {
        int columnaABuscar = 0;
        if (comboFiltroEstructura.getSelectedItem() == "CodigoPT") {
            
            columnaABuscar = 0;
        }
        if (comboFiltroEstructura.getSelectedItem().toString() == "NombrePT") {
            columnaABuscar = 1;
        }
        if (comboFiltroEstructura.getSelectedItem() == "CodigoMP") {
            
            columnaABuscar = 2;
        }
        if (comboFiltroEstructura.getSelectedItem().toString() == "CodigoMP") {
            columnaABuscar = 3;
        }
        if (comboFiltroEstructura.getSelectedItem().toString() == "Unidad") {
            columnaABuscar = 4;
        }
  
       trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltroEstructura.getText(), columnaABuscar));
} 
 
    private void tablaParametrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaParametrosKeyPressed

    }//GEN-LAST:event_tablaParametrosKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
     PaginaInicial pagina = new PaginaInicial();
     pagina.setVisible(true);
     
     dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = tablaParametros.getSelectedRow();
        int codigo = (int) tablaParametros.getValueAt(row,0);
         ProductoTerminado productoTerminado= controlador.modificarProductoTerminado(codigo);
                    List<MateriaPrima> listMateriaPrima = controlador.iniciar();

         List<ProductoMateriaPrima> listProductoMateriaPrima = controlador.iniciarEstructuraProducto(productoTerminado);

         EstructuraProdNuevo Gui_NuevaAbm1 = new EstructuraProdNuevo(controlador, listMateriaPrima, productoTerminado, listProductoMateriaPrima);
        Gui_NuevaAbm1.setVisible(true);

            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    public  void cargarProductoMateriaPrima(List<ProductoMateriaPrima> listProductoMateriaPrima){
        
 DefaultTableModel dtm= (DefaultTableModel) tablaParametros.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listProductoMateriaPrima.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listProductoMateriaPrima.get(i).getCodigoProductoTerminado().getCodigoProductoTerminado(),
                    listProductoMateriaPrima.get(i).getCodigoProductoTerminado().getNombreProductoTerminado(),
                    listProductoMateriaPrima.get(i).getCodigoMateriaPrima().getCodigoMateriaPrima(),
                    listProductoMateriaPrima.get(i).getCodigoMateriaPrima().getNombreMateriaPrima(),
                    listProductoMateriaPrima.get(i).getCodigoMateriaPrima().getUnidadMedida(),
                    listProductoMateriaPrima.get(i).getCantidadMateriaPrima()
                    
                });
  }     
       
}
 
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
            java.util.logging.Logger.getLogger(EstructurasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstructurasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstructurasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstructurasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
 
                new EstructurasProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFiltroEstructura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaParametros;
    private javax.swing.JTextField txtFiltroEstructura;
    // End of variables declaration//GEN-END:variables
}
