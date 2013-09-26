/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class FlatAmountDiscount implements DiscountStrategy {
    
    private double discountAmount;

    public FlatAmountDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    } 
   
    public double getDiscountAmount(double price, int qty) {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double getDiscount(double price, int qty) {
        return discountAmount;
    }


    
    
    
    
}
