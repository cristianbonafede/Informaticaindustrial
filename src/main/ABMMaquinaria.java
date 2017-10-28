
package main;

import entidades.CentroTrabajo;
import entidades.Maquinaria;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class ABMMaquinaria extends javax.swing.JFrame {

    Controlador controlador;
    private TableRowSorter trsFiltro;
    private List<CentroTrabajo> listCentroTrabajo;
    public ABMMaquinaria(Controlador controlador, List<Maquinaria> listMaquinaria, List<CentroTrabajo> listCentroTrabajo) {
        this.controlador = controlador;
        initComponents();
        cargarMaquinaria(listMaquinaria);
        cargarCombo(listCentroTrabajo);
        this.listCentroTrabajo=listCentroTrabajo;
      
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
        

    private ABMMaquinaria() {

  
    }
    
    private void cargarCombo(List<CentroTrabajo> listCentroTrabajo){
        
        for (int i = 0; i < listCentroTrabajo.size(); i++) {
            comboCentroTrabajo.addItem(listCentroTrabajo.get(i).getNombreCentroTrabajo());
            
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoNombreEnBlanco = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dialogoCodigoEnBlanco = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
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
        jTextoNombre = new javax.swing.JTextField();
        JTextCodigo = new javax.swing.JTextField();
        comboCentroTrabajo = new javax.swing.JComboBox<>();
        botonAlta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jText1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextDatos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextDescripcion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("El nombre esta en blanco");

        javax.swing.GroupLayout dialogoNombreEnBlancoLayout = new javax.swing.GroupLayout(dialogoNombreEnBlanco.getContentPane());
        dialogoNombreEnBlanco.getContentPane().setLayout(dialogoNombreEnBlancoLayout);
        dialogoNombreEnBlancoLayout.setHorizontalGroup(
            dialogoNombreEnBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoNombreEnBlancoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Maquinaria", "Nombre", "Descripcion", "Centro de Trabajo", "DatosMantenimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "CentroTrabajo" }));
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

        jLabelNombre.setText("Nombre Maq: ");

        jLabelCodigo.setText("Codigo Maq: ");

        jLabelModificable.setText("Centro de Trabajo");

        jTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoNombreActionPerformed(evt);
            }
        });

        JTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCodigoActionPerformed(evt);
            }
        });

        comboCentroTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCentroTrabajoActionPerformed(evt);
            }
        });

        botonAlta.setText("Guardar");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion Maq:");

        jText1.setEditable(false);
        jText1.setText("6");
        jText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText1ActionPerformed(evt);
            }
        });

        jTextDatos.setColumns(20);
        jTextDatos.setRows(5);
        jTextDatos.setAutoscrolls(false);
        jTextDatos.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane3.setViewportView(jTextDatos);

        jLabel4.setText("6 Corresponde a Maquinaria");

        jTextDescripcion.setColumns(20);
        jTextDescripcion.setRows(5);
        jTextDescripcion.setAutoscrolls(false);
        jTextDescripcion.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane4.setViewportView(jTextDescripcion);

        jLabel9.setText("Datos Matenimiento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabelNombre)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabelModificable)
                        .addGap(18, 18, 18)
                        .addComponent(comboCentroTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(350, 350, 350))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModificable)
                            .addComponent(comboCentroTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNombre)
                                .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAlta))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("Filtrar por:");

        jLabel5.setText("Maquinaria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(661, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonBaja, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        int row = jTable1.getSelectedRow();
        int codigo = (int) jTable1.getValueAt(row,0);
         Maquinaria maquinaria= controlador.modificarMaquinaria(codigo);
          List<CentroTrabajo> listCentroTrabajo = controlador.iniciarCentroTrabajo();
         ModificarAtributosMaquinaria modificarAtributos  = new ModificarAtributosMaquinaria(controlador,maquinaria,listCentroTrabajo);
         modificarAtributos.setVisible(true);
         dispose();
  
    }//GEN-LAST:event_botonModificarActionPerformed
