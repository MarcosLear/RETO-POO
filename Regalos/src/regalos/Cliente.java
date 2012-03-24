/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regalos;

import java.util.ArrayList;

    
/**
 *
 * @author Monchito
 */
//public class Cliente extends Factura {
public class Cliente{
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String tipoCliente;
    
    private ArrayList<Factura> dbFactura;

    public Cliente(String dni, String nombre, String apellido, String tipoCliente) {
   //public Cliente(String dni, String nombre, String apellido, String tipoCliente, String codFactura, double montoTotal, String fecha) {
        //super(codFactura, montoTotal, fecha);
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
        dbFactura = new ArrayList<Factura>();
    }
    
    public void registrarFactura(String codFactura, double montoTotal, String fecha){
        Factura objFactura = new Factura(codFactura,montoTotal,fecha);
        dbFactura.add(objFactura);
    }
    
    public double sumaMontos(){
        double total = 0;
        for (Factura factura : dbFactura)
            total += factura.getMontoTotal();
        return total;
    }
    
    public double puntosClienteNormal(){
        double total=0;
        total=sumaMontos()/7;
        return total;
    }
    
    public double puntosClienteGold(){
        double total=0;
        if (sumaMontos()>1000){
            total=sumaMontos()/5;
        }
        return total;
    }
    
    public double millasClienteGold(){
        double total=0;
        total=sumaMontos()/10;
        return total * 100;
    }
    
    
    public double puntosClientePlatinum(){
        double total=0;
        if (sumaMontos()>3000){
            total=sumaMontos()/3;
        }
        return total;
    }
    
    public double millasClientePlatinum(){
        double total=0;
        if (sumaMontos()>1000){
            total=sumaMontos()/8;
        }
        return total * 200;
    }
    
    public double descuentoClientePlatinum(){
        double total=0;
        double totaldescuento=0;
        total=sumaMontos()/1000;
        totaldescuento=total*0.1;
        return totaldescuento;
    }
    
    
    
    public ArrayList<Factura> getValor(){
        //return dbFactura.get(1).getMontoTotal();
        return dbFactura;
    }

    public int getCantidadFacturas(){
         return dbFactura.size(); 
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
}
