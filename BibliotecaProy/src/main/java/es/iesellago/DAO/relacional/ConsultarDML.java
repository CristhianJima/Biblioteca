/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesellago.DAO.relacional;

import es.iesellago.DAO.relacional.ConexionMySQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class ConsultarDML {

    private Connection conexion;

    public ConsultarDML() {
        this.conexion = new ConexionMySQL().getConnection();
    }

    public int insertarLibro(String titulo, String Autor, String Genero, Date añoPublicacion) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;
        String consultas = "INSERT INTO libro(titulo,autor,genero,añoPublicacion) VALUES (?,?,?,?)";

        try {
            ps = conexion.prepareStatement(consultas);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de inserciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modificar " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PS " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;

    }

    public boolean updateLibro(int id, String Autor, String Genero, Date añoPublicacion) {
        PreparedStatement ps = null;
        boolean exito = false;

        String sql = "UPDATE libro SET Autor = ?, Genero = ?, añoPublicacion = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, Autor);
            ps.setString(3, Genero);
            ps.setDate(4, añoPublicacion);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarDML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int deleteLibro(int id) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;

        String consulta = "DELETE FROM libro WHERE idLibto = ?";

        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, id);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de insercciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modifica " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PreparedStatement: " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }

    public int insertarUsuario(String nombre, String email, int estudiante, int profesor, int externo) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;
        String consultas = "INSERT INTO usuarios(nombre,email,estudiante,profesor, externo) VALUES (?,?,?,?,?)";

        try {
            ps = conexion.prepareStatement(consultas);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de inserciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modificar " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PS " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }

    public boolean updateUsuario(String nombre, String email, int estudiante, int profesor, int externo) {
        PreparedStatement ps = null;
        boolean exito = false;

        String sql = "UPDATE usuarios SET nombre = ?, email = ?, estudiante = ?, profesor = ?, externo = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.setInt(3, estudiante);
            ps.setInt(4, profesor);
            ps.setInt(5, externo);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarDML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int deleteUsuario(int id) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;

        String consulta = "DELETE FROM usuario WHERE idUsuario = ?";

        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1,id);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de insercciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modifica " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PreparedStatement: " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }

    public int insertarEvento(String nombre, Date fecha, int asistentes) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;
        String consultas = "INSERT INTO evento(nombre,fecha,asistentes) VALUES (?,?,?)";

        try {
            ps = conexion.prepareStatement(consultas);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de inserciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modificar " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PS " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }

    public boolean updateEvento(String nombre, Date fecha, int asistentes) {
        PreparedStatement ps = null;
        boolean exito = false;

        String sql = "UPDATE evento SET nombre = ?, fecha = ?, asistentes = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setDate(2, fecha);
            ps.setInt(3, asistentes);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarDML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int deleteEvento(int id) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;

        String consulta = "DELETE FROM evento WHERE idEvento = ?";

        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, id);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de insercciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modifica " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PreparedStatement: " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }

    public int insertarPrestDevol(int idUsuario, int idLibro, Date fPrestamo, Date fDevolucion) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;
        String consultas = "INSERT INTO prestdevol(idUsuario,idLibro,fPrestamo,fDevolucion) VALUES (?,?,?,?)";

        try {
            ps = conexion.prepareStatement(consultas);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de inserciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modificar " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PS " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }

    public boolean updatePrestDevol(int idUsuario, int idLibro, Date fPrestamo, Date fDevolucion) {
        PreparedStatement ps = null;
        boolean exito = false;

        String sql = "UPDATE prestdevol SET Autor = ?, Genero = ?, añoPublicacion = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.setInt(2, idLibro);
            ps.setDate(3, fPrestamo);
            ps.setDate(4, fDevolucion);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarDML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int deletePrestDevol(int id) {
        PreparedStatement ps = null;
        int filasAfectadas = -1;

        String consulta = "DELETE FROM prestdevol WHERE idPrestamo = ?";

        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, id);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Numero de insercciones " + filasAfectadas);
        } catch (SQLException ex) {
            System.err.println("Error al modifica " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Conexion cerrada con exito");
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar PreparedStatement: " + ex.getMessage());
                }
            }
        }
        return filasAfectadas;
    }
}
