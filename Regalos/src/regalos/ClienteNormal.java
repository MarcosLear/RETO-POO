/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regalos;

/**
 *
 * @author User
 */
public class ClienteNormal extends Cliente{
    private int variable=7;

    public ClienteNormal(int puntos, String dni, String nombre, String apellido, String tipoCliente) {
        super(dni, nombre, apellido, tipoCliente);
        tipoCliente="Normal";
    }
    

    
    public double puntosClienteNormal(){
        double total=0;
        total=sumaMontos()/variable;
        return total;
    }
//    
}
