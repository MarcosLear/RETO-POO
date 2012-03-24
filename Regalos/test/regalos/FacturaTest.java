/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regalos;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Monchito
 */
public class FacturaTest {
    
    public FacturaTest() {
    }
    
    @Test
    public void todasLasFacturasDebenTenerMonto(){
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
            double factura = cliente.getValor().get(aux).getMontoTotal();
            Assert.assertNotNull(factura);
        }
    }
    
    @Test
    public void lasFacturasDebenSerDeEsteMes(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Gold";
        
        String codFactura="001-21312";
        double montoTotal=500; 
        String dia="23";
        String mes="03";
        String ano="2012";
        String fecha = dia + mes + ano;
        
        String codFactura2="001-21313";
        double montoTotal2=500; 
        String dia2="23";
        String mes2="03";
        String ano2="2012";
        String fecha2 = dia2 + mes2 + ano2;
        
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        cliente.registrarFactura(codFactura2, montoTotal2, fecha2);
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        n = cliente.getCantidadFacturas();
        for (int aux= 0 ;aux<n;aux++){
            String fechafactura = cliente.getValor().get(aux).getFecha();
            
//            Date today = df.parse(fechafactura);
//            Assert.assertEquals(today.getMonth() );
//            Assert.assertEquals(d);
        }
        
    }    
    
}
    


    
    
    