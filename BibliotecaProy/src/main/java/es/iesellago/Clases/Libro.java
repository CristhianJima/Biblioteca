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
public class Libro {

    private int id;
    private String titulo, Autor, Genero;
    private Date añoPublicacion;

    public Libro(int id, String titulo, String Autor, String Genero, Date añoPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.Autor = Autor;
        this.Genero = Genero;
        this.añoPublicacion = añoPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Date getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(Date añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    
}
