/**
 *  Order.java
 *  @author: Rohan Shrivastava
 *  @since 1/11/23
   */

import java.util.*;
/**
Prompts the user to add or remove menu items from the order.
*/

public class Order {
   public ArrayList<MenuItem> tab = new ArrayList<MenuItem>();
   
/**
* Removes a specified number of items from the tab using ID number. Prompts the user to enter the item number and how many of that item to remove.
* @param tab The ArrayList of MenuItems representing the current order.
*/
   static void removeItem(ArrayList<MenuItem> tab){
      Scanner input = new Scanner(System.in);
      Menu men = new Menu();
      boolean isDone3 = false;
      int orderNum2;
      int times;

      while (!isDone3) {
         System.out.print("Input the number of the item you would like to remove. Checkout: -1.\n");

         try {
            orderNum2 = input.nextInt();
         } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter an integer.");  // Checks to make sure user inputs correct type of input
            input.nextLine(); 
            continue;
         }

         if (orderNum2 != -1) {
            System.out.print("How many of that item do you want to remove?\n"); 

            try {
               times = input.nextInt();
            } catch (InputMismatchException e) {
               System.out.println("Invalid input type. Please enter an integer."); // Checks to make sure user inputs correct type of input
               input.nextLine(); 
               continue;
            }
            for (int j = 0; j < times; j++) {
            for (int i = 0; i < tab.size(); i++) {
               MenuItem item = tab.get(i);
               if (orderNum2 == item.getId()) {
                     tab.remove(i);                 //removes an item with that ID # the amount of times the user chooses
                  }
                  break;
               }
            }
         } else {
            isDone3 = true;
         }
      }
   }

/**
Prompts the user to select menu items and allows them to add or remove items from the order.
*/

   public Order() {
      Scanner input = new Scanner(System.in);
      Menu men = new Menu();
      System.out.print(men.apps.toString().replace("[","").replace("]",""));
      System.out.print(men.entrees);                   //prints out the menu
      System.out.print(men.pasta);
      System.out.print(men.rice + "\n\n");

      int orderNum = -1;
      boolean isDone = false;
      boolean isDone2 = false; //variables that control while loops
      String output = "";

      while (!isDone) {
         if (!isDone2) {
            System.out.print("Type # of item you want to order. Checkout: -1. Item Desc: Item # + 100\n");
            
         while (true) {
             try {
                 orderNum = input.nextInt();
                 if ((orderNum >= -1 && orderNum <= 25) || (orderNum >= 101 && orderNum <= 125)) {
                     break; // valid input, exit loop
                 } else {
                     System.out.println("The number you entered does not correspond to anything. Please enter another number."); // Checks to make sure user inputs correct type of input
                 }
             } catch (InputMismatchException e) {
                 System.out.println("Invalid input type. Please enter an integer.");   // Checks to make sure user inputs correct type of input
             }
             input.nextLine();
         }
         
         if (orderNum != -1) {
            for (MenuItem a : men.menu) {
               if (orderNum == a.getId()) { //add the item to the menu
                  tab.add(a);
               
                  if(a.getSpice().length() > 0){
                     System.out.println("Type yes, if you want that to be spicy.");
                     String ans = input.next();   
                     if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){  //if item has spicy option, checks if user wants spicy
                        tab.get(tab.size()-1).setName( "Spicy " + tab.get(tab.size()-1).getName());
                     }
                     tab.get(tab.size()-1).setSpice("");
                  }
               }             
               if (orderNum == a.getId() + 100) {
                  System.out.print(a.getName() + ": " + a.getDesc() + "\n"); //Prints out description
               }
            }
         }
         else {
            System.out.print("\n" + tab + "\n");
            System.out.print("Do you want to add/remove anything before checking out? (a/r) \n");    //asks if the user wants to make any changes before checkingout
            output = input.next();

            if (output.equalsIgnoreCase("y") || output.equalsIgnoreCase("yes") || output.equalsIgnoreCase("a")) {
               isDone = false;
            } else if (output.equalsIgnoreCase("r") || output.equalsIgnoreCase("r")) { 
               isDone = false;
               removeItem(tab); //calls removeItem method if user wants to remove something
               isDone = true;
               System.out.print(tab + "\n");
            } else {
               isDone = true;
            }
         }
      }
   }
  }
}
