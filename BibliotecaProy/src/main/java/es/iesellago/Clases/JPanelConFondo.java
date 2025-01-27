/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesellago.Clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author dam
 */
public class JPanelConFondo extends JPanel{
        private Image imagen;
    public void setImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(
                   getClass().getResource(nombreImagen)
                   ).getImage();
        } else {
            imagen = null;
        }
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                              this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g);
    }
 
}
