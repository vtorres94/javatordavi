package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Imagen extends JPanel {

          private Image imagen;
          public   Imagen(JLabel label, String source){
                    this.setSize(label.getWidth(),label.getHeight());
                    Image img= new ImageIcon(source).getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));
                    label.setIcon(img2);
          }
          @Override
          public void paint(Graphics g) {
                    g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), null);
          }

          public void setImagen(String source) {
                    if (source != null) {
                              this.imagen = new ImageIcon(getClass().getResource(source)).getImage();
                    }
          }
}
