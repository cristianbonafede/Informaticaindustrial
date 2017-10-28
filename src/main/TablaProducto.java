
package main;

import entidades.CentroTrabajo;
import entidades.MateriaPrima;
import entidades.ProductoMateriaPrima;
import entidades.ProductoTerminado;
import entidades.RutaFabricacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class TablaProducto extends javax.swing.JFrame {

    Controlador controlador;
    private TableRowSorter trsFiltro;
    
    public TablaProducto(Controlador controlador, List<ProductoTerminado> listProductoTerminado) {
        this.controlador = controlador;
        initComponents();
        cargarTipoImpuesto(listProductoTerminado);
        
        
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

    private TablaProducto() {

  
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        botonModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boron = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planete Pizza");

        botonModificar.setText("Seleccionar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CódigoProductoTerminado", "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        boron.setText("Cancelar");
        boron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boronActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione el Producto para ver o crear la ruta de fabricacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(botonModificar)
                .addGap(169, 169, 169)
                .addComponent(boron)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar)
                    .addComponent(boron))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        int row = jTable1.getSelectedRow();
        int codigo = (int) jTable1.getValueAt(row,0);
         ProductoTerminado productoTerminado= controlador.modificarProductoTerminado(codigo);
         List<RutaFabricacion> listRuta = controlador.iniciarRutaFabricacion(productoTerminado);
         List<CentroTrabajo> listCentro = controlador.iniciarCentroTrabajo();
         ABMRutaFabricacion GuiRutas  = new ABMRutaFabricacion(controlador,listCentro,productoTerminado,listRuta);
         GuiRutas.setVisible(true);
dispose();
  
    }//GEN-LAST:event_botonModificarActionPerformed

    
    
public  void cargarTipoImpuesto(List<ProductoTerminado> listProductoTerminado){
        
 DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listProductoTerminado.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listProductoTerminado.get(i).getCodigoProductoTerminado(),
                    listProductoTerminado.get(i).getNombreProductoTerminado(),
                    listProductoTerminado.get(i).getDescripcionProducto()
                    
                });
  }     
       
}
        
    
    
    
    public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "Codigo") {
            
            columnaABuscar = 0;
        }
        if (comboFiltro.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 1;
        }
       
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
}
    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        // TODO add your handling code here:        

        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsFiltro);


    }//GEN-LAST:event_txtFiltroKeyTyped

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void boronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boronActionPerformed

     PaginaInicial pagina = new PaginaInicial();
     pagina.setVisible(true);
     
     dispose();             // TODO add your handling code here:
    }//GEN-LAST:event_boronActionPerformed

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
            java.util.logging.Logger.getLogger(TablaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TablaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boron;
    private javax.swing.JButton botonModificar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
