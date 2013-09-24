/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class Customer {
    
    private String customerName;
    private String customerAddress;
    private String customerId;

    public Customer(String customerName, String customerAddress, String customerId) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerId = customerId;
    }
   
    
    
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    
    
    
}
