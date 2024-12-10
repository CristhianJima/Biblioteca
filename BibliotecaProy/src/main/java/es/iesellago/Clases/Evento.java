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
public class Evento {

    private int id, asistentes;
    private String nombre;
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Evento(int id, int asistentes, String nombre, Date fecha) {
        this.id = id;
        this.asistentes = asistentes;
        this.nombre = nombre;
        this.fecha = fecha;
    }

}
