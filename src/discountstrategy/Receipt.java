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
    
    private FakeDatabase db;
    private LineItem[] lineItems = new LineItem[0];
    private Customer customer;

    
    public Receipt(String customerID) {
        db = new FakeDatabase();
        customer = db.findCustomer(customerID);//validation, maybe move into a local method
        
       
        
        
    }
    
//    public void validateCustomerID(String custID) {
//        if(custID == nul)
//    }
       
        
    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//    public String getCustomerID() {
//        return customerID;
//    }
//
//    public void setCustomerID(String customerID) {
//        this.customerID = customerID;
//    }

    
   
    
    
    
    
    public void addLineItem(String productID, int qty){
        if(productID == null || productID.length() == 0 || qty < 0) {
            throw new IllegalArgumentException("All fields are required.");
        }
        
        LineItem lineitem = new LineItem(db.findProduct(productID),qty);
        
        //increase array size for line items
        //append the item to the array
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = lineitem;
        lineItems = tempItems;
        
        
    }
    
    public void outputReciept(){
        double totalCost = 0;
        
        System.out.println("Hello "+customer.getCustomerName());
        System.out.println("");
        
        for(LineItem l : lineItems){
            System.out.println(l.getProduct().getProductId()+"\t"+l.getProduct().getDesc()
                    +"\t\t"+l.getProduct().getPrice()+"\t"+l.getQty()+"\t"+l.getLineDiscount()
                    +"\t"+l.getLinePrice());
            System.out.println("");
            
         totalCost += l.getLinePrice();
        }
        System.out.println("Grand Total: "+totalCost);
    }
    
    
}
