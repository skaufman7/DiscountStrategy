/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class LineItem {
    
    private Product product;
    private String productId;
    private int qty;
    private double linePrice;
    private double lineDiscount;

    public LineItem(Product product, int qty) {
        
        //change this to allow the product id to be passed in and return the
        //product oject based on info in the fake db
        
        this.product = product;
        this.qty = qty;
    
    
    calcLinePrice();
    calcLineDiscount(qty,product.getPrice());
    }
       
    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }
    
private final void calcLinePrice(){
    linePrice = qty * product.getPrice();
}    
    
private final void calcLineDiscount(int qty, double price){
    lineDiscount = product.getDiscount(price, qty);
}    

    public double getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(double linePrice) {
        this.linePrice = linePrice;
    }

    public double getLineDiscount() {
        return lineDiscount;
    }

    public void setLineDiscount(double lineDiscount) {
        this.lineDiscount = lineDiscount;
    }
    
    
    
}
