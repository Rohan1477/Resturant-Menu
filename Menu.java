/**
 *  Menu.java
 *  @author: Rohan Shrivastava
 *  @since 1/11/23
   
   */
import java.util.*;

/**
* This class builds the menu ArrayList.
*/
public class Menu{
   ArrayList<MenuItem> apps = new ArrayList<MenuItem>();
   ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
   ArrayList<MenuItem> pasta = new ArrayList<MenuItem>();    //declares arrayLists for the sections of the menu
   ArrayList<MenuItem> rice = new ArrayList<MenuItem>();
   ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

/**
* This is the constructor for the Menu class. It builds the menu 
* ArrayList by adding all the ArrayLists of menu items.
*/
   public Menu(){
      buildApps();
      buildEntrees();
      buildPasta();
      buildRice();
      menu.addAll(apps);
      menu.addAll(entrees);
      menu.addAll(pasta);
      menu.addAll(rice);
   }

/**
* This method is used to build the apps ArrayList and add MenuItem objects to it.
*/
   private void buildApps(){
      MenuItem springRoll = new MenuItem("Spring Roll", 1, 4.95, "Crispy vegetarian spring rolls filled with cabbage, carrots, mushrooms and glass noodles", "", "V");
      apps.add(springRoll);
      MenuItem veggieRoll = new MenuItem("Vegetable Spring Roll", 2, 3.95, "Crispy vegetarian spring rolls filled with cabbage, carrots, mushrooms and glass noodles", "", "V");
      apps.add(veggieRoll);
      MenuItem stickChicken = new MenuItem("Chicken on Sticks", 3, 7.25, "Marinated chicken skewers grilled to perfection", "", "");
      apps.add(stickChicken);
      MenuItem dumplingChicken = new MenuItem("Chicken Dumplings", 4, 8.25, "Steamed or pan-fried dumplings filled with ground chicken and vegetables", "", "");
      apps.add(dumplingChicken);
      MenuItem calamari = new MenuItem("Calamari", 5, 8.25, "Lightly battered and fried calamari served with a side of marinara sauce", "", "");
      apps.add(calamari);
      MenuItem honeyWings = new MenuItem("Honey Garlic Wings", 6, 7.45, "Crispy chicken wings tossed in a sweet and garlicky sauce", "", "");
      apps.add(honeyWings);
      MenuItem lemonWings = new MenuItem("Lemon Pepper Wings", 7, 7.45, "Crispy chicken wings tossed in a tangy and zesty lemon pepper seasoning", "", "");
      apps.add(lemonWings);
   }

/**
* This method is used to build the entrees ArrayList and add MenuItem objects to it.
*/
   public void buildEntrees(){
      MenuItem mongSalmon = new MenuItem("Mongolian Salmon", 8, 22.95, "Grilled salmon in a sweet and savory sauce with scallions and ginger", "S", "");
      entrees.add(mongSalmon);
      MenuItem currySalmon = new MenuItem("Salmon Curry", 9, 23.95, "Salmon in a spicy and aromatic curry sauce with vegetables", "S", "V");
      entrees.add(currySalmon);
      MenuItem spPrawn = new MenuItem("S & P Fried Prawn", 10, 21.75, "Crispy and salty deep-fried prawns", "", "");
      entrees.add(spPrawn);
      MenuItem kpShrimp = new MenuItem("Kung Pao Shrimp", 11, 16.95, "Shrimp stir-fried with peanuts, vegetables, and spicy sauce", "S", "");
      entrees.add(kpShrimp);
      MenuItem kpChicken = new MenuItem("Kung Pao Chicken", 12, 16.95, "Chicken stir-fried with peanuts, vegetables, and spicy sauce", "S", "");
      entrees.add(kpChicken);
      MenuItem wtChicken = new MenuItem("Walnut Chicken", 13, 14.25, "Battered and fried chicken with sweet and creamy sauce and walnuts", "", "");
      entrees.add(wtChicken);
      MenuItem chChicken = new MenuItem("Cashew Chicken", 14, 14.25, "Stir-fried chicken with cashews and vegetables in a mild sauce", "", "");
      entrees.add(chChicken);
      MenuItem lemChicken = new MenuItem("Lemon Chicken", 15, 14.25, "Battered and fried chicken with tangy and sweet lemon sauce", "", "");
      entrees.add(lemChicken);
      MenuItem brChicken = new MenuItem("Broccoli Chicken", 16, 14.25, "Stir-fried chicken with broccoli and vegetables in a light sauce", "", "V");
      entrees.add(brChicken);
      MenuItem huChicken = new MenuItem("Hunan Chicken", 17, 14.25, "Spicy stir-fried chicken with vegetables and Hunan sauce", "S", "");
      entrees.add(huChicken);
   }

/**
* This method is used to build the pasta ArrayList and add MenuItem objects to it.
*/
   public void buildPasta(){
      MenuItem houseNoodles = new MenuItem("House Fried Noodles", 18, 16.75, "Egg noodles stir-fried with beef, chicken, shrimp and vegetables in brown sauce.", "", "");
      pasta.add(houseNoodles);
      MenuItem vegNoodles = new MenuItem("Vegetable Fried Noodles", 19, 13.25, "Egg noodles stir-fried with mixed vegetables in brown sauce.", "", "V");
      pasta.add(vegNoodles);
      MenuItem porkNoodles = new MenuItem("Pork Fried Noodles", 20, 15.45, "Egg noodles stir-fried with pork, vegetables in brown sauce.", "", "");
      pasta.add(porkNoodles);
      MenuItem chickenNoodles = new MenuItem("Chicken Fried Noodles", 21, 14.25, "Egg noodles stir-fried with chicken, vegetables in brown sauce.", "", "");
      pasta.add(chickenNoodles);
      MenuItem beefNoodles = new MenuItem("Beef Fried Noodles", 22, 15.75, "Egg noodles stir-fried with beef, vegetables in brown sauce.", "", "");
      pasta.add(beefNoodles);
   }
   
/**
* This method is used to build the rice ArrayList and add MenuItem objects to it.
*/  
   public void buildRice(){
      MenuItem vegRice = new MenuItem("Vegetable Fried Rice", 23, 12.25, "Fried rice with mixed vegetables and eggs.", "","V");
      rice.add(vegRice);
      MenuItem chickenRice = new MenuItem("Chicken Fried Rice", 24, 13.25, "Fried rice with chicken and eggs.", "", "");
      rice.add(chickenRice);
      MenuItem porkRice = new MenuItem("Pork Fried Rice", 25, 13.25, "Fried rice with pork and eggs.", "", "");
      rice.add(porkRice);
   }
   
   
   
}