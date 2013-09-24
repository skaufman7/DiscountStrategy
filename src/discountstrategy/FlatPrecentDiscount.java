/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class FlatPrecentDiscount implements DiscountStrategy {
    
    private double discountRate;

    public FlatPrecentDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscount(double price, int qty) {
        return (qty *price)* discountRate;
    }
    
    
    
    
    
}
