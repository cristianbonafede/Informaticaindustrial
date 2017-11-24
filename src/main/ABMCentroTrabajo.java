
package main;


import entidades.CentroTrabajo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class ABMCentroTrabajo extends javax.swing.JFrame {

    Controlador controlador;
    private TableRowSorter trsFiltro;
    
    public ABMCentroTrabajo(Controlador controlador, List<CentroTrabajo> listCentroTrabajo) {
        this.controlador = controlador;
        initComponents();
        cargarCentroTrabajo(listCentroTrabajo);
   
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
        

    private ABMCentroTrabajo() {

  
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoNombreEnBlanco = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dialogoCodigoEnBlanco = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        botonBaja = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelModificable = new javax.swing.JLabel();
        jTextoNombreMP = new javax.swing.JTextField();
        JTextCodigoMP = new javax.swing.JTextField();
        comboModificable = new javax.swing.JComboBox<>();
        botonAlta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jText1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextDescripcionMP = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextCostoHH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextCostoHM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("El nombre esta en blanco");

        javax.swing.GroupLayout dialogoNombreEnBlancoLayout = new javax.swing.GroupLayout(dialogoNombreEnBlanco.getContentPane());
        dialogoNombreEnBlanco.getContentPane().setLayout(dialogoNombreEnBlancoLayout);
        dialogoNombreEnBlancoLayout.setHorizontalGroup(
            dialogoNombreEnBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoNombreEnBlancoLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        dialogoNombreEnBlancoLayout.setVerticalGroup(
            dialogoNombreEnBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoNombreEnBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("El codigo esta en blanco");

        javax.swing.GroupLayout dialogoCodigoEnBlancoLayout = new javax.swing.GroupLayout(dialogoCodigoEnBlanco.getContentPane());
        dialogoCodigoEnBlanco.getContentPane().setLayout(dialogoCodigoEnBlancoLayout);
        dialogoCodigoEnBlancoLayout.setHorizontalGroup(
            dialogoCodigoEnBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoCodigoEnBlancoLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        dialogoCodigoEnBlancoLayout.setVerticalGroup(
            dialogoCodigoEnBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCodigoEnBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planeta Pizza");

        botonBaja.setText("Eliminar");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonSalir.setText("Finalizar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

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
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Ubicacion" }));
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar Datos"));

        jLabelNombre.setText("Nombre CT: ");

        jLabelCodigo.setText("Codigo CT: ");

        jLabelModificable.setText("Ubicacion");

        jTextoNombreMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoNombreMPActionPerformed(evt);
            }
        });

        JTextCodigoMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCodigoMPActionPerformed(evt);
            }
        });

        comboModificable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fabrica", "Sucursal" }));
        comboModificable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModificableActionPerformed(evt);
            }
        });

        botonAlta.setText("Guardar");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion CT:");

        jText1.setEditable(false);
        jText1.setText("7");
        jText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText1ActionPerformed(evt);
            }
        });

        jTextDescripcionMP.setColumns(20);
        jTextDescripcionMP.setRows(5);
        jTextDescripcionMP.setAutoscrolls(false);
        jTextDescripcionMP.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane3.setViewportView(jTextDescripcionMP);

        jLabel4.setText("7 Corresponde a Centro de Trabajo");

        jLabel5.setText("Costo Hora Hombre:");

        jLabel8.setText("Costo Hora Maquina:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jTextoNombreMP, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextCodigoMP, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCostoHH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCostoHM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelModificable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboModificable, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextCodigoMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextoNombreMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCostoHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextCostoHM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModificable)
                            .addComponent(comboModificable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAlta)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setText("Filtrar por:");

        jLabel9.setText("Centros de trabajo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(botonModificar)
                                .addGap(143, 143, 143)
                                .addComponent(botonBaja))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 254, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonSalir))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonBaja, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        int row = jTable1.getSelectedRow();
        int codigo = (int) jTable1.getValueAt(row,0);
         CentroTrabajo centroTrabajo= controlador.modificarCentroTrabajo(codigo);
         ModificarAtributosCentroTrabajo modificarAtributos  = new ModificarAtributosCentroTrabajo(controlador,centroTrabajo);
         modificarAtributos.setVisible(true);
         dispose();
  
    }//GEN-LAST:event_botonModificarActionPerformed
