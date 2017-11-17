package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
    protected String id;
    protected String title;
    protected int quantity;

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
    public boolean isAvailable() {
        if(this.quantity > 0){
            return true;
        } else {
            return false;
        }
    }
    
    
   

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
     public void checkout() {
        throw new UnsupportedOperationException();
    }

  /**
   * Check in an item
   */
     public void checkin() {
         throw new UnsupportedOperationException();
     }
  
    @Override
    public String toString() {
     throw new UnsupportedOperationException();
    }

  /**
   * Get the item information
   * @return item information, type-specific
   */
    public abstract String getInfo();
  
}
