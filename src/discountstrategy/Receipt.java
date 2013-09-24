/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class Receipt {
    
    private LineItem[] lineItems[];
    private Customer customer;
    private String customerID;
    static int lineItemIndex; //counts the total number of line items that the
                              //recipt object has.
    
    
    public Receipt(String customerID) {
        this.customerID = customerID;
        //connect to fakeDB and get customer object based on this id
        
        
        
    }
       
        
    public LineItem[][] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[][] lineItems) {
        this.lineItems = lineItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

 
   
    
    
    
    
    
    
    
    private void addLineItem(String productID, int qty){
        
        
        
    }
    
    private void outputReciept(){
        //display all of the line items subtotals ect
        //maybe move into a new class
    }
    
    
}
