/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

/**
 *
 * @author Valeria
 */
public class INTERFAZ extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    VENTANA_INICIO vi=new VENTANA_INICIO();
    String NomBibli1;
    String ApeBibli1;
    public INTERFAZ() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ventana Principal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelTranslucidoComplete();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        Registro_btn = new org.edisoncor.gui.button.ButtonAction();
        ConsultaPrestamo = new org.edisoncor.gui.button.ButtonAction();
        ConsultaLibros = new org.edisoncor.gui.button.ButtonAction();
        IngresoLibros = new org.edisoncor.gui.button.ButtonAction();
        Contactos = new org.edisoncor.gui.button.ButtonAction();
        Salir = new org.edisoncor.gui.button.ButtonAction();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelTranslucidoComplete1.setColorPrimario(new java.awt.Color(0, 204, 0));
        panelTranslucidoComplete1.setColorSecundario(new java.awt.Color(0, 51, 153));

        labelTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MULTIMEDIA/lectura.png"))); // NOI18N
        labelTask1.setText("LIBROS");
        labelTask1.setCategoryFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        labelTask1.setCategorySmallFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        labelTask1.setDescription("MENÚ DE OPCIONES");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Bienvenido a nuestro sistema bibliotecarío, por favor elija una opción:");

        Registro_btn.setText("Registro de préstamo");
        Registro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro_btnActionPerformed(evt);
            }
        });

        ConsultaPrestamo.setText("Consulta de préstamos");
        ConsultaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaPrestamoActionPerformed(evt);
            }
        });

        ConsultaLibros.setText("Consulta de libros ");
        ConsultaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaLibrosActionPerformed(evt);
            }
        });

        IngresoLibros.setText("Ingreso de nuevos libros");
        IngresoLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoLibrosActionPerformed(evt);
            }
        });

        Contactos.setText("Contactos");
        Contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactosActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MULTIMEDIA/LIBROS.jpg"))); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IngresoLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Contactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultaLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(ConsultaPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Registro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(Registro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsultaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsultaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IngresoLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelTranslucidoComplete1Layout = new javax.swing.GroupLayout(panelTranslucidoComplete1);
        panelTranslucidoComplete1.setLayout(panelTranslucidoComplete1Layout);
        panelTranslucidoComplete1Layout.setHorizontalGroup(
            panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoComplete1Layout.createSequentialGroup()
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoComplete1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoComplete1Layout.createSequentialGroup()
                        .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))))
        );
        panelTranslucidoComplete1Layout.setVerticalGroup(
            panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Registro_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro_btnActionPerformed
        // TODO add your handling code here:
        REGISTRO_PRESTAMO v1= new REGISTRO_PRESTAMO();
        v1.NomBibli2=NomBibli1;
        v1.ApeBibli2=ApeBibli1;
        v1.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_Registro_btnActionPerformed

    private void ConsultaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaPrestamoActionPerformed
        // TODO add your handling code here:
        CONSULTA_PRESTAMOS CP=new CONSULTA_PRESTAMOS();
        CP.NomBibli3=NomBibli1;
        CP.ApeBibli3=ApeBibli1;
        CP.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_ConsultaPrestamoActionPerformed

    private void ConsultaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaLibrosActionPerformed
        // TODO add your handling code here:
        CONSULTA_LIBROS CL=new CONSULTA_LIBROS();
        CL.NomBibli4=NomBibli1;
        CL.ApeBibli4=ApeBibli1;
        CL.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaLibrosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void IngresoLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoLibrosActionPerformed
        // TODO add your handling code here:
        INGRESO_L IL=new INGRESO_L();
        IL.NomBibli5=NomBibli1;
        IL.ApeBibli5=ApeBibli1;
        IL.setVisible(true);
        dispose();
    }//GEN-LAST:event_IngresoLibrosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        NomBibli1=NomBibli1;
        ApeBibli1=ApeBibli1;
    }//GEN-LAST:event_formWindowActivated

    private void ContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactosActionPerformed
        // TODO add your handling code here:
        CONTACTOS cn=new CONTACTOS();
        cn.NomBibli6=NomBibli1;
        cn.ApeBibli6=ApeBibli1;
        cn.setVisible(true);
        dispose();
    }//GEN-LAST:event_ContactosActionPerformed

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
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFAZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction ConsultaLibros;
    private org.edisoncor.gui.button.ButtonAction ConsultaPrestamo;
    private org.edisoncor.gui.button.ButtonAction Contactos;
    private org.edisoncor.gui.button.ButtonAction IngresoLibros;
    private org.edisoncor.gui.button.ButtonAction Registro_btn;
    private org.edisoncor.gui.button.ButtonAction Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete panelTranslucidoComplete1;
    // End of variables declaration//GEN-END:variables
}
