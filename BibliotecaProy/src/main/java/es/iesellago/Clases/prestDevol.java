/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesellago.Clases;

import java.sql.Date;

/**
 *
 * @author dam
 */
public class prestDevol {

    private int id, idUsuario, idLibro;
    private Date fPrestamo, fDevolucion;

    public prestDevol(int id, int idUsuario, int idLibro, Date fPrestamo, Date fDevolucion) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.fPrestamo = fPrestamo;
        this.fDevolucion = fDevolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Date getfPrestamo() {
        return fPrestamo;
    }

    public void setfPrestamo(Date fPrestamo) {
        this.fPrestamo = fPrestamo;
    }

    public Date getfDevolucion() {
        return fDevolucion;
    }

    public void setfDevolucion(Date fDevolucion) {
        this.fDevolucion = fDevolucion;
    }

}
