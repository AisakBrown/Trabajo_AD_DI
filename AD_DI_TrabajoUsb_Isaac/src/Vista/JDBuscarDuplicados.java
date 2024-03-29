/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.MetodosManejoUSB;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author isaac
 */
public class JDBuscarDuplicados extends javax.swing.JDialog {

    ArrayList<File> listaDuplicados;

    /**
     * Creates new form JDBuscarDuplicados
     */
    public JDBuscarDuplicados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jbSiEliminar.setVisible(false);
        jbNoEliminar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfRutaArchivoACopiar = new javax.swing.JTextField();
        jbRutaCopiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBBuscarDuplicados = new javax.swing.JButton();
        jlTotalFicherosDuplicados = new javax.swing.JLabel();
        jbSiEliminar = new javax.swing.JButton();
        jbNoEliminar = new javax.swing.JButton();

        jLabel1.setText("Seleccione directorio a copiar:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbRutaCopiar.setText("Seleccionar");
        jbRutaCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRutaCopiarMouseClicked(evt);
            }
        });

        jLabel2.setText("Seleccione donde buscar duplicados:");

        jBBuscarDuplicados.setText("Buscar duplicados");
        jBBuscarDuplicados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBuscarDuplicadosMouseClicked(evt);
            }
        });

        jbSiEliminar.setText("Si");
        jbSiEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSiEliminarMouseClicked(evt);
            }
        });

        jbNoEliminar.setText("No");
        jbNoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbNoEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRutaCopiar)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSiEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNoEliminar))
                    .addComponent(jlTotalFicherosDuplicados)
                    .addComponent(jBBuscarDuplicados)
                    .addComponent(jLabel2))
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jtfRutaArchivoACopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(201, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRutaCopiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBuscarDuplicados)
                .addGap(59, 59, 59)
                .addComponent(jlTotalFicherosDuplicados)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSiEliminar)
                    .addComponent(jbNoEliminar))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jtfRutaArchivoACopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRutaCopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRutaCopiarMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showOpenDialog(jtfRutaArchivoACopiar);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File ficheroSeleccionado = fileChooser.getSelectedFile();
            jtfRutaArchivoACopiar.setText(ficheroSeleccionado.getAbsolutePath());
        } else if (seleccion == JFileChooser.ERROR_OPTION) {
            //jlError.setText("Error, vuelva a intentarlo");
        }

    }//GEN-LAST:event_jbRutaCopiarMouseClicked

    private void jBBuscarDuplicadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarDuplicadosMouseClicked
        File file = new File(jtfRutaArchivoACopiar.getText());
        listaDuplicados = MetodosManejoUSB.buscarFicherosDuplicados(file);
        jlTotalFicherosDuplicados.setText("Hay un total de " + listaDuplicados.size() + " ficheros duplicados, ¿desea eliminarlos?");
        jbSiEliminar.setVisible(true);
        jbNoEliminar.setVisible(true);
    }//GEN-LAST:event_jBBuscarDuplicadosMouseClicked

    private void jbNoEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNoEliminarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jbNoEliminarMouseClicked

    private void jbSiEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSiEliminarMouseClicked
            jlTotalFicherosDuplicados.setText(MetodosManejoUSB.borrarFicheros(listaDuplicados) + " ficheros borrados");
            jbSiEliminar.setVisible(false);
            jbNoEliminar.setVisible(false);
    }//GEN-LAST:event_jbSiEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarDuplicados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbNoEliminar;
    private javax.swing.JButton jbRutaCopiar;
    private javax.swing.JButton jbSiEliminar;
    private javax.swing.JLabel jlTotalFicherosDuplicados;
    private javax.swing.JTextField jtfRutaArchivoACopiar;
    // End of variables declaration//GEN-END:variables
}
