/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regalos;

/**
 *
 * @author Monchito
 */
public class Regalos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Gold";
        
        String codFactura="001-21312";
        double montoTotal=500; 
        String fecha="23/03/2012";
        
        String codFactura2="001-21313";
        double montoTotal2=600; 
        String fecha2="23/03/2012";
        
        
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        cliente.registrarFactura(codFactura2, montoTotal2, fecha2);
        
        n = cliente.getCantidadFacturas();
        for (int aux= 0 ;aux<n;aux++){
            System.out.println(cliente.getValor().get(aux).getMontoTotal());
        }
        System.out.println(cliente.getDni()); 
    }
}
