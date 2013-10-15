/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Steve
 */
public class CashRegisterFactory {
    
     private static CashRegisterFactory instance;

    private CashRegisterFactory() {
    }
    
     public static CashRegisterFactory getInstance() {
         if(instance == null) {
            instance = new CashRegisterFactory();
         }
         return instance;
    }
    
     public CashRegister getCashRegister(){
         //while this class dosen't do much, if we had multiple types it may
         //be useful ie... maybe a tire and lube cash register vs electronics.
         CashRegister cr = new CashRegister();
         return cr;
     }
     
}
