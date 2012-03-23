/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Monchito
 */
public class Cliente {

    private String dni;
    private String nombre;
    private String apellido;
    private String tipoCliente;

    public Cliente(String dni, String nombre, String apellido, String tipoCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
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
