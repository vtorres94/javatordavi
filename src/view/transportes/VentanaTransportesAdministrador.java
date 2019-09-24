package view.transportes;

import controller.Imagen;
import controller.Transportes;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import view.VentanaAdministradorTordavi;
/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */
public class VentanaTransportesAdministrador extends javax.swing.JFrame {
          Transportes transportes;
          /**
           * Creates new form VentanaTransportesAdministrador
           */
          public VentanaTransportesAdministrador() {
                    initComponents();
                    this.setLocationRelativeTo(null);
                    transportes = new Transportes();
                    Imagen m = new Imagen(labelLogo,"src/images/logoTordavi.png");
                    Imagen close = new Imagen(lblClose,"src/images/icons/iconClose.png");
                    Imagen min = new Imagen(lblMinimizar,"src/images/icons/iconMinimizar.png");
                    Imagen guadiana = new Imagen(lblGuadiana, "src/images/transportLines/guadianaLogo.png");
                    Imagen santiago = new Imagen(lblSantiago,"src/images/transportLines/SantiagoLogo.png");
                    Imagen tornado = new Imagen(lblTornado, "src/images/transportLines/tornadoLogo.png");
                    Imagen zacatecano = new Imagen(lblZacatecano,"src/images/transportLines/zacatecanoLogo.PNG");
                    Imagen misioneros = new Imagen(lblMisioneros,"src/images/transportLines/misionerosLogo.jpg");
                    Imagen back = new Imagen(lblRegresar, "src/images/icons/iconRegresar.png");
          }
          
          @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        panelGuadiana = new javax.swing.JPanel();
        lblGuadiana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelSantiago = new javax.swing.JPanel();
        lblSantiago = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelZacatecano = new javax.swing.JPanel();
        lblZacatecano = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelTornado = new javax.swing.JPanel();
        lblTornado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelMisioneros = new javax.swing.JPanel();
        lblMisioneros = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelOtros = new javax.swing.JPanel();
        lblOtros = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
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

