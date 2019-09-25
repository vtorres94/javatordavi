/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.transportes;

import classes.Transporte;
import controller.Imagen;
import controller.Transportes;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import view.VentanaAdministradorTordavi;

/**
 *
 * @author Vladimir Torres
 * @version 0.1
 */
public class VentanaEditarTransporte extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAgregarUsuario
     */
    private Transportes transports;
    private Transporte transport;
    private int idTransporte;
    public VentanaEditarTransporte(int idTransporte) {
        initComponents();
        this.idTransporte=idTransporte;
        this.setLocationRelativeTo(null);
        transports = new Transportes();
        transport = new Transporte(idTransporte,txtNombre.getText(),txtTelefono.getText(),txtDireccion.getText());
        Imagen add = new Imagen(lblAgregarUsuario, "src/images/icons/iconAdd.png");
        Imagen close = new Imagen(lblClose, "src/images/icons/iconClose.png");
        Imagen min = new Imagen(lblMinimizar, "src/images/icons/iconMinimizar.png");
        txtNombre.setText(transport.getNombre());
        txtTelefono.setText(transport.getTelefono());
        txtDireccion.setText(transport.getDireccion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIDUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblAgregarUsuario = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        try{
            txtTelefono = new javax.swing.JFormattedTextField(new MaskFormatter("(###)-###-####"));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 255));
            setUndecorated(true);
            setResizable(false);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));

            lblIDUsuario.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
            lblIDUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblIDUsuario.setText("REGISTRO DE TRANSPORTES");

            jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel2.setText("Nombre:");

            jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel3.setText("Teléfono:");

            jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel4.setText("Dirección:");

            txtNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

            txtDireccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

            lblAgregarUsuario.setText("Agregar");
            lblAgregarUsuario.setPreferredSize(new java.awt.Dimension(44, 44));
            lblAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lblAgregarUsuarioMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lblAgregarUsuarioMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lblAgregarUsuarioMouseExited(evt);
                }
            });

            lblClose.setBackground(new java.awt.Color(255, 255, 255));
            lblClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            lblClose.setMaximumSize(new java.awt.Dimension(20, 20));
            lblClose.setMinimumSize(new java.awt.Dimension(20, 20));
            lblClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseMoved(java.awt.event.MouseEvent evt) {
                    lblCloseMouseMoved(evt);
                }
            });
            lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lblCloseMouseClicked(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lblCloseMouseExited(evt);
                }
            });

            lblMinimizar.setMaximumSize(new java.awt.Dimension(20, 20));
            lblMinimizar.setMinimumSize(new java.awt.Dimension(20, 20));
            lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lblMinimizarMouseClicked(evt);
                }
            });

            lblLogo.setEnabled(false);

            javax.swing.GroupLayout lblLogoLayout = new javax.swing.GroupLayout(lblLogo);
            lblLogo.setLayout(lblLogoLayout);
            lblLogoLayout.setHorizontalGroup(
                lblLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
            );
            lblLogoLayout.setVerticalGroup(
                lblLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 150, Short.MAX_VALUE)
            );

            jButton1.setText("Seleccionar Logo");
            jButton1.setEnabled(false);

        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(220, 220, 220))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(lblIDUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                    .addContainerGap(56, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(lblIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(VentanaAdministradorTordavi.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_CANCEL_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir?", "Exit", dialog);
        if (result == 0) {
            VentanaTransporte vta = new VentanaTransporte();
            vta.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblAgregarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarUsuarioMouseExited
        // TODO add your handling code here:
        lblAgregarUsuario.setBorder(null);
    }//GEN-LAST:event_lblAgregarUsuarioMouseExited

    private void lblAgregarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarUsuarioMouseEntered
        // TODO add your handling code here:
        lblAgregarUsuario.setBorder(BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_lblAgregarUsuarioMouseEntered

    private void lblAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarUsuarioMouseClicked
        // TODO add your handling code here:
        if (!txtNombre.getText().equals("")) {
            txtNombre.setBorder(null);
            if (!txtDireccion.getText().equals("")) {
                txtDireccion.setBorder(null);
                if (!txtTelefono.getText().equals("")) {
                    if (transports.modificarTransporte(transport)) {
                        JOptionPane.showMessageDialog(this, "se ha ingresado el transporte!");
                        VentanaTransporte vua = new VentanaTransporte(transport);
                        vua.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "NO se ha ingresado el transporte!");
                    }
                } else {
                    txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED));
                }

            } else {
                txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
        } else {
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
    }//GEN-LAST:event_lblAgregarUsuarioMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAgregarUsuario;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JPanel lblLogo;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}