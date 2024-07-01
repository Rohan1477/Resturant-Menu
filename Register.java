/**
 *  Register.java
 *  @author: Rohan Shrivastava
 *  @since 1/11/23
   
   */

import java.text.DecimalFormat;
import java.util.*;

      /**
      
      The Register class represents calculates the subtotal, tax, tip, and total of an order as well as generating the receipt.
      */
      public class Register{
      /**
      Represents the sub-total amount of the items in the order.
      */
      public Double subTotal = 0.0;
      /**
      
      Represents the tax amount to be applied to the order.
      */
      public Double taxNum = 0.0;
      /**
      
      Represents the tip amount to be added to the order.
      */
      public Double tip = 0.0;
      /**
      
      Represents the total amount of the order, including tax and tip.
      */
      public Double total = 0.0;

      DecimalFormat df = new DecimalFormat("0.00");    //sets decimal format
/**
* Calculates the subtotal of an order by summing up the prices of all items in the tab list.
* @param tab the list of items in the order
*/
   public void calcSubTotal(ArrayList<MenuItem> tab){
      for (MenuItem a: tab){
         subTotal += a.getPrice();
      }
      subTotal = Math.round(subTotal* 100.0) / 100.0;
   }

/**
* Calculates the tax amount of an order based on the subtotal.
*/
   public void calcTax(){
      taxNum = Math.round(subTotal *.08 * 100.0) / 100.0;
   }

/**
* Calculates the tip amount of an order by prompting the user to enter a percentage or a set amount.
*/
   public void calcTip(){
      Scanner input = new Scanner(System.in);
      System.out.println("Subtotal: $" + df.format(subTotal));
      System.out.println("Tax: $" + df.format(taxNum));
      boolean isDone5 = false; //variable that controls while loops
      while (isDone5 == false){
         System.out.print("Tip? (Type a decimal for a percentage of the subtotal or type a number for a set amount)\n");
         try {
             double userInput = input.nextDouble();
             if (userInput >= 1.0) {
                 tip = userInput;                   //lets user input set amount for tip
                 isDone5 = true;
             } else if (userInput > 0.0) { 
                 tip = subTotal * userInput;        //lets user input percantage for tip
                 isDone5 = true;
             } else {
                 System.out.println("Invalid input. Tip must be greater than or equal to 0."); // Checks to make sure user inputs correct type of input
             }
         } catch (InputMismatchException e) {
             System.out.println("Invalid input type. Please enter a number.");
             input.nextLine();
         } 
      }
      tip =  (tip);
   }

/**
* Calculates the total amount of an order by summing up the subtotal, tax, and tip.
*/
   public void calcTotal(){
      total = Math.round((taxNum + tip + subTotal) * 100.0) / 100.0;
      total = total;
   }

/**
Generates a receipt with the given menu items and prints it.
@param tab an ArrayList of MenuItem objects representing the items on the customer's order
*/
   public void generateReceipt(ArrayList<MenuItem> tab){
         String restaurantName = "CHIN CHIN";
         String address = "270 Rucker Road, Suite 115 Alpharetta, GA 30004"; //initializes variables that can be used later
         String phone = "Phone: (770) 569-9883";
         
         int totalWidth = 80;
         int nameWidth = restaurantName.length();
         int addressWidth = address.length();     //sets var equal to length of input 
         int phoneWidth = phone.length();
         
         int namePadding = (totalWidth - nameWidth) / 2;
         int addressPadding = (totalWidth - addressWidth) / 2;
         int phonePadding = (totalWidth - phoneWidth) / 2;        //determines the amount of padding needed to center the text
         int itemPadding = (totalWidth - 31) / 2;
         int aPadding = (totalWidth - 28) / 2;

         
   
         System.out.print("\n" + padString(namePadding, restaurantName));
         System.out.println();
         

         System.out.print(padString(addressPadding, address));
         System.out.println();
         
         System.out.print(padString(phonePadding, phone));
         System.out.println("\n");        
         String tempOutput;
         
        for (MenuItem a: tab){
            tempOutput = String.format("%-25s ", a.getName());  
            System.out.println(padString(itemPadding, a.getName() + tempOutput.substring(a.getName().length(), 25).replace(' ', '.') + String.format("$%05.2f ", a.getPrice()))); //does padding for each item
        }
        System.out.println();
        System.out.printf("\n                 Subtotal:     $" + df.format(subTotal));
        System.out.printf("\n                 Tax:          $" + df.format(taxNum));
        System.out.printf("\n                 Tip:          $" + df.format(tip));
        System.out.printf("\n                 Total:        $" + df.format(total));
        System.out.println("\n\n" + padString(aPadding, "Thank you for your business!"));
    
   
   
   }

/**

Pads a string with spaces on either side to a specified length.
@param length the total desired length of the padded string (including the original string)
@param str the original string to be padded with spaces
@return the padded string
*/
   private static String padString(int length, String str) {
       StringBuilder sb = new StringBuilder();
       
       for (int i = 0; i < length; i++) {
           sb.append(" ");
       }
       sb.append(str);
       for (int i = 0; i < length; i++) {
           sb.append(" ");
       }
       
       return sb.toString();
   }
     
}