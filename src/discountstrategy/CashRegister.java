/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class CashRegister {
    
    private Receipt receipt;    
    
    
    
    public void startSale(String customerID){
    receipt = new Receipt(customerID);
        
}
    
}
