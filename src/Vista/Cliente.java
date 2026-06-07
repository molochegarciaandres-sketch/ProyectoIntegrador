/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import DAO.ClienteDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClienteDTO;

/**
 *
 * @author jerss
 */
public class Cliente extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    ClienteDAO cd = new ClienteDAO();
    ClienteDTO cdt = new ClienteDTO();
    ArrayList<ClienteDTO> vc = new ArrayList<>();
    public Cliente() {
        initComponents();
        definirColumnas();
        listar();
    }

    private void listar(){
        vc = cd.listar();
        for(int i = 0; i< vc.size();i++){
            Object[] data = {vc.get(i).getCod_cli(),
            vc.get(i).getNom_cli(),
            vc.get(i).getApe_cli(),
            vc.get(i).getDni_cli(),
            vc.get(i).getTel_cli()};
            mod.addRow(data);
        }
    }
    private void definirColumnas(){
        mod.addColumn("Codigo");
        mod.addColumn("Nombre");
        mod.addColumn("Apellido");
        mod.addColumn("DNI");
        mod.addColumn("Telefono");
       
        
        tblDatosCli.setModel(mod);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoCli = new javax.swing.JTextField();
        txtNombreCLi = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        txtApellidoCLi = new javax.swing.JTextField();
        txtDniCLi = new javax.swing.JTextField();
        btnRegistrarCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosCli = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registro de Clientes");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Telefono");

        jLabel6.setText("Apellido");

        jLabel7.setText("DNI");

        btnRegistrarCli.setText("REGISTRAR");
        btnRegistrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCliActionPerformed(evt);
            }
        });

        tblDatosCli.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDatosCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosCli);

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellidoCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefonoCli)))
                                .addGap(45, 45, 45)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDniCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCli)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCliActionPerformed
        ClienteDTO cdt = new ClienteDTO();
        cd = new ClienteDAO();
        cdt.setCod_cli(txtCodigoCli.getText());
        cdt.setNom_cli(txtNombreCLi.getText());
        cdt.setApe_cli(txtApellidoCLi.getText());
        cdt.setDni_cli(txtDniCLi.getText());
        cdt.setTel_cli(txtTelefonoCli.getText());
        cd.insertar(cdt);
        limpiarTabla();
        listar();
        limpiar();
        
    }//GEN-LAST:event_btnRegistrarCliActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ClienteDTO cdt = new ClienteDTO();
        cd = new ClienteDAO();

        cdt.setCod_cli(txtCodigoCli.getText());
        cdt.setNom_cli(txtNombreCLi.getText());
        cdt.setApe_cli(txtApellidoCLi.getText());
        cdt.setDni_cli(txtDniCLi.getText());
        cdt.setTel_cli(txtTelefonoCli.getText());

        cd.actualizar(cdt);

        limpiarTabla();
        listar();
        limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblDatosCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosCliMouseClicked
        int fila = tblDatosCli.getSelectedRow();

        cdt.setCod_cli(tblDatosCli.getValueAt(fila, 0).toString());
        cdt.setNom_cli(tblDatosCli.getValueAt(fila, 1).toString());
        cdt.setApe_cli(tblDatosCli.getValueAt(fila, 2).toString());
        cdt.setDni_cli(tblDatosCli.getValueAt(fila, 3).toString());
        cdt.setTel_cli(tblDatosCli.getValueAt(fila, 4).toString());

        txtCodigoCli.setText(cdt.getCod_cli());
        txtNombreCLi.setText(cdt.getNom_cli());
        txtApellidoCLi.setText(cdt.getApe_cli());
        txtDniCLi.setText(cdt.getDni_cli());
        txtTelefonoCli.setText(cdt.getTel_cli());
    }//GEN-LAST:event_tblDatosCliMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cd = new ClienteDAO();

        int fila = tblDatosCli.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
            return;
        }

        String cod = tblDatosCli.getValueAt(fila, 0).toString();

        cd.eliminar(cod);

        limpiarTabla();
        listar();
        limpiar();

        JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void limpiar(){
        txtCodigoCli.setText("");
        txtNombreCLi.setText("");
        txtTelefonoCli.setText("");
        txtApellidoCLi.setText("");
        txtDniCLi.setText("");
        txtTelefonoCli.setText("");
        txtCodigoCli.requestFocus();
    }
    public void limpiarTabla(){
        for(int i = 0; i < mod.getRowCount();i++){
            mod.removeRow(i);
            i = i-1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrarCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatosCli;
    private javax.swing.JTextField txtApellidoCLi;
    private javax.swing.JTextField txtCodigoCli;
    private javax.swing.JTextField txtDniCLi;
    private javax.swing.JTextField txtNombreCLi;
    private javax.swing.JTextField txtTelefonoCli;
    // End of variables declaration//GEN-END:variables
}
