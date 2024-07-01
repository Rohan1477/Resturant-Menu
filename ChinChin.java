/**
 *  ChinChin.java
 *  @author: Rohan Shrivastava
 *  @since 1/11/23
 *  Ryan is my tester
   */



import java.util.*;

/**
Runs the rest of the classes. Special Feature: Reciept format. (code is at end of order class) and toString of MenuItem uses String.format()
*/
public class ChinChin{
   
      
   public static void main(String [] args){
      
      Order order = new Order();      
      
      Register register = new Register();
      
      register.calcSubTotal(order.tab);
      register.calcTax();
      register.calcTip();
      register.calcTotal();
      register.generateReceipt(order.tab);
   }
   
}