/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public interface DiscountStrategy {
    
    public double getDiscount(double price, int qty);
    
    
}
