/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class StartUp {
    
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
    
        cr.startSale("002");
        cr.addItemToSale("0001", 13);
        cr.addItemToSale("0002", 7);
        cr.addItemToSale("0003", 12);
        cr.addItemToSale("0004", 9);
        cr.addItemToSale("0005", 10);
        cr.addItemToSale("0001", 8);
      
        cr.printReceipt();
    
    }
    
    
    
}
