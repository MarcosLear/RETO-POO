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
public class RegistroFac {
    
    private ArrayList<Factura> dbFactura = new ArrayList<Factura>();
    
    private void registroFac(double montoTotal){
        
// this.dbUsuarios.add(new Usuario("dni", "nombre"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbFactura.add(new Factura("1012-1203220135", montoTotal, "120322"));
        
    }
    
}
