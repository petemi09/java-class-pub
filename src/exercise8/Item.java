package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;
  
    public Item(long id, String title, int quantity){
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
      if(this.quantity > 0){
          return true;
      }
      else {
          return false;
          
          
      }
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if(isAvailable()){
        this.quantity--;
    }
    else {
        System.out.println(" this is unavailbe at this time");
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      this.quantity--;
  }
  
  @Override
  public String toString() {
    if(isAvailable()){
        if(this.quantity == 1){
            return title + " is avilable";
        } 
        else {
            return title + " has " + quantity + " avilable";
        }
    }
  
  

  /**
   * Get the item information
   * @return item information, type-specific
   */

    public abstract String getInfo();
  
  
}
