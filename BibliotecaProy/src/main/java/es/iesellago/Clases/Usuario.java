/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesellago.Clases;

/**
 *
 * @author dam
 */
public class Usuario {

    private int id;
    private String nombre, email;
    private int estudiante;
    private int profesor;
    private int externo;

    public Usuario(int id, String nombre, String email, int estudiante, int profesor, int externo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.externo = externo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    public int getExterno() {
        return externo;
    }

    public void setExterno(int externo) {
        this.externo = externo;
    }

}
