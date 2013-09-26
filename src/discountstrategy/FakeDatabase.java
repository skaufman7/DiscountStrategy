/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class FakeDatabase {
    
   //create the variables 
       
   private Customer[] customers = {
       new Customer("Jack Daniels","123 ABC ST Konxville,TN 33213","001"),
       new Customer("Jim Beam","456 Apple Ave Louisville,KY 45232","002")
   
   };
   
   private Product[] products = {
       new Product("0001",12.99,new FlatAmountDiscount(2.00),"Budlight 18pk"),
       new Product("0002",3.99,new QtyPrecentDiscount(.1,2),"Lays Potato Chips"),
       new Product("0003",249.99,new FlatPrecentDiscount(.25),"Glass Patio Table"),
       new Product("0004",.99, new FlatAmountDiscount(0),"Payday Candy"),
       new Product("0005",3.33, new QtyPrecentDiscount(.5,10),"Jack's Pizza")
   };
   
   
   
   
   public Customer findCustomer(String customerID){
      Customer tempCustomer = null;
       
       
       for(Customer c : customers) {
            if(customerID.equals(c.getCustomerId())) {
               tempCustomer = c;
                break;
            }

        }
        
        return tempCustomer;
   }
   
   public Product findProduct(String productID){
       Product tempProduct = null;
       
       for(Product p: products){
           if(productID.equals(p.getProductId())){
               tempProduct = p;
               break;
           }                    
       }
       
        return tempProduct;
       
   }
   
   
   
//       private ICustomer[] customers = {
//        new Customer("100", "John Smith"),
//        new Customer("200", "Sally Jones"),
//        new Customer("300", "Bob Clementi")
//    };
   
   
   
   
    
    
    
}
