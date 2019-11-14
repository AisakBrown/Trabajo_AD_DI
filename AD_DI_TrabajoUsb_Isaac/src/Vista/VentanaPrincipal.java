/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.BackUp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author isaac
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void actualizarInterfazProgreso(String rutaArchivo, int progreso) {
        jlMostrarArchivos.setText(rutaArchivo);
        jProgressBar.setValue(progreso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfRutaArchivoACopiar = new javax.swing.JTextField();
        jbRutaCopiar = new javax.swing.JButton();
        jtfRutaDestino = new javax.swing.JTextField();
        jbRutaDestino = new javax.swing.JButton();
        jlError = new javax.swing.JLabel();
        jbCrearBackUp = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jlMostrarArchivos = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione directorio a copiar:");

        jLabel2.setText("Seleccione ruta destino:");

        jbRutaCopiar.setText("Seleccionar");
        jbRutaCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRutaCopiarMouseClicked(evt);
            }
        });

        jbRutaDestino.setText("Seleccionar");
        jbRutaDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRutaDestinoMouseClicked(evt);
            }
        });

        jlError.setForeground(new java.awt.Color(255, 0, 0));

        jbCrearBackUp.setText("Crear copia de seguridad");
        jbCrearBackUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCrearBackUpMouseClicked(evt);
            }
        });

        jProgressBar.setForeground(new java.awt.Color(0, 0, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los archivos", "Imágenes", "Documentos", "Videos" }));

        jLabel3.setText("Seleccione tipo de archivo a copiar:");

        jMenu1.setText("Buscar duplicados");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar espacio libre");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jlError)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jtfRutaArchivoACopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfRutaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbRutaCopiar)
                                    .addComponent(jbRutaDestino)
                                    .addComponent(jbCrearBackUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jlMostrarArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRutaArchivoACopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRutaCopiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRutaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRutaDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMostrarArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jbCrearBackUp)
                .addGap(26, 26, 26)
                .addComponent(jlError)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRutaCopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRutaCopiarMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int seleccion = fileChooser.showOpenDialog(jtfRutaArchivoACopiar);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File ficheroSeleccionado = fileChooser.getSelectedFile();
            jtfRutaArchivoACopiar.setText(ficheroSeleccionado.getAbsolutePath());
        } else if (seleccion == JFileChooser.ERROR_OPTION) {
            jlError.setText("Error, vuelva a intentarlo");
        }
    }//GEN-LAST:event_jbRutaCopiarMouseClicked

    private void jbRutaDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRutaDestinoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showOpenDialog(jtfRutaDestino);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File ficheroSeleccionado = fileChooser.getSelectedFile();
            jtfRutaDestino.setText(ficheroSeleccionado.getAbsolutePath());
        } else if (seleccion == JFileChooser.ERROR_OPTION) {
            jlError.setText("Error, vuelva a intentarlo");
        }
    }//GEN-LAST:event_jbRutaDestinoMouseClicked

    private void jbCrearBackUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearBackUpMouseClicked
        if (jtfRutaArchivoACopiar != null && jtfRutaDestino != null) {
            try {
                BackUp backup = new BackUp(jtfRutaArchivoACopiar.getText(), jtfRutaDestino.getText(), this);
                String seleccion = (String) jComboBox1.getSelectedItem();
                ArrayList<File> lista = backup.obtenerArchivosFormaRecursiva(backup.getArchivoACopiar().getAbsolutePath(), seleccion);
                jProgressBar.setMaximum(lista.size());
                Thread queryThread = new Thread() {
                    public void run() {
                        try {
                            if (seleccion.equalsIgnoreCase("Todos los archivos")) {
                                backup.copiarArchivosDesdeLista(lista);
                            }
                            else if(seleccion.equalsIgnoreCase("Videos")){
                                backup.copiarVideosDesdelista(lista);
                            }
                            else if(seleccion.equalsIgnoreCase("Imágenes")){
                                backup.copiarImagenesDesdelista(lista);
                            }
                            else if(seleccion.equalsIgnoreCase("Documentos")){
                                backup.copiarDocumentosDesdelista(lista);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                queryThread.start();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbCrearBackUpMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        JDBuscarDuplicados ventanaDuplicados = new JDBuscarDuplicados(this, true);
        ventanaDuplicados.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        JDEspacioLibre ventanaEspacioLibre = new JDEspacioLibre(this, true);
        ventanaEspacioLibre.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JButton jbCrearBackUp;
    private javax.swing.JButton jbRutaCopiar;
    private javax.swing.JButton jbRutaDestino;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlMostrarArchivos;
    private javax.swing.JTextField jtfRutaArchivoACopiar;
    private javax.swing.JTextField jtfRutaDestino;
    // End of variables declaration//GEN-END:variables
}