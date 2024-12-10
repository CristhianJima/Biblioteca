/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.iesellago.DAO.relacional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dam
 */
public class ConexionMySQL {

    protected Connection conexion;
    String url = "jdbc:mysql://localhost:3306/biblioteca";
    String usuario = "Admin";
    String pwd = "1234";

    public Connection getConnection() {
        try {
            conexion = (Connection) DriverManager.getConnection(url, usuario, pwd);
            System.out.println("Conexion establecida, bienvenido ");
        } catch (SQLException ex) {
            System.err.println("Error al intentar establecer la conexion " + ex.getMessage());
        }
        return conexion;
    }

    public Connection cerrarConexion() {
        try {
            this.conexion.close();
            System.out.println("Se ha cerrado correctamente la conexion");
        } catch (SQLException ex) {
            System.err.println("Error al cerra la conexion " + ex.getMessage());
        }
        return conexion;
    }
}
