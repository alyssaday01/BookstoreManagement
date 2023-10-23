package bookstoremanagement;
import java.util.*;
/**
 *
 * @author alyssaday
 */
public class Cart{
    
    private String title;
    private String artist;
    private double price;
    private static int inventory;
    
    public Cart(String title, String artist, double price, int newInventory) {
    this.title = title;
    this.artist = artist;
    this.price = price;
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

    
    
    
}