//////
    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
      
      
    
        
        int row = jTable1.getSelectedRow();
        int codigo = (int) jTable1.getValueAt(row,0);
        

        controlador.bajaCT(codigo);
                    List<CentroTrabajo> listCentroTrabajo = controlador.iniciarCentroTrabajo();
        dispose();
            ABMCentroTrabajo  Gui_NuevaAbm = new ABMCentroTrabajo(controlador, listCentroTrabajo);
            Gui_NuevaAbm.setVisible(true);
  
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBajaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
  
 
     PaginaInicial pagina = new PaginaInicial();
     pagina.setVisible(true);
     
     dispose();
             
 
    }//GEN-LAST:event_botonSalirActionPerformed

    
    
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
        
    
    
    
    public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "Codigo") {
            
            columnaABuscar = 0;
        }
        if (comboFiltro.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "Ubicacion") {
            columnaABuscar = 3;
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

    private void jText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText1ActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed

        if  (jTextoNombreMP.getText().isEmpty() || JTextCodigoMP.getText().isEmpty() ||  jTextDescripcionMP.getText().isEmpty()
                || jTextCostoHH.getText().isEmpty() || jTextCostoHM.getText().isEmpty())
        {
            if (jTextoNombreMP.getText().isEmpty()){

                dialogoNombreEnBlanco.setSize(300,150);
                dialogoNombreEnBlanco.setLocation(100, 100);
                dialogoNombreEnBlanco.setVisible(true);
            }
            if( JTextCodigoMP.getText().isEmpty())
            {

                dialogoCodigoEnBlanco.setSize(300,150);
                dialogoCodigoEnBlanco.setLocation(100, 100);
                dialogoCodigoEnBlanco.setVisible(true);
            }

            else
            {
                dialogoCodigoEnBlanco.setSize(300,150);
                dialogoCodigoEnBlanco.setLocation(100, 100);
                dialogoCodigoEnBlanco.setVisible(true);
            }

        }
        else
        {

            String nombre = jTextoNombreMP.getText();
            String codigos = jText1.getText() + JTextCodigoMP.getText();
            System.out.println(codigos);
            int codigo = (int)Integer.parseInt(codigos);
            int costoHH = (int)Integer.parseInt(jTextCostoHH.getText());
            int costoHM = (int)Integer.parseInt(jTextCostoHM.getText());
            String descripcion = jTextDescripcionMP.getText();
            String unidad = comboModificable.getSelectedItem().toString();
           
            CentroTrabajo centroTrabajo = new CentroTrabajo(codigo,  unidad,nombre, costoHH, costoHM, descripcion);

            controlador.altaCentroTrabajo(centroTrabajo);

            List<CentroTrabajo> listCentroTrabajo = controlador.iniciarCentroTrabajo();

            ABMCentroTrabajo  Gui_NuevaAbm = new ABMCentroTrabajo(controlador, listCentroTrabajo);
            Gui_NuevaAbm.setVisible(true);

            dispose();
        }

    }//GEN-LAST:event_botonAltaActionPerformed

    private void comboModificableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModificableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboModificableActionPerformed

    private void JTextCodigoMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCodigoMPActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JTextCodigoMPActionPerformed

    private void jTextoNombreMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoNombreMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoNombreMPActionPerformed

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
            java.util.logging.Logger.getLogger(ABMCentroTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMCentroTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMCentroTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMCentroTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ABMCentroTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextCodigoMP;
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<String> comboModificable;
    private javax.swing.JDialog dialogoCodigoEnBlanco;
    private javax.swing.JDialog dialogoNombreEnBlanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelModificable;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText1;
    private javax.swing.JTextField jTextCostoHH;
    private javax.swing.JTextField jTextCostoHM;
    private javax.swing.JTextArea jTextDescripcionMP;
    private javax.swing.JTextField jTextoNombreMP;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
