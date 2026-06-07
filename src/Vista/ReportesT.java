/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.FacturaDTO;


/**
 *
 * @author Jersson
 */
public class ReportesT extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
   
    
    public ReportesT() {
        
        definirColumnas();
    }

     private void definirColumnas() {
        mod.addColumn("CodigoFactura");
        mod.addColumn("Fecha");
        mod.addColumn("PrecioTotal");
        mod.addColumn("CodigoCliente");
        

        tblDatosR.setModel(mod);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListarRepo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosR = new javax.swing.JTable();

        setClosable(true);
        setTitle("ReportesTotales");

        btnListarRepo.setText("Listar");
        btnListarRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarRepoActionPerformed(evt);
            }
        });

        tblDatosR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatosR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(btnListarRepo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnListarRepo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarRepoActionPerformed
        
       
        
        
    }//GEN-LAST:event_btnListarRepoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarRepo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatosR;
    // End of variables declaration//GEN-END:variables
}
