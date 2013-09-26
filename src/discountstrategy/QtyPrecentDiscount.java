/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author skaufman7
 */
public class QtyPrecentDiscount implements DiscountStrategy {
    
    private double discountRate;
    private int qtyNeededForDiscount;

    public QtyPrecentDiscount(double discountRate, int qtyNeededForDiscount) {
        this.discountRate = discountRate;
        this.qtyNeededForDiscount = qtyNeededForDiscount;
    }

    @Override
    public double getDiscount(double price, int qty) {
      if (qty >= this.qtyNeededForDiscount){
          return (price*qty)*discountRate;
      }
      else{
          return 0;
      }
    }
    
    
    
    
}
