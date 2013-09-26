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
    
    public void addItemToSale(String productID,int qty){
    
        receipt.addLineItem(productID, qty);
        
}
   public void printReceipt(){
       receipt.outputReciept();
   }
    
}
