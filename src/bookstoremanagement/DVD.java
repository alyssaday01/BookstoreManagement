package bookstoremanagement;
import java.util.*;
/**
 *
 * @author alyssaday
 */
public class DVD extends Cart{
    private String title;
    private String artist;
    private double price;
    private static int inventory;
    
    public DVD(String dvdTitle, String dvdArtist, double dvdPrice, int newInventory) {
        super(dvdTitle, dvdArtist, dvdPrice, newInventory);
        this.title = dvdTitle;
        this.artist = dvdArtist;
        this.price = dvdPrice;
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
