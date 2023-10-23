package bookstoremanagement;
import java.util.ArrayList;
/**
 *
 * @author alyssaday
 */
public class Books extends Cart{
    private String title;
    private String artist;
    private double price;
    private static int inventory;
    
public Books(String bookTitle, String bookArtist, double bookPrice, int newInventory) {
    super(bookTitle, bookArtist, bookPrice, newInventory);
    this.title = bookTitle;
    this.artist = bookArtist;
    this.price = bookPrice;
    this.inventory = newInventory;
}
    
    
 
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static int getInventory() {
        return inventory;
    }
    
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    
    public static void decrementInventory() {
        inventory--;
    }

    

    
   


}


    
    
  
