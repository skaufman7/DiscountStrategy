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
    private String desc;
    private DiscountStrategy discount;

    public Product(String productId, double price, DiscountStrategy discount,String desc) {
        this.productId = productId;
        this.price = price;
        this.discount = discount;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
