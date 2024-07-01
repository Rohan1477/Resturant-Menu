/**
 *  MenuItem.java
 *  @author: Rohan Shrivastava
 *  @since 1/11/23
   
   */

/**

This class represents a menu item with a name, id, price, description, spice level, and a special note.

*/
public class MenuItem{


      /**
      The name of the item.
      */
      private String name;
      /**
      The ID number of the item.
      */
      private int id;
      /**
      
      The price of the item.
      */
      private double price;
      /**
      
      The description of the item.
      */
      private String desc;
      /**
      
      The level of spiciness of the item.
      */
      private String spice;
      /**
      
      Any additional notes or instructions for the item.
      */
      private String note;
   
   
/**

Constructor for MenuItem with name, id, and price. Description, spice level, and special note are set to default values of "None", "N/A", and "None", respectively.
@param tempName the name of the menu item
@param tempId the ID number of the menu item
@param tempPrice the price of the menu item
*/

  public MenuItem(String tempName, int tempId, double tempPrice){
     name = tempName;
     id = tempId;
     price = tempPrice;
     desc = "None";
     spice = "N/A";
     note = "None";
   }
   
/**

Constructor for MenuItem with name, id, price, and description. Spice level and special note are set to default values of "N/A" and "None", respectively.
@param tempName the name of the menu item
@param tempId the ID number of the menu item
@param tempPrice the price of the menu item
@param tempDisc the description of the menu item
*/

  public MenuItem(String tempName, int tempId, double tempPrice,  String tempDisc){
     name = tempName;
     id = tempId;
     price = tempPrice;
     desc = tempDisc;
     spice = "N/A";
     note = "None";
   }
   
/**

Constructor for MenuItem with name, id, price, description, spice level, and special note.
@param tempName the name of the menu item
@param tempId the ID number of the menu item
@param tempPrice the price of the menu item
@param tempDisc the description of the menu item
@param tempSpice the spice level of the menu item
@param tempNote the special note of the menu item
*/
   public MenuItem(String tempName, int tempId, double tempPrice, String tempDisc, String tempSpice, String tempNote){
      name = tempName;
      id = tempId;
      price = tempPrice;
      desc = tempDisc;
      spice = tempSpice;
      note = tempNote;  
   }
   
   
   
   
   public String getName(){
      return name;
   }
   
   public int getId(){
      return id;
   }
   
   public double getPrice(){
      return price;
   }
   
   public String getDesc(){
      return desc;
   }
   
   public String getSpice(){
      return spice;
   }
   
   public String getNote(){
      return note;
   }
   
   public void setName(String tempName) {
    name = tempName;
   }
   
   public void setId(int tempId) {
    id = tempId;
   }
   
   public void setPrice(double tempPrice) {
    price = tempPrice;
   }
   
   public void setDesc(String tempDesc) {
    desc = tempDesc;
   }
   
   public void setSpice(String tempSpice) {
    spice = tempSpice;
   }
   
   public void setNote(String tempNote) {
    note = tempNote;
   }
   
 /**

Returns a formatted string of the MenuItem object.
@return A string representation of the MenuItem object.
*/
   
   public String toString() {
    String output = "\n";
    if (id != 0) {
        output += String.format("%02d ", id);
    }
    
    if (name != null && name.length() > 0) {
        String tempOutput = String.format("%-25s ", name);
        output += name + tempOutput.substring(name.length(), 25).replace(' ', '.'); //adds ... after name
    }
    
    if (price != 0) {
        output += String.format("$%05.2f ", price);
    }
    /*
    if (desc.equals("None") == false && desc.length() > 0) {
        output += "Description: " + desc + "\n";
    }*/
    if (spice.equals("N/A") == false && spice.length() > 0) {
        output += "Spicy ";
    }
    if (note.equals("None") == false && note.length() > 0) {
        output += "Veg.";
        note ="";
    }
    
    return output.replace(",", "");
}


}