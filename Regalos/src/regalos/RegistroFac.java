/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regalos;

import modelos.Factura;
import java.util.ArrayList;

/**
 *
 * @author Monchito
 */
public class RegistroFac  {
    
    private ArrayList<Factura> dbFactura = new ArrayList<Factura>();
    
    
    private void registroFac  (){
        
        

        this.dbFactura.add(new Factura("1012-1203220135",1350.00 , "120322"));
        this.dbFactura.add(new Factura("1012-1203220136",2350.00 , "120322"));
        this.dbFactura.add(new Factura("1012-1203220137",7600.00 , "120322"));
        this.dbFactura.add(new Factura("1012-1203220138",8000.00 , "120322"));
        this.dbFactura.add(new Factura("1012-1203220139",6970.00 , "120322"));
        this.dbFactura.add(new Factura("1012-1203220140",7650.00 , "120322"));
        this.dbFactura.add(new Factura("1012-1203220141",7650.00 , "120322"));
        
    }
    
}