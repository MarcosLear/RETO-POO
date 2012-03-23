/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regalos;

/**
 *
 * @author Monchito
 */
public class Factura {
    
    private String codFactura;
    private double montoTotal;
    private String fecha;

    public Factura(String codFactura, double montoTotal, String fecha) {
        this.codFactura = codFactura;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
    }
//Alumno alumno = new Alumno(codigo, nombre, modalidad);

    Factura factura = new Factura(codFactura, montoTotal, fecha);
    
    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    public double montoTotal(){
        return 0;
    }
    
}
