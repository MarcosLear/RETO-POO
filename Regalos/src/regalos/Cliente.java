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
    private String dni;
    private String nombre;
    private String apellido;
    private String tipoCliente;
    
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
