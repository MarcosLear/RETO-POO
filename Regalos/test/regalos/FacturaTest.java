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
    
    @Test
    public void puntosParaLosClientesNormales(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Normal";
        
        String codFactura="001-21312";
        double montoTotal=700; 
        String fecha = "03/03/2012";
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        
        double retornado=cliente.puntosClienteNormal();
        Assert.assertEquals(100, retornado,1);
    }
    
    @Test
    public void puntosParaLosClientesGold(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Gold";
        
        String codFactura="001-21312";
        double montoTotal=5000; 
        String fecha = "03/03/2012";
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        
        double retornado=cliente.puntosClienteGold();
        Assert.assertEquals(1000, retornado,1);
    }
    
     @Test
    public void puntosParaLosClientesPlatinum(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Platinum";
        
        String codFactura="001-21312";
        double montoTotal=6000; 
        String fecha = "03/03/2012";
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        
        double retornado=cliente.puntosClientePlatinum();
        Assert.assertEquals(2000, retornado,1);
    }
     
    @Test
    public void millasParaClienteGold(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Gold";
        
        String codFactura="001-21312";
        double montoTotal=1000; 
        String fecha = "03/03/2012";
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        
        double retornado=cliente.millasClienteGold();
        Assert.assertEquals(10000, retornado,1);
    }
         
    @Test
    public void millasParaClientePlatinum(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Gold";
        
        String codFactura="001-21312";
        double montoTotal=2000; 
        String fecha = "03/03/2012";
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        
        double retornado=cliente.millasClientePlatinum();
        Assert.assertEquals(50000, retornado,1);
    }         

    @Test
    public void descuentoParaClientePlatinum(){
        int n = 0;
        String dni = "44422807";
        String nombre = "Marcos";
        String apellido = "Levano";
        String tipoCliente = "Gold";
        
        String codFactura="001-21312";
        double montoTotal=1000; 
        String fecha = "03/03/2012";
        Cliente cliente =  new Cliente(dni, nombre, apellido, tipoCliente) ;
        cliente.registrarFactura(codFactura, montoTotal, fecha);
        
        double retornado=cliente.descuentoClientePlatinum();
        Assert.assertEquals(0.1, retornado,0);
    }
}
    


    
    
    