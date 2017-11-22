/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Animacion.Fade;
import javax.swing.JOptionPane;
import servicios.Registros;

/**
 *
 * @author c3rberuss
 */
public class DetalleEvento extends javax.swing.JDialog {

    /**
     * Creates new form DetalleEvento
     */
    
    
    private Registros reg = new Registros();
    private String[] datos;
    private boolean editado;
    
    public DetalleEvento(java.awt.Frame parent, boolean modal, String id) {
        super(parent, modal);
        initComponents();
        datos = reg.detalle(id);
        
        this.titulo.setText(datos[0]);
        this.descripcion.setText(datos[1]);
        this.fecha.setText(datos[2]);
        this.hora.setText(datos[3]);
        this.categoria.setText(datos[4]);
        
        editado = false;
        this.guardar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editarTitulo = new javax.swing.JToggleButton();
        editarHora = new javax.swing.JToggleButton();
        editarFecha = new javax.swing.JToggleButton();
        editarDescripcion = new javax.swing.JToggleButton();
        editarCategoria = new javax.swing.JToggleButton();
        guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(12, 12, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcion.setEditable(false);
        descripcion.setBackground(new java.awt.Color(12, 12, 22));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        descripcion.setForeground(new java.awt.Color(255, 255, 255));
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 248, -1));

        titulo.setEditable(false);
        titulo.setBackground(new java.awt.Color(12, 12, 22));
        titulo.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 90, 250, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TITULO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(12, 12, 22));
        fecha.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 140, 250, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESCRIPCION:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        hora.setEditable(false);
        hora.setBackground(new java.awt.Color(12, 12, 22));
        hora.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 248, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HORA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        categoria.setEditable(false);
        categoria.setBackground(new java.awt.Color(12, 12, 22));
        categoria.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 248, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CATEGORIA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        editarTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/edit.png"))); // NOI18N
        editarTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editarTitulo.setBorderPainted(false);
        editarTitulo.setContentAreaFilled(false);
        editarTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarTitulo.setFocusPainted(false);
        editarTitulo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/editPeq.png"))); // NOI18N
        editarTitulo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editarTituloStateChanged(evt);
            }
        });
        jPanel1.add(editarTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 40, 20));

        editarHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/edit.png"))); // NOI18N
        editarHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editarHora.setBorderPainted(false);
        editarHora.setContentAreaFilled(false);
        editarHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarHora.setFocusPainted(false);
        editarHora.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/editPeq.png"))); // NOI18N
        editarHora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editarHoraStateChanged(evt);
            }
        });
        jPanel1.add(editarHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 40, 20));

        editarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/edit.png"))); // NOI18N
        editarFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editarFecha.setBorderPainted(false);
        editarFecha.setContentAreaFilled(false);
        editarFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarFecha.setFocusPainted(false);
        editarFecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/editPeq.png"))); // NOI18N
        editarFecha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editarFechaStateChanged(evt);
            }
        });
        jPanel1.add(editarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 40, 20));

        editarDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/edit.png"))); // NOI18N
        editarDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editarDescripcion.setBorderPainted(false);
        editarDescripcion.setContentAreaFilled(false);
        editarDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarDescripcion.setFocusPainted(false);
        editarDescripcion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/editPeq.png"))); // NOI18N
        editarDescripcion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editarDescripcionStateChanged(evt);
            }
        });
        jPanel1.add(editarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 40, 20));

        editarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/edit.png"))); // NOI18N
        editarCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editarCategoria.setBorderPainted(false);
        editarCategoria.setContentAreaFilled(false);
        editarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarCategoria.setFocusPainted(false);
        editarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/editPeq.png"))); // NOI18N
        editarCategoria.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editarCategoriaStateChanged(evt);
            }
        });
        editarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(editarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 40, 20));

        guardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/savePq.png"))); // NOI18N
        guardar.setText("GUARDAR CAMBIOS");
        guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setFocusPainted(false);
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 150, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATOS DE MI EVENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REPETIR:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/close.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/closePeque.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarTituloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editarTituloStateChanged
        if(this.editarTitulo.isSelected()){
            this.titulo.setEditable(true);
            editado = true;
            this.guardar.setVisible(true);
        }else{
            this.titulo.setEditable(false);
        }
    }//GEN-LAST:event_editarTituloStateChanged

    private void editarFechaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editarFechaStateChanged
        if(this.editarFecha.isSelected()){
            this.fecha.setEditable(true);
             editado = true;
             this.guardar.setVisible(true);
        }else{
            this.fecha.setEditable(false);
        }
    }//GEN-LAST:event_editarFechaStateChanged

    private void editarHoraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editarHoraStateChanged
        if(this.editarHora.isSelected()){
            this.hora.setEditable(true);
            editado = true;
            this.guardar.setVisible(true);
        }else{
            this.hora.setEditable(false);
        }
    }//GEN-LAST:event_editarHoraStateChanged

    private void editarCategoriaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editarCategoriaStateChanged
        if(this.editarCategoria.isSelected()){
            this.categoria.setEditable(true);
            editado = true;
            this.guardar.setVisible(true);
        }else{
            this.categoria.setEditable(false);
        }
    }//GEN-LAST:event_editarCategoriaStateChanged

    private void editarDescripcionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editarDescripcionStateChanged
        if(this.editarDescripcion.isSelected()){
            this.descripcion.setEditable(true);
            editado = true;
            this.guardar.setVisible(true);
        }else{
            this.descripcion.setEditable(false);
        }
    }//GEN-LAST:event_editarDescripcionStateChanged

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       editado = false;
    }//GEN-LAST:event_guardarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(editado){
            JOptionPane.showMessageDialog(this, "Aún no se han guardado los cambios!");
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
        this.guardar.setBorderPainted(true);
    }//GEN-LAST:event_guardarMouseEntered

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
        this.guardar.setBorderPainted(false);
    }//GEN-LAST:event_guardarMouseExited

    private void editarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarCategoriaActionPerformed

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        this.btnCerrar.setBorderPainted(true);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        this.btnCerrar.setBorderPainted(false);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Fade.JDialogFadeOut(1f, 0f, 0.1f, 50, this,Fade.DISPOSE);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalleEvento dialog = new DetalleEvento(new javax.swing.JFrame(), true, "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JToggleButton editarCategoria;
    private javax.swing.JToggleButton editarDescripcion;
    private javax.swing.JToggleButton editarFecha;
    private javax.swing.JToggleButton editarHora;
    private javax.swing.JToggleButton editarTitulo;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