        panelGuadiana.setBackground(new java.awt.Color(255, 255, 255));
        panelGuadiana.setPreferredSize(new java.awt.Dimension(250, 150));
        panelGuadiana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGuadianaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGuadianaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelGuadianaMouseExited(evt);
            }
        });

        lblGuadiana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guadiana Express");

        javax.swing.GroupLayout panelGuadianaLayout = new javax.swing.GroupLayout(panelGuadiana);
        panelGuadiana.setLayout(panelGuadianaLayout);
        panelGuadianaLayout.setHorizontalGroup(
            panelGuadianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuadianaLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(panelGuadianaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuadiana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGuadianaLayout.setVerticalGroup(
            panelGuadianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuadianaLayout.createSequentialGroup()
                .addComponent(lblGuadiana, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelSantiago.setBackground(new java.awt.Color(255, 255, 255));
        panelSantiago.setPreferredSize(new java.awt.Dimension(250, 150));
        panelSantiago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSantiagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSantiagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSantiagoMouseExited(evt);
            }
        });

        lblSantiago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Santiago Express");

        javax.swing.GroupLayout panelSantiagoLayout = new javax.swing.GroupLayout(panelSantiago);
        panelSantiago.setLayout(panelSantiagoLayout);
        panelSantiagoLayout.setHorizontalGroup(
            panelSantiagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSantiagoLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel2)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(panelSantiagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSantiago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSantiagoLayout.setVerticalGroup(
            panelSantiagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSantiagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSantiago, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelZacatecano.setBackground(new java.awt.Color(255, 255, 255));
        panelZacatecano.setPreferredSize(new java.awt.Dimension(250, 150));
        panelZacatecano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelZacatecanoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelZacatecanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelZacatecanoMouseExited(evt);
            }
        });

        lblZacatecano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Zacatecano");

        javax.swing.GroupLayout panelZacatecanoLayout = new javax.swing.GroupLayout(panelZacatecano);
        panelZacatecano.setLayout(panelZacatecanoLayout);
        panelZacatecanoLayout.setHorizontalGroup(
            panelZacatecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZacatecanoLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel4)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(panelZacatecanoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZacatecano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelZacatecanoLayout.setVerticalGroup(
            panelZacatecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZacatecanoLayout.createSequentialGroup()
                .addComponent(lblZacatecano, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelTornado.setBackground(new java.awt.Color(255, 255, 255));
        panelTornado.setPreferredSize(new java.awt.Dimension(250, 150));
        panelTornado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTornadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTornadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTornadoMouseExited(evt);
            }
        });

        lblTornado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tornado Bus");

        javax.swing.GroupLayout panelTornadoLayout = new javax.swing.GroupLayout(panelTornado);
        panelTornado.setLayout(panelTornadoLayout);
        panelTornadoLayout.setHorizontalGroup(
            panelTornadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTornadoLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(panelTornadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTornado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTornadoLayout.setVerticalGroup(
            panelTornadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTornadoLayout.createSequentialGroup()
                .addComponent(lblTornado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelMisioneros.setBackground(new java.awt.Color(255, 255, 255));
        panelMisioneros.setPreferredSize(new java.awt.Dimension(250, 150));
        panelMisioneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMisionerosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMisionerosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMisionerosMouseExited(evt);
            }
        });

        lblMisioneros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Misioneros");

        javax.swing.GroupLayout panelMisionerosLayout = new javax.swing.GroupLayout(panelMisioneros);
        panelMisioneros.setLayout(panelMisionerosLayout);
        panelMisionerosLayout.setHorizontalGroup(
            panelMisionerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMisionerosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel5)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(panelMisionerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMisioneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMisionerosLayout.setVerticalGroup(
            panelMisionerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMisionerosLayout.createSequentialGroup()
                .addComponent(lblMisioneros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelOtros.setBackground(new java.awt.Color(255, 255, 255));
        panelOtros.setPreferredSize(new java.awt.Dimension(250, 150));
        panelOtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOtrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOtrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOtrosMouseExited(evt);
            }
        });

        lblOtros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Otros");

        javax.swing.GroupLayout panelOtrosLayout = new javax.swing.GroupLayout(panelOtros);
        panelOtros.setLayout(panelOtrosLayout);
        panelOtrosLayout.setHorizontalGroup(
            panelOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(panelOtrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOtros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOtrosLayout.setVerticalGroup(
            panelOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelZacatecano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGuadiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelSantiago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTornado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelMisioneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(panelGuadiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelSantiago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelZacatecano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMisioneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelTornado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

          private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
                    // TODO add your handling code here:
          }//GEN-LAST:event_lblCloseMouseMoved

          private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
                    // TODO add your handling code here:
                    int dialog = JOptionPane.YES_NO_CANCEL_OPTION;
                    int result = JOptionPane.showConfirmDialog(null, "Desea salir?","Exit",dialog);
                    if(result==0){
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

          private void panelGuadianaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuadianaMouseClicked
                    // TODO add your handling code here:
                    VentanaTransporte v = new VentanaTransporte(transportes.verTransporte("Guadiana Express"));
                    v.setVisible(true);
                    this.dispose();
          }//GEN-LAST:event_panelGuadianaMouseClicked

          private void panelGuadianaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuadianaMouseEntered
                    // TODO add your handling code here:
                    panelGuadiana.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelGuadianaMouseEntered

          private void panelGuadianaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuadianaMouseExited
                    // TODO add your handling code here:
                    panelGuadiana.setBorder(null);
          }//GEN-LAST:event_panelGuadianaMouseExited

          private void panelSantiagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSantiagoMouseEntered
                    // TODO add your handling code here:
                    panelSantiago.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelSantiagoMouseEntered

          private void panelSantiagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSantiagoMouseExited
                    // TODO add your handling code here:
                    panelSantiago.setBorder(null);
          }//GEN-LAST:event_panelSantiagoMouseExited

          private void panelZacatecanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelZacatecanoMouseEntered
                    // TODO add your handling code here:
                    panelZacatecano.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelZacatecanoMouseEntered

          private void panelZacatecanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelZacatecanoMouseExited
                    // TODO add your handling code here:
                    panelZacatecano.setBorder(null);
          }//GEN-LAST:event_panelZacatecanoMouseExited

          private void panelTornadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTornadoMouseEntered
                    // TODO add your handling code here:
                    panelTornado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelTornadoMouseEntered

          private void panelTornadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTornadoMouseExited
                    // TODO add your handling code here:
                    panelTornado.setBorder(null);
          }//GEN-LAST:event_panelTornadoMouseExited

          private void panelMisionerosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMisionerosMouseEntered
                    // TODO add your handling code here:
                    panelMisioneros.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelMisionerosMouseEntered

          private void panelMisionerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMisionerosMouseExited
                    // TODO add your handling code here:
                    panelMisioneros.setBorder(null);
          }//GEN-LAST:event_panelMisionerosMouseExited

          private void panelOtrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOtrosMouseEntered
                    // TODO add your handling code here:
                    panelOtros.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          }//GEN-LAST:event_panelOtrosMouseEntered

          private void panelOtrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOtrosMouseExited
                    // TODO add your handling code here:
                    panelOtros.setBorder(null);
          }//GEN-LAST:event_panelOtrosMouseExited

          private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
                    // TODO add your handling code here:
                    lblClose.setBorder(BorderFactory.createLineBorder(Color.red));
          }//GEN-LAST:event_lblCloseMouseEntered

          private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
                    // TODO add your handling code here:
                    VentanaAdministradorTordavi va = new VentanaAdministradorTordavi();
                    va.setVisible(true);
                    this.dispose();
                   
          }//GEN-LAST:event_lblRegresarMouseClicked

    private void panelSantiagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSantiagoMouseClicked
        // TODO add your handling code here:
        VentanaTransporte v = new VentanaTransporte(transportes.verTransporte("Santiago Express"));
        v.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_panelSantiagoMouseClicked

    private void panelTornadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTornadoMouseClicked
        // TODO add your handling code here:
        VentanaTransporte v = new VentanaTransporte(transportes.verTransporte("Tornado Bus"));
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelTornadoMouseClicked

    private void panelZacatecanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelZacatecanoMouseClicked
        // TODO add your handling code here:
        VentanaTransporte v = new VentanaTransporte(transportes.verTransporte("Zacatecano"));
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelZacatecanoMouseClicked

    private void panelMisionerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMisionerosMouseClicked
        // TODO add your handling code here:
        VentanaTransporte v = new VentanaTransporte(transportes.verTransporte("Misioneros"));
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelMisionerosMouseClicked

    private void panelOtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOtrosMouseClicked
        // TODO add your handling code here:
        VentanaTransporte v = new VentanaTransporte();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelOtrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblGuadiana;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMisioneros;
    private javax.swing.JLabel lblOtros;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSantiago;
    private javax.swing.JLabel lblTornado;
    private javax.swing.JLabel lblZacatecano;
    private javax.swing.JPanel panelGuadiana;
    private javax.swing.JPanel panelMisioneros;
    private javax.swing.JPanel panelOtros;
    private javax.swing.JPanel panelSantiago;
    private javax.swing.JPanel panelTornado;
    private javax.swing.JPanel panelZacatecano;
    // End of variables declaration//GEN-END:variables
}
