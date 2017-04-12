/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.Controlador;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VENTANA_INICIO extends javax.swing.JFrame {

    /**
     * Creates new form VENTANA_INICIO
     */
    int intentos=0;
    Controlador c=new Controlador();
    File archivo= new File("Bibliotecarios.obj");
    public VENTANA_INICIO() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inicio");
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
        jLabel1 = new javax.swing.JLabel();
        labelHeader10 = new org.edisoncor.gui.label.LabelHeader();
        IngNombre = new org.edisoncor.gui.textField.TextField();
        jLabel2 = new javax.swing.JLabel();
        Salir = new org.edisoncor.gui.button.ButtonAction();
        INGRESAR = new org.edisoncor.gui.button.ButtonAction();
        labelHeader11 = new org.edisoncor.gui.label.LabelHeader();
        IngApellido = new org.edisoncor.gui.textField.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelTranslucidoComplete1.setColorPrimario(new java.awt.Color(0, 204, 0));
        panelTranslucidoComplete1.setColorSecundario(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("SISTEMA BIBLIOTECARIO");

        labelHeader10.setText("Nombre:");

        IngNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngNombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Antes de Ingresar al Sistema, Ingrese su Nombre y Apellido");

        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        INGRESAR.setText("INGRESAR");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        labelHeader11.setText("Apellido:");

        IngApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngApellidoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelTranslucidoComplete1Layout = new javax.swing.GroupLayout(panelTranslucidoComplete1);
        panelTranslucidoComplete1.setLayout(panelTranslucidoComplete1Layout);
        panelTranslucidoComplete1Layout.setHorizontalGroup(
            panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranslucidoComplete1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelHeader11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))
                    .addGroup(panelTranslucidoComplete1Layout.createSequentialGroup()
                        .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(117, 117, 117))))
        );
        panelTranslucidoComplete1Layout.setVerticalGroup(
            panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHeader11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        // TODO add your handling code here:
        if(IngNombre.getText().isEmpty() || IngApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se puede continuar.\nExisten campos vacios");
            intentos+=1;
        }else{
            try {
                if (c.validarFSBibliotecario(archivo, IngNombre.getText(), IngApellido.getText())==true){
                    INTERFAZ in=new INTERFAZ();
                    in.NomBibli1=IngNombre.getText();
                    in.ApeBibli1=IngApellido.getText();
                    in.setVisible(true);
                    dispose();
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Los datos no coinciden.","AVISO",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/MULTIMEDIA/alerta.png"));
                    intentos+=1;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VENTANA_INICIO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(VENTANA_INICIO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (intentos>=3){
            JOptionPane.showMessageDialog(null, "Numeros de intentos exedidos.","AVISO",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/IMG/alerta.png"));
            System.exit(0);
        }
    }//GEN-LAST:event_INGRESARActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formWindowActivated

    private void IngNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngNombreKeyTyped
        // TODO add your handling code here:
         //Accion para convertir todo lo que se escribe en mayuscula
        char c=evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String Buscador=(""+c).toUpperCase();
            c=Buscador.charAt(0);
            evt.setKeyChar(c);
        }
        //codigo para que solo acepte letras
        if ((evt.getKeyChar()<'a'|| evt.getKeyChar()>'z')&&(evt.getKeyChar()<'A'||evt.getKeyChar()>'Z')){
            evt.consume();
	}
    }//GEN-LAST:event_IngNombreKeyTyped

    private void IngApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngApellidoKeyTyped
        // TODO add your handling code here:
         //Accion para convertir todo lo que se escribe en mayuscula
        char c=evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String Buscador=(""+c).toUpperCase();
            c=Buscador.charAt(0);
            evt.setKeyChar(c);
        }
        //codigo para que solo acepte letras
        if ((evt.getKeyChar()<'a'|| evt.getKeyChar()>'z')&&(evt.getKeyChar()<'A'||evt.getKeyChar()>'Z')){
            evt.consume();
	}
    }//GEN-LAST:event_IngApellidoKeyTyped

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
            java.util.logging.Logger.getLogger(VENTANA_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTANA_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTANA_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTANA_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA_INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction INGRESAR;
    private org.edisoncor.gui.textField.TextField IngApellido;
    private org.edisoncor.gui.textField.TextField IngNombre;
    private org.edisoncor.gui.button.ButtonAction Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.edisoncor.gui.label.LabelHeader labelHeader10;
    private org.edisoncor.gui.label.LabelHeader labelHeader11;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete panelTranslucidoComplete1;
    // End of variables declaration//GEN-END:variables
}