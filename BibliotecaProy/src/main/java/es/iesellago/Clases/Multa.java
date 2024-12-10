/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesellago.Clases;

/**
 *
 * @author dam
 */
public class Multa {
    private int idMulta;
    private double Monto;

    public Multa(int idMulta, double Monto) {
        this.idMulta = idMulta;
        this.Monto = Monto;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
}
