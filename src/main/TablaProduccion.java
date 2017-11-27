package main;

import entidades.MateriaPrima;
import entidades.Produccion;
import entidades.ProductoMateriaPrima;
import entidades.ProductoTerminado;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class TablaProduccion extends javax.swing.JFrame {

    Controlador controlador;
    private TableRowSorter trsFiltro;

    public TablaProduccion(Controlador controlador) {
        this.controlador = controlador;
        initComponents();

        List<ProductoTerminado> listProductoTerminado = controlador.iniciarProductoTerminado();
        cargarTablaProductoTerminado(listProductoTerminado);
        cargarTablaProduccion();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });

    }

    private void close() {
        if (jOptionPane1.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", jOptionPane1.YES_NO_OPTION) == jOptionPane1.YES_OPTION) {
            System.exit(0);
        }
    }

    private TablaProduccion() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        botonGenerarProduccion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boron = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        FinalizarProduccion = new javax.swing.JButton();
        botonCancelarProduccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planete Pizza");

        botonGenerarProduccion.setText("Generar Produccion");
        botonGenerarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarProduccionActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Producto", "Nombre", "Descripcion", "Cantidad a Producir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
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

        boron.setText("Volver");
        boron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boronActionPerformed(evt);
            }
        });

        jLabel2.setText("Modulo Produccion");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Produccion", "Codigo Producto", "Nombre Producto", "Cantidad", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        FinalizarProduccion.setText("Finalizar Produccion");
        FinalizarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarProduccionActionPerformed(evt);
            }
        });

        botonCancelarProduccion.setText("Cancelar Produccion");
        botonCancelarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarProduccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonGenerarProduccion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonCancelarProduccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FinalizarProduccion))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boron)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonGenerarProduccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FinalizarProduccion)
                        .addComponent(botonCancelarProduccion)))
                .addGap(44, 44, 44)
                .addComponent(boron)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGenerarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarProduccionActionPerformed

        int row = jTable1.getSelectedRow();
        int codigoProducto = (int) Integer.valueOf((Integer) jTable1.getValueAt(row, 0));
        int cantidadProducir = (int) Integer.valueOf((String) jTable1.getValueAt(row, 3));
        Date fechaOrdenProduccion = Calendar.getInstance().getTime();
        if (cantidadProducir <= 0) {
            JOptionPane.showMessageDialog(null, "Ingresar una cantidad a producir mayor a cero");
        } else {
            //Buscar Producto
            List<DTOCriterio> listBuscarProducto = new ArrayList<>();
            DTOCriterio buscarProducto = new DTOCriterio("codigoProductoTerminado", "=", codigoProducto);
            ProductoTerminado productoTSeleccionado = (ProductoTerminado) FachadaPersistencia.getInstance().buscar("ProductoTerminado", listBuscarProducto).get(0);
            listBuscarProducto.clear();
            listBuscarProducto.add(buscarProducto);
            //Buscar estructura
            List<ProductoMateriaPrima> listProductoMateriaPrima = controlador.iniciarEstructuraProducto(productoTSeleccionado);
            List<String> listMPFaltante = new ArrayList();

            //Verificar que se puede producir
            for (ProductoMateriaPrima productoMP : listProductoMateriaPrima) {
                if (productoMP.getCodigoMateriaPrima().getCantidadDisponible() < productoMP.getCantidadMateriaPrima() * cantidadProducir) {
                    listMPFaltante.add("Codigo: " + productoMP.getCodigoMateriaPrima().getCodigoMateriaPrima() + " Nombre: " + productoMP.getCodigoMateriaPrima().getNombreMateriaPrima() + " Cantidad Disponible: " + productoMP.getCodigoMateriaPrima().getCantidadDisponible() + " Cantidad Necesaria: " + productoMP.getCantidadMateriaPrima() * cantidadProducir);
                }
            }
            if (listMPFaltante.isEmpty()) {
                //Buscar ultimo id
                List<DTOCriterio> listBuscarProduccion = new ArrayList<>();
                DTOCriterio buscarProduccion = new DTOCriterio("", "", "");
                listBuscarProduccion.clear();
                listBuscarProduccion.add(buscarProduccion);
                List<Produccion> listProduccion = (List<Produccion>) (Object) FachadaPersistencia.getInstance().buscar("Produccion", listBuscarProduccion);
                int codigoProduccion;
                if (listProduccion.isEmpty()) {
                    codigoProduccion = 0;
                } else {
                    codigoProduccion = listProduccion.get(listProduccion.size() - 1).getCodigoOrdenProduccion() + 1;
                }
                //Crear Produccion
                Produccion nuevaProduccion = new Produccion(codigoProduccion, productoTSeleccionado, cantidadProducir, fechaOrdenProduccion, "Creada");
                FachadaPersistencia.getInstance().guardar(nuevaProduccion);
                //Modificar Cantidad Reservada
                for (ProductoMateriaPrima productoMP : listProductoMateriaPrima) {
                    productoMP.getCodigoMateriaPrima().setCantidadDisponible(productoMP.getCodigoMateriaPrima().getCantidadDisponible() - productoMP.getCantidadMateriaPrima() * cantidadProducir);
                    productoMP.getCodigoMateriaPrima().setCantidadReservada(productoMP.getCodigoMateriaPrima().getCantidadReservada() + productoMP.getCantidadMateriaPrima() * cantidadProducir);
                }
                //Actualizar Tabla Produccion
                cargarTablaProduccion();
            } else {
                String mensaje = "";
                for (String mp : listMPFaltante) {
                    mensaje = mensaje + mp + "\n";
                }
                mensaje = mensaje + "¿Desea ir al modulo de Orden de Compra para solicitarlas?";

                int result = JOptionPane.showOptionDialog(this, mensaje, "Materias Primas Faltantes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si, ir a OrdenCompra", "No, volver"}, JOptionPane.NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    List<MateriaPrima> listMateriaPrima = controlador.iniciar();
                    TablaMateria Gui_NuevaAbm = new TablaMateria(controlador, listMateriaPrima);
                    Gui_NuevaAbm.setVisible(true);
                    dispose();     // TODO add your handling code here:
                }
            }

        }

    }//GEN-LAST:event_botonGenerarProduccionActionPerformed

    public void cargarTablaProduccion() {
        List<DTOCriterio> listBuscarProduccion = new ArrayList<>();
        DTOCriterio buscarProduccion = new DTOCriterio("", "", "");
        listBuscarProduccion.clear();
        listBuscarProduccion.add(buscarProduccion);
        List<Produccion> listProduccion = (List<Produccion>) (Object) FachadaPersistencia.getInstance().buscar("Produccion", listBuscarProduccion);
        if (!listProduccion.isEmpty()) {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            for (int i = 0; i < listProduccion.size(); i++) {
                dtm.addRow(new Object[]{
                    listProduccion.get(i).getCodigoOrdenProduccion(),
                    listProduccion.get(i).getProductoTerminado().getCodigoProductoTerminado(),
                    listProduccion.get(i).getProductoTerminado().getNombreProductoTerminado(),
                    listProduccion.get(i).getCantidadProducir(),
                    listProduccion.get(i).getFechaOrdenProduccion(),
                    listProduccion.get(i).getEstadoOrdenProduccion()

                });
            }
        } else {
            System.out.println("No hay produccion para cargar en tabla");
        }

    }

    public void cargarTablaProductoTerminado(List<ProductoTerminado> listProductoTerminado) {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        dtm.setRowCount(0);
        for (int i = 0; i < listProductoTerminado.size(); i++) {

            dtm.addRow(new Object[]{
                listProductoTerminado.get(i).getCodigoProductoTerminado(),
                listProductoTerminado.get(i).getNombreProductoTerminado(),
                listProductoTerminado.get(i).getDescripcionProducto(),
                "0"
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
    private void boronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boronActionPerformed

        PaginaInicial pagina = new PaginaInicial();
        pagina.setVisible(true);

        dispose();             // TODO add your handling code here:
    }//GEN-LAST:event_boronActionPerformed

    private void FinalizarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarProduccionActionPerformed
        //Buscar Produccion
        int row = jTable2.getSelectedRow();
        int codigoProduccion = (int) Integer.valueOf((Integer) jTable2.getValueAt(row, 0));
        List<DTOCriterio> listBuscarProduccion = new ArrayList<>();
        DTOCriterio buscarProduccion = new DTOCriterio("codigoOrdenProduccion", "=", codigoProduccion);
        listBuscarProduccion.clear();
        listBuscarProduccion.add(buscarProduccion);
        Produccion produccionAFinalizar = (Produccion) FachadaPersistencia.getInstance().buscar("Produccion", listBuscarProduccion).get(0);
        //Cambiar estado a Finalizada
        produccionAFinalizar.setEstadoOrdenProduccion("Finalizada");
        //Eliminar Reservas
        List<ProductoMateriaPrima> listProductoMateriaPrima = controlador.iniciarEstructuraProducto(produccionAFinalizar.getProductoTerminado());
        for (ProductoMateriaPrima productoMP : listProductoMateriaPrima) {
            productoMP.getCodigoMateriaPrima().setCantidadReservada(productoMP.getCodigoMateriaPrima().getCantidadReservada() - productoMP.getCantidadMateriaPrima() * produccionAFinalizar.getCantidadProducir());
            FachadaPersistencia.getInstance().guardar(productoMP);
        }
        //Guardar
        produccionAFinalizar.getProductoTerminado().setCantidadDisponible(produccionAFinalizar.getProductoTerminado().getCantidadDisponible()+produccionAFinalizar.getCantidadProducir());
        FachadaPersistencia.getInstance().guardar(produccionAFinalizar.getProductoTerminado());
        FachadaPersistencia.getInstance().guardar(produccionAFinalizar);
        cargarTablaProduccion();

    }//GEN-LAST:event_FinalizarProduccionActionPerformed

    private void botonCancelarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarProduccionActionPerformed

        //Buscar Produccion
        int row = jTable2.getSelectedRow();
        int codigoProduccion = (int) Integer.valueOf((Integer) jTable2.getValueAt(row, 0));
        List<DTOCriterio> listBuscarProduccion = new ArrayList<>();
        DTOCriterio buscarProduccion = new DTOCriterio("codigoOrdenProduccion", "=", codigoProduccion);
        listBuscarProduccion.clear();
        listBuscarProduccion.add(buscarProduccion);
        Produccion produccionACancelar = (Produccion) FachadaPersistencia.getInstance().buscar("Produccion", listBuscarProduccion).get(0);
        //Cambiar estado a Finalizada
        produccionACancelar.setEstadoOrdenProduccion("Cancelada");
        //Eliminar Reservas
        List<ProductoMateriaPrima> listProductoMateriaPrima = controlador.iniciarEstructuraProducto(produccionACancelar.getProductoTerminado());
        for (ProductoMateriaPrima productoMP : listProductoMateriaPrima) {
            productoMP.getCodigoMateriaPrima().setCantidadDisponible(productoMP.getCodigoMateriaPrima().getCantidadDisponible() + productoMP.getCantidadMateriaPrima() * produccionACancelar.getCantidadProducir());
            productoMP.getCodigoMateriaPrima().setCantidadReservada(productoMP.getCodigoMateriaPrima().getCantidadReservada() - productoMP.getCantidadMateriaPrima() * produccionACancelar.getCantidadProducir());
            FachadaPersistencia.getInstance().guardar(productoMP);
        }
        //Guardar
        FachadaPersistencia.getInstance().guardar(produccionACancelar);
        cargarTablaProduccion();

    }//GEN-LAST:event_botonCancelarProduccionActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(TablaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TablaProduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinalizarProduccion;
    private javax.swing.JButton boron;
    private javax.swing.JButton botonCancelarProduccion;
    private javax.swing.JButton botonGenerarProduccion;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
