/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class Product {
    
    private String productId;
    private double price;
    private DiscountStrategy discount;

    public Product(String productId, double price, DiscountStrategy discount) {
        this.productId = productId;
        this.price = price;
        this.discount = discount;
    }

    
    
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount(double price, int qty) {
        return discount.getDiscount(price, qty);
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
}
