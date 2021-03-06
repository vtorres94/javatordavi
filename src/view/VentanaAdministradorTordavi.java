/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.corridas.VentanaCorridasAdministrador;
import view.transportes.VentanaTransportesAdministrador;
import view.usuarios.VentanaUsuariosAdministrador;
import controller.Imagen;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */
public class VentanaAdministradorTordavi extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaAdministradorTordavi() {
        initComponents();
        this.setLocationRelativeTo(null);
        Imagen m = new Imagen(labelLogo, "src/images/logoTordavi.png");
        Imagen close = new Imagen(lblClose, "src/images/icons/iconClose.png");
        Imagen min = new Imagen(lblMinimizar, "src/images/icons/iconMinimizar.png");
        Imagen usuarios = new Imagen(lblUsuarios, "src/images/icons/iconUsuarios.png");
        Imagen transportes = new Imagen(lblTransportes, "src/images/icons/iconTransportes.png");
        Imagen corridas = new Imagen(lblCorridas, "src/images/icons/iconCorridas.png");
        Imagen clientes = new Imagen(lblClientes, "src/images/icons/iconClientes.png");
        Imagen ventas = new Imagen(lblVentas, "src/images/icons/iconVentas.png");
        Imagen reportes = new Imagen(lblReportes, "src/images/icons/iconReportes.png");
        Imagen logout = new Imagen(lblLogout, "src/images/icons/iconLogout.png");
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
        labelLogo = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        lblUsuarios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelTransportes = new javax.swing.JPanel();
        lblTransportes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        lblClientes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelReportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelCorridas = new javax.swing.JPanel();
        lblCorridas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelVentas = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 575));
        setMinimumSize(new java.awt.Dimension(1050, 575));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 575));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setMaximumSize(new java.awt.Dimension(300, 175));
        labelLogo.setMinimumSize(new java.awt.Dimension(300, 175));
        labelLogo.setPreferredSize(new java.awt.Dimension(300, 175));

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

        panelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        panelUsuarios.setPreferredSize(new java.awt.Dimension(250, 150));
        panelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelUsuariosMouseExited(evt);
            }
        });

        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelTransportes.setBackground(new java.awt.Color(255, 255, 255));
        panelTransportes.setPreferredSize(new java.awt.Dimension(250, 150));
        panelTransportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTransportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTransportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTransportesMouseExited(evt);
            }
        });

        lblTransportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Transportes");

        javax.swing.GroupLayout panelTransportesLayout = new javax.swing.GroupLayout(panelTransportes);
        panelTransportes.setLayout(panelTransportesLayout);
        panelTransportesLayout.setHorizontalGroup(
            panelTransportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransportesLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelTransportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTransportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelTransportesLayout.setVerticalGroup(
            panelTransportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransportesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelClientes.setBackground(new java.awt.Color(255, 255, 255));
        panelClientes.setPreferredSize(new java.awt.Dimension(250, 150));
        panelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelClientesMouseExited(evt);
            }
        });

        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clientes");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelReportes.setBackground(new java.awt.Color(255, 255, 255));
        panelReportes.setPreferredSize(new java.awt.Dimension(250, 150));
        panelReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelReportesMouseExited(evt);
            }
        });

        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reportes");

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelCorridas.setBackground(new java.awt.Color(255, 255, 255));
        panelCorridas.setPreferredSize(new java.awt.Dimension(250, 150));
        panelCorridas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCorridasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCorridasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCorridasMouseExited(evt);
            }
        });

        lblCorridas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Corridas");

        javax.swing.GroupLayout panelCorridasLayout = new javax.swing.GroupLayout(panelCorridas);
        panelCorridas.setLayout(panelCorridasLayout);
        panelCorridasLayout.setHorizontalGroup(
            panelCorridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorridasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelCorridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCorridas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelCorridasLayout.setVerticalGroup(
            panelCorridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorridasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblCorridas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelVentas.setBackground(new java.awt.Color(255, 255, 255));
        panelVentas.setPreferredSize(new java.awt.Dimension(250, 150));
        panelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelVentasMouseExited(evt);
            }
        });

        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ventas");

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 717, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelCorridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelCorridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

          private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
                    // TODO add your handling code here:

          }//GEN-LAST:event_lblCloseMouseMoved

          private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
              // TODO add your handling code here:
              int dialog = JOptionPane.YES_NO_CANCEL_OPTION;
              int result = JOptionPane.showConfirmDialog(null, "Desea salir?", "Exit", dialog);
              if (result == 0) {
                  System.exit(0);
              }
          }//GEN-LAST:event_lblCloseMouseClicked

          private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
              // TODO add your handling code here:

          }//GEN-LAST:event_lblCloseMouseExited

          private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
              // TODO add your handling code here:
              this.setState(VentanaAdministradorTordavi.ICONIFIED);
          }//GEN-LAST:event_lblMinimizarMouseClicked

          private void panelUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuariosMouseEntered
              // TODO add your handling code here:
              panelUsuarios.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelUsuariosMouseEntered

          private void panelUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuariosMouseExited
              // TODO add your handling code here:
              panelUsuarios.setBorder(null);
          }//GEN-LAST:event_panelUsuariosMouseExited

          private void panelTransportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTransportesMouseEntered
              // TODO add your handling code here:
              panelTransportes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelTransportesMouseEntered

          private void panelTransportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTransportesMouseExited
              // TODO add your handling code here:
              panelTransportes.setBorder(null);
          }//GEN-LAST:event_panelTransportesMouseExited

          private void panelReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportesMouseEntered
              // TODO add your handling code here:
              panelReportes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelReportesMouseEntered

          private void panelReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportesMouseExited
              // TODO add your handling code here:
              panelReportes.setBorder(null);
          }//GEN-LAST:event_panelReportesMouseExited

          private void panelClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClientesMouseEntered
              // TODO add your handling code here:
              panelClientes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelClientesMouseEntered

          private void panelClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClientesMouseExited
              // TODO add your handling code here:
              panelClientes.setBorder(null);
          }//GEN-LAST:event_panelClientesMouseExited

          private void panelCorridasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCorridasMouseEntered
              // TODO add your handling code here:
              panelCorridas.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelCorridasMouseEntered

          private void panelCorridasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCorridasMouseExited
              // TODO add your handling code here:
              panelCorridas.setBorder(null);
          }//GEN-LAST:event_panelCorridasMouseExited

          private void panelVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentasMouseEntered
              // TODO add your handling code here:
              panelVentas.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelVentasMouseEntered

          private void panelVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentasMouseExited
              // TODO add your handling code here:
              panelVentas.setBorder(null);
          }//GEN-LAST:event_panelVentasMouseExited

          private void panelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuariosMouseClicked
              // TODO add your handling code here:
              VentanaUsuariosAdministrador vua = new VentanaUsuariosAdministrador();
              vua.setVisible(true);
              this.dispose();
          }//GEN-LAST:event_panelUsuariosMouseClicked

          private void panelTransportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTransportesMouseClicked
              // TODO add your handling code here:
              VentanaTransportesAdministrador vta = new VentanaTransportesAdministrador();
              vta.setVisible(true);
              this.dispose();
          }//GEN-LAST:event_panelTransportesMouseClicked

          private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
              // TODO add your handling code here:
              int dialog = JOptionPane.YES_NO_CANCEL_OPTION;
              int result = JOptionPane.showConfirmDialog(null, "Desea cerrar la sesión?", "Exit", dialog);
              if (result == 0) {
                  LoginTordavi vl = new LoginTordavi();
                  vl.setVisible(true);
                  this.dispose();
              }
          }//GEN-LAST:event_lblLogoutMouseClicked

    private void panelCorridasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCorridasMouseClicked
        // TODO add your handling code here:
        VentanaCorridasAdministrador vca = new VentanaCorridasAdministrador();
        vca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelCorridasMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCorridas;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblTransportes;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelCorridas;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelTransportes;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JPanel panelVentas;
    // End of variables declaration//GEN-END:variables
}
