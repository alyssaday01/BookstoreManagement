package bookstoremanagement;
import java.util.*;
/**
 *
 * @author alyssaday
 */
public class CD extends Cart {
    private String title;
    private String artist;
    private double price;
    private static int inventory;
    
public CD(String cdTitle, String cdArtist, double cdPrice, int newInventory) {
    super(cdTitle, cdArtist, cdPrice, newInventory);
    this.title = cdTitle;
    this.artist = cdArtist;
    this.price = cdPrice;
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
    
    private static void decrementInventory() {
        inventory--;
        
    } 

    

    
}
