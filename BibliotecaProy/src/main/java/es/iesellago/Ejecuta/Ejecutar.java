/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.iesellago.Ejecuta;

import es.iesellago.DAO.relacional.ConexionMySQL;
import es.iesellago.Viewer.Principal;

/**
 *
 * @author dam
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionMySQL c = new ConexionMySQL();
        c.getConnection();
        
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    
}