//////
    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        int row = jTable1.getSelectedRow();
        int codigo = (int) jTable1.getValueAt(row,0);
        

        controlador.bajaMaq(codigo);
                    List<Maquinaria> listMaquinaria = controlador.iniciarMaquinaria();
dispose();
 List<CentroTrabajo> listCentroTrabajo = controlador.iniciarCentroTrabajo();
            ABMMaquinaria  Gui_NuevaAbm = new ABMMaquinaria(controlador, listMaquinaria, listCentroTrabajo);
            Gui_NuevaAbm.setVisible(true);
  
        

        // TODO add your handling code here:
    }//GEN-LAST:event_botonBajaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
  
 
     PaginaInicial pagina = new PaginaInicial();
     pagina.setVisible(true);
     
     dispose();
             
 
    }//GEN-LAST:event_botonSalirActionPerformed

    
    
public  void cargarMaquinaria(List<Maquinaria> listMaquinaria){
        
 DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel();
           
dtm.setRowCount(0);       
  for(int i=0 ;i< listMaquinaria.size();i++ ){
            
                dtm.addRow(new Object[]{
                    listMaquinaria.get(i).getCodigoMaquinaria(),
                    listMaquinaria.get(i).getNombreMaquinaria(),
                    listMaquinaria.get(i).getDescripcionMaquinaria(),
                    listMaquinaria.get(i).getCodigoCentroTrabajo().getNombreCentroTrabajo(),
                    listMaquinaria.get(i).getDatosMantenimiento()
                    
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
        if (comboFiltro.getSelectedItem() == "CentroTrabajo") {
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

        if  (jTextoNombre.getText().isEmpty() || JTextCodigo.getText().isEmpty() ||  jTextDatos.getText().isEmpty()
            || jTextDescripcion.getText().isEmpty() || comboCentroTrabajo.getSelectedItem() == null )
        {
            if (jTextoNombre.getText().isEmpty()){

                dialogoNombreEnBlanco.setSize(300,150);
                dialogoNombreEnBlanco.setLocation(100, 100);
                dialogoNombreEnBlanco.setVisible(true);
            }
            if( JTextCodigo.getText().isEmpty())
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

            String nombre = jTextoNombre.getText();
            String codigos = jText1.getText() + JTextCodigo.getText();
            System.out.println(codigos);
            int codigo = (int)Integer.parseInt(codigos);
            String datos = jTextDatos.getText();
            String descripcion = jTextDescripcion.getText();
            String nombreCentro = comboCentroTrabajo.getSelectedItem().toString();
            CentroTrabajo  centroTrabajo=null;
            for (int i = 0; i < listCentroTrabajo.size(); i++) {
                if(listCentroTrabajo.get(i).getNombreCentroTrabajo()== nombreCentro)
                {
                    centroTrabajo=listCentroTrabajo.get(i);
                }
                
            }

            Maquinaria maquinaria = new Maquinaria(codigo,centroTrabajo, descripcion, nombre, datos);

            controlador.altaMaquinaria(maquinaria);

            List<Maquinaria> listMaquinaria = controlador.iniciarMaquinaria();

  dispose();
 List<CentroTrabajo> listCentroTrabajo = controlador.iniciarCentroTrabajo();
            ABMMaquinaria  Gui_NuevaAbm = new ABMMaquinaria(controlador, listMaquinaria, listCentroTrabajo);
            Gui_NuevaAbm.setVisible(true);
  
        }
    }//GEN-LAST:event_botonAltaActionPerformed

    private void comboCentroTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCentroTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCentroTrabajoActionPerformed

    private void JTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCodigoActionPerformed

    private void jTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoNombreActionPerformed

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
            java.util.logging.Logger.getLogger(ABMMaquinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMMaquinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMMaquinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMMaquinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ABMMaquinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextCodigo;
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboCentroTrabajo;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JDialog dialogoCodigoEnBlanco;
    private javax.swing.JDialog dialogoNombreEnBlanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelModificable;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText1;
    private javax.swing.JTextArea jTextDatos;
    private javax.swing.JTextArea jTextDescripcion;
    private javax.swing.JTextField jTextoNombre;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
